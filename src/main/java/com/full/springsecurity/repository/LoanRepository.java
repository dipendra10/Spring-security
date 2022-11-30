package com.full.springsecurity.repository;

import com.full.springsecurity.entity.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loans,Long> {

    List<Loans> findByCustomerIdOrderByStartDateDesc(int customerId);

}
