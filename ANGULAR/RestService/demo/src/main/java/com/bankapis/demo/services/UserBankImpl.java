package com.bankapis.demo.services;

import com.bankapis.demo.model.User;
import com.bankapis.demo.repository.UserBankRepo;
import com.bankapis.demo.repository.UserRepo;
import com.bankapis.demo.serviceInter.UserBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBankImpl implements UserBank {

    @Autowired
    UserBankRepo userBankRepo;


    @Override
    public List<UserBank> listAllBanks() {
        return null;
    }
}
