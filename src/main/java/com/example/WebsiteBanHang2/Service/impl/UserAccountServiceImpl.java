package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.UserAccountDTO;
import com.example.WebsiteBanHang2.Repository.UserAccountRepository;
import com.example.WebsiteBanHang2.Service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {
    @Autowired
    UserAccountRepository userAccountRepository;

    @Override
    public List<UserAccountDTO> getList() {
        return userAccountRepository.findAll();
    }

    @Override
    public UserAccountDTO getUserAccountById(Integer id) {
        return userAccountRepository.findById(id).orElse(null);
    }

    @Override
    public UserAccountDTO createEndUpdateUserAccount(UserAccountDTO accountDTO) {
        return userAccountRepository.save(accountDTO);
    }

    @Override
    public void deleteUserAccount(Integer id) {
        UserAccountDTO userAccountDTO = userAccountRepository.findById(id).orElse(null);
        if(userAccountDTO != null){
            userAccountRepository.delete(userAccountDTO);
        }else{

        }
    }
}
