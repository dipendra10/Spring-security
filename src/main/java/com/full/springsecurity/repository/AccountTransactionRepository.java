package com.full.springsecurity.repository;

import com.full.springsecurity.entity.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction,String> {

    List<AccountTransaction> findByCustomerIdOrderByTransactionDateDesc(Integer customerId);

}
