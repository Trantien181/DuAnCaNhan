package com.example.WebsiteBanHang2.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "refresh_token")
public class RefreshToken {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "token")
    private String token;

    @Column(name = "expiry_date")
    private java.sql.Timestamp expiryDate;


}
