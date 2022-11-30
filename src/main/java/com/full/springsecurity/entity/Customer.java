package com.full.springsecurity.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password", length = 30)
    private String password;

    @Column(name = "mobile_number", length = 50)
    private String mobileNumber;

    @Column(name = "create_date", length = 10)
    private String createdDate;

    @Column(name = "role", length = 20)
    private String role;

    @JsonIgnore
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private Set<Authority> authorities;
}
