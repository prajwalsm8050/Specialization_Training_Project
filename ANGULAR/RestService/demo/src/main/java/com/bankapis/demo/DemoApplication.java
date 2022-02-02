package com.bankapis.demo;

import com.bankapis.demo.model.User;
import com.bankapis.demo.model.UserBank;
import com.bankapis.demo.repository.UserRepo;
import com.bankapis.demo.serviceInter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Autowired
	private UserRepo userRepo;


//	@Override
//	public void run(String... args) throws Exception
//	{
//		User user = new User();
//		user.setFirstname("Prajwal");
//		user.setLastname("Shivapurmath");
//		user.setEmail("prajwal@gmail.com");
//		user.setAdhar(12345678900L);
//		user.setDob(LocalDate.of(1999,06,11));
//
//		UserBank userbank = new UserBank();
//		userbank.setAccountnumber(8050122312L);
//		userbank.setAccounttype("Savings Account");
//		userbank.setBankbranch("Bangalore");
//
//		user.setUserbank(userbank);
//		userbank.setUser(user);
//
//		userRepo.save(user);
//	}
}
