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
@Table(name = "cards")
public class Cards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "card_number", length = 70)
    private String cardNumber;

    @Column(name = "card_type", length = 20)
    private String cardType;

    @Column(name = "total_limit", length = 100)
    private String totalLimit;

    @Column(name = "amount_used", length = 100)
    private String amountUsed;

    @Column(name = "available_amount", length = 100)
    private String availableAmount;

    @Column(name = "create_date")
    private Date createdDate;

}
