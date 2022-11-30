package com.full.springsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "account_transaction")
public class AccountTransaction {
    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "account_number", length = 16)
    private String accountNumber;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "transaction_date", length = 10)
    private Date transactionDate;

    @Column(name = "transaction_summary")
    private String transactionSummary;

    @Column(name = "transaction_type", length = 20)
    private String transactionType;

    @Column(name = "transaction_amount", length = 80)
    private String transactionAmount;

    @Column(name = "closing_balance", length = 80)
    private String closingBalance;

    @Column(name = "created_date", length = 10)
    private Date createdDate;
}
