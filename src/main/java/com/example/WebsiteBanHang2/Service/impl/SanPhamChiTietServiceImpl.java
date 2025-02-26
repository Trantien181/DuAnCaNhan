package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.SanPhamChiTietDTO;
import com.example.WebsiteBanHang2.Repository.SanPhamChiTietRepository;
import com.example.WebsiteBanHang2.Service.SanPhamChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamChiTietServiceImpl implements SanPhamChiTietService {
    @Autowired
    SanPhamChiTietRepository sanPhamChiTietRepository;
    @Override
    public List<SanPhamChiTietDTO> getList() {
        return sanPhamChiTietRepository.findAll();
    }

    @Override
    public SanPhamChiTietDTO getSanPhamChiTietById(Integer id) {
        return null;
    }

    @Override
    public SanPhamChiTietDTO createEndUpdateSanPhamChiTiet(SanPhamChiTietDTO sanPhamChiTietDTO) {
        return null;
    }

    @Override
    public void deleteSanPhamChiTiet(Integer id) {

    }
}
