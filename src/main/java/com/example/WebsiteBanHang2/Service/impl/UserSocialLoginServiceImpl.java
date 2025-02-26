package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.UserSocialLoginDTO;
import com.example.WebsiteBanHang2.Model.UserSocialLogin;
import com.example.WebsiteBanHang2.Repository.UserAccountRepository;
import com.example.WebsiteBanHang2.Repository.UserSocialLoginRepository;
import com.example.WebsiteBanHang2.Service.UserSocialLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSocialLoginServiceImpl implements UserSocialLoginService {
    @Autowired
    UserSocialLoginRepository userSocialLoginRepository;

    @Override
    public List<UserSocialLoginDTO> getList() {
        return userSocialLoginRepository.findAll();
    }

    @Override
    public UserSocialLoginDTO getUserSocialLoginById(Integer id) {
        return userSocialLoginRepository.findById(id).orElse(null);
    }

    @Override
    public UserSocialLoginDTO createEndUpdateUserSocialLogin(UserSocialLoginDTO userSocialLoginDTO) {
        return userSocialLoginRepository.save(userSocialLoginDTO);
    }

    @Override
    public void deleteUserSocialLogin(Integer id) {
        UserSocialLoginDTO userSocialLoginDTO = userSocialLoginRepository.findById(id).orElse(null);
        if(userSocialLoginDTO != null){
            userSocialLoginRepository.delete(userSocialLoginDTO);
        }else{

        }
    }
}
