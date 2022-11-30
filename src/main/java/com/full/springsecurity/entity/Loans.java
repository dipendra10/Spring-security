package com.full.springsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "loans")
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_number")
    private Long loanNumber;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "loan_type", length = 20)
    private String loanType;

    @Column(name = "total_loan", length = 80)
    private String totalLoan;

    @Column(name = "amount_paid", length = 80)
    private String amountPaid;

    @Column(name = "out_standing_name", length = 80)
    private String outStandingAmount;

    @Column(name = "create_date", length = 10)
    private Date createdDate;
}
