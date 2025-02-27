package com.example.WebsiteBanHang2.Controller;

import com.example.WebsiteBanHang2.Dto.RegisterRequestDTO;
import com.example.WebsiteBanHang2.Model.UserAccount;
import com.example.WebsiteBanHang2.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequestDTO dto) {
        UserAccount userAccount = authService.registerUser(dto);
        return "Auth/Register";
    }
}
