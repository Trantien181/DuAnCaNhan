package com.example.WebsiteBanHang2.Service;

import com.example.WebsiteBanHang2.Dto.RegisterRequestDTO;
import com.example.WebsiteBanHang2.Model.UserAccount;

public interface AuthService {
    public UserAccount registerUser(RegisterRequestDTO dto);
}
