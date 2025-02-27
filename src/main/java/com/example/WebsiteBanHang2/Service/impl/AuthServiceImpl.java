package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Model.LoginForm;
import com.example.WebsiteBanHang2.Model.RegisterRequest;
import com.example.WebsiteBanHang2.Model.CustomerInfo;
import com.example.WebsiteBanHang2.Model.UserAccount;
import com.example.WebsiteBanHang2.Repository.CustomerInfoRepository;
import com.example.WebsiteBanHang2.Repository.UserAccountRepository;
import com.example.WebsiteBanHang2.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    UserAccountRepository userAccountRepository;

    @Autowired
    CustomerInfoRepository customerInfoRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public void register(RegisterRequest form) {
        if (userAccountRepository.findByEmail(form.getEmail()) != null) {
            throw new RuntimeException("Email đã được sử dụng!");
        }
        UserAccount user = new UserAccount();
        user.setEmail(form.getEmail());
        user.setPassword(passwordEncoder.encode(form.getPassword()));
        user.setFirstName(form.getFirstName());
        user.setLastName(form.getLastName());
        user.setRole("CUSTOMER");
        UserAccount savedUser = userAccountRepository.save(user);

        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setUserId(savedUser);
        customerInfo.setPhone(form.getPhone());
        customerInfo.setAddress(form.getAddress());
        customerInfoRepository.save(customerInfo);
    }

    @Override
    public UserAccount login(LoginForm form) {
        UserAccount user = userAccountRepository.findByEmail(form.getEmail());
        if (user == null || !passwordEncoder.matches(form.getPassword(), user.getPassword())) {
            throw new RuntimeException("Email hoặc mật khẩu không đúng!");
        }
        user.setLastLogin(LocalDate.now());
        userAccountRepository.save(user);
        return user;
    }
}
