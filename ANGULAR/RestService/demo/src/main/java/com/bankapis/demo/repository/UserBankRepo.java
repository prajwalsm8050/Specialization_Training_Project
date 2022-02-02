package com.bankapis.demo.repository;

import com.bankapis.demo.model.UserBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBankRepo extends JpaRepository<UserBank , Long> {

}
