package com.bankapis.demo.serviceInter;

import com.bankapis.demo.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> listUser();

    List<User> findByEmail(String email);

    List<User> deleteUser(long id);



}
