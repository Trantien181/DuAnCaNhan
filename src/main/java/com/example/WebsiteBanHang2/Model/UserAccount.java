package com.example.WebsiteBanHang2.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "user_account")
public class UserAccount {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private Role role;

    @Column(name = "status")
    private Byte status;

    @Column(name = "last_login")
    private LocalDate lastLogin;

    @Column(name = "created_at")
    private LocalDate createdAt;

    public enum Role {
        ADMIN, STAFF, CUSTOMER
    }
}
