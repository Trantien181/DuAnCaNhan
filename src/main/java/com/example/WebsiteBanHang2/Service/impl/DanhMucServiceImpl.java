package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.DanhMucDTO;
import com.example.WebsiteBanHang2.Model.DanhMuc;
import com.example.WebsiteBanHang2.Repository.DanhMucRepository;
import com.example.WebsiteBanHang2.Service.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucServiceImpl implements DanhMucService {
    @Autowired
    DanhMucRepository danhMucRepository;

    @Override
    public List<DanhMucDTO> getList() {
        return danhMucRepository.findAll();
    }

    @Override
    public DanhMucDTO getDanhMucById(Integer id) {
        return danhMucRepository.findById(id).orElse(null);
    }

    @Override
    public DanhMucDTO createEndUpdateDanhMuc(DanhMucDTO danhMucDTO) {
        return danhMucRepository.save(danhMucDTO);
    }

    @Override
    public void deleteDanhMuc(Integer id) {
        DanhMucDTO danhMucDTO = danhMucRepository.findById(id).orElse(null);
        if (danhMucDTO != null) {
            danhMucRepository.delete(danhMucDTO);
        }else {}
    }
}
