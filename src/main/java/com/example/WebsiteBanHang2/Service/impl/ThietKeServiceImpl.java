package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.ThietKeDTO;
import com.example.WebsiteBanHang2.Repository.ThietKeRepository;
import com.example.WebsiteBanHang2.Service.ThietKeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThietKeServiceImpl implements ThietKeService {
    @Autowired
    ThietKeRepository thietKeRepository;
    @Override
    public List<ThietKeDTO> getList() {
        return thietKeRepository.findAll();
    }

    @Override
    public ThietKeDTO getThietKeById(Integer id) {
        return thietKeRepository.findById(id).orElse(null);
    }

    @Override
    public ThietKeDTO createEndUpdateThietKe(ThietKeDTO thietKeDTO) {
        return thietKeRepository.save(thietKeDTO);
    }

    @Override
    public void deleteThietKe(Integer id) {
        ThietKeDTO thietKeDTO = thietKeRepository.findById(id).orElse(null);
        if(thietKeDTO != null){
            thietKeRepository.delete(thietKeDTO);
        }else {

        }
    }
}
