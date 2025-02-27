package com.example.WebsiteBanHang2.Dto;

import java.sql.Timestamp;
import java.time.LocalDate;

public class RefreshTokenDTO {
    private Integer id;
    private Integer userId;
    private String token;
    private LocalDate expiryDate;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
    }
}
