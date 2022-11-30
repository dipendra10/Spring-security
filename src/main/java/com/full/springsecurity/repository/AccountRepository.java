package com.full.springsecurity.repository;

import com.full.springsecurity.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    Account findByCustomerId(Integer customerId);
}
