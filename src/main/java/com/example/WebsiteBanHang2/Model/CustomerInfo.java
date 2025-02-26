package com.example.WebsiteBanHang2.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_info")
public class CustomerInfo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birth_date")
    private java.sql.Date birthDate;

    @Column(name = "address")
    private String address;

}
