package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.ThuongHieuDTO;
import com.example.WebsiteBanHang2.Repository.ThuongHieuRepository;
import com.example.WebsiteBanHang2.Service.ThuongHieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThuongHieuServiceImpl implements ThuongHieuService {
    @Autowired
    ThuongHieuRepository thuongHieuRepository;
    @Override
    public List<ThuongHieuDTO> getList() {
        return thuongHieuRepository.findAll();
    }

    @Override
    public ThuongHieuDTO getThuongHieuById(Integer id) {
        return thuongHieuRepository.findById(id).orElse(null);
    }

    @Override
    public ThuongHieuDTO createEndUpdateThuongHieu(ThuongHieuDTO thuongHieuDTO) {
        return thuongHieuRepository.save(thuongHieuDTO);
    }

    @Override
    public void deleteThuongHieu(Integer id) {
        ThuongHieuDTO thuongHieuDTO = thuongHieuRepository.findById(id).orElse(null);
        if(thuongHieuDTO != null){
            thuongHieuRepository.delete(thuongHieuDTO);
        }
    }
}
