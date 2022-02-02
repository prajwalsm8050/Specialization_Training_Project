package com.bankapis.demo.controller;

import com.bankapis.demo.model.User;
import com.bankapis.demo.repository.UserRepo;
import com.bankapis.demo.serviceInter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bank/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {


    @Autowired
    private UserService userService;


    @Autowired
    private UserRepo userRepo;


    @Autowired
    private UserRepo userBankrepo;


    @PostMapping("/saveUser")
    public ResponseEntity<User> registerUser(@RequestBody User user)
    {
        return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
    }


    //list ALL  users
    @GetMapping("/listUsers")
    public List<User> listAllUser(){
        return userRepo.findAll();
    }


    //find By Email
    @GetMapping("/findbyemail/{email}")
    public List<User> finduser(@PathVariable String email ) {
        return userService.findByEmail(email);
    }


    @DeleteMapping("/cancelRegister/{id}")
    public List<User> deleteUser(@PathVariable long id)
    {
        userService.deleteUser(id);
        return  userService.listUser();
    }


    @PutMapping("/UpdateUser/{id}")
    public  ResponseEntity<User> updateUser( @PathVariable Long id,@RequestBody User user){
        Optional<User> useroptional = userRepo.findById(id);
        if(!useroptional.isPresent())
        {
            return ResponseEntity.notFound().build();
        }
        user.setId(id);
        userRepo.save(user);
        return ResponseEntity.noContent().build();
    }



    @GetMapping("/getUser/{id}")
    public Optional<User> getUser(@PathVariable Long id)
    {
        return userRepo.findById(id);
    }

}
