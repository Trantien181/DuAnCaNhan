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
        return sanPhamChiTietRepository.findById(id).orElse(null);
    }

    @Override
    public SanPhamChiTietDTO createEndUpdateSanPhamChiTiet(SanPhamChiTietDTO sanPhamChiTietDTO) {
        return sanPhamChiTietRepository.save(sanPhamChiTietDTO);
    }

    @Override
    public void deleteSanPhamChiTiet(Integer id) {
        SanPhamChiTietDTO sanPhamChiTietDTO = sanPhamChiTietRepository.findById(id).orElse(null);
        if (sanPhamChiTietDTO != null) {
            sanPhamChiTietRepository.delete(sanPhamChiTietDTO);
        } else {

        }
    }
}
