package com.example.WebsiteBanHang2.Dto;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;
@Data
public class UserAccountDTO {
    private Integer id;
    private String email;
    private String password;
    private String role;
    private Byte status;
    private LocalDate lastLogin;
    private LocalDate createdAt;
}
