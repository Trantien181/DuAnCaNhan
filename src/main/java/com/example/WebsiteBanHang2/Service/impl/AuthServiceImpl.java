package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.RegisterRequestDTO;
import com.example.WebsiteBanHang2.Model.CustomerInfo;
import com.example.WebsiteBanHang2.Model.UserAccount;
import com.example.WebsiteBanHang2.Repository.CustomerInfoRepository;
import com.example.WebsiteBanHang2.Repository.UserAccountRepository;
import com.example.WebsiteBanHang2.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    UserAccountRepository userAccountRepository;

    @Autowired
    CustomerInfoRepository customerInfoRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserAccount registerUser(RegisterRequestDTO dto) {
        if(userAccountRepository.findByEmail(dto.getEmail()) != null){
            throw new RuntimeException("Email đã được sử dụng");
        }
        UserAccount userAccount = new UserAccount();
        userAccount.setEmail(dto.getEmail());
        userAccount.setPassword(passwordEncoder.encode(dto.getPassword()));
        userAccount.setRole(UserAccount.Role.CUSTOMER);
        UserAccount saved = userAccountRepository.save(userAccount);

        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setUserId();
    }
}
