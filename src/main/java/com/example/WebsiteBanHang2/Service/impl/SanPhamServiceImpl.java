package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.SanPhamDTO;
import com.example.WebsiteBanHang2.Model.SanPham;
import com.example.WebsiteBanHang2.Repository.SanPhamRepository;
import com.example.WebsiteBanHang2.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    SanPhamRepository sanPhamRepository;

    @Override
    public List<SanPhamDTO> getList() {
        return sanPhamRepository.findAll();
    }

    @Override
    public SanPhamDTO getSanPhamDTOById(Integer id) {
        return sanPhamRepository.findById(id).orElse(null);
    }

    @Override
    public SanPhamDTO createEndUpdateSanPhamDTO(SanPhamDTO sanPham) {
        return sanPhamRepository.save(sanPham);
    }

    @Override
    public void deleteSanPhamDTO(Integer id) {
        SanPhamDTO sanPhamDTO = sanPhamRepository.findById(id).orElse(null);
        if(sanPhamDTO != null){
            sanPhamRepository.delete(sanPhamDTO);
        }
        else{

        }
    }
}
