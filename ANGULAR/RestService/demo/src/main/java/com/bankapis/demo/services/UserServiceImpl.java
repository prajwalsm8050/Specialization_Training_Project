package com.bankapis.demo.services;

import com.bankapis.demo.model.User;
import com.bankapis.demo.repository.UserRepo;
import com.bankapis.demo.serviceInter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> listUser() {
       return  userRepo.findAll();
    }


    @Override
    public List<User> findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public List<User> deleteUser(long id) {
        userRepo.deleteById(id);
        return userRepo.findAll();
    }




}
