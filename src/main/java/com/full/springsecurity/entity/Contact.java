package com.full.springsecurity.entity;

import lombok.AllArgsConstructor;
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
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    private String id;

    @Column(name = "contact_name", length = 50)
    private String contactName;

    @Column(name = "contact_email", length = 50)
    private String contactEmail;

    @Column(name = "subject", length = 200)
    private String subject;

    @Column(name = "message")
    private String message;

    @Column(name = "created_date", length = 10)
    private Date createdDate;
}
