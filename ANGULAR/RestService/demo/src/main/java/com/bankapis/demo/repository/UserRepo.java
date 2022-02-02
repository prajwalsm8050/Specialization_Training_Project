package com.bankapis.demo.repository;

import com.bankapis.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {


    List<User> findByEmail(String email);
}
