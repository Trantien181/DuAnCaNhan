package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.DonViVanChuyenDTO;
import com.example.WebsiteBanHang2.Repository.DonViVanChuyenRepository;
import com.example.WebsiteBanHang2.Service.DonViVanChuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonViVanChuyenServiceImpl implements DonViVanChuyenService {
    @Autowired
    DonViVanChuyenRepository donViVanChuyenRepository;

    @Override
    public List<DonViVanChuyenDTO> getList() {
        return donViVanChuyenRepository.findAll();
    }

    @Override
    public DonViVanChuyenDTO getDonViVanChuyenById(Integer id) {
        return donViVanChuyenRepository.findById(id).orElse(null);
    }

    @Override
    public DonViVanChuyenDTO createEndUpdateDonViVanChuyen(DonViVanChuyenDTO donViVanChuyenDTO) {
        return donViVanChuyenRepository.save(donViVanChuyenDTO);
    }

    @Override
    public void deleteDonViVanChuyen(Integer id) {
        DonViVanChuyenDTO donViVanChuyenDTO = donViVanChuyenRepository.findById(id).orElse(null);
        if (donViVanChuyenDTO != null) {
            donViVanChuyenRepository.delete(donViVanChuyenDTO);
        }else {}
    }
}
