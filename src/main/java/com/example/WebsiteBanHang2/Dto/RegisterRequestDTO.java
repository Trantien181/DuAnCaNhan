package com.example.WebsiteBanHang2.Dto;

import lombok.Data;

@Data
public class RegisterRequestDTO {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
}
