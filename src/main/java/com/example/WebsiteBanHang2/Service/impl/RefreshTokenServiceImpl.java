package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.RefreshTokenDTO;
import com.example.WebsiteBanHang2.Repository.RefreshTokenRepository;
import com.example.WebsiteBanHang2.Service.RefreshTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefreshTokenServiceImpl implements RefreshTokenService {
    @Autowired
    RefreshTokenRepository refreshTokenRepository;
    @Override
    public List<RefreshTokenDTO> getList() {
        return refreshTokenRepository.findAll();
    }

    @Override
    public RefreshTokenDTO getRefreshTokenById(Integer id) {
        return refreshTokenRepository.findById(id).orElse(null);
    }

    @Override
    public RefreshTokenDTO createEndUpdateRefreshToken(RefreshTokenDTO refreshTokenDTO) {
        return refreshTokenRepository.save(refreshTokenDTO);
    }

    @Override
    public void deleteRefreshToken(Integer id) {
        RefreshTokenDTO refreshTokenDTO = refreshTokenRepository.findById(id).orElse(null);
        if(refreshTokenDTO != null){
            refreshTokenRepository.delete(refreshTokenDTO);
        }
        else {

        }
    }
}
