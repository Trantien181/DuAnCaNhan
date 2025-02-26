package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.KichThuocDTO;
import com.example.WebsiteBanHang2.Repository.KichThuocRepository;
import com.example.WebsiteBanHang2.Service.KichThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KichThuocServiceImpl implements KichThuocService {
    @Autowired
    KichThuocRepository kichThuocRepository;

    @Override
    public List<KichThuocDTO> getList() {
        return kichThuocRepository.findAll();
    }

    @Override
    public KichThuocDTO getKichThuocById(Integer id) {
        return kichThuocRepository.findById(id).orElse(null);
    }

    @Override
    public KichThuocDTO createEndUpdateKichThuoc(KichThuocDTO kichThuocDTO) {
        return kichThuocRepository.save(kichThuocDTO);
    }

    @Override
    public void deleteKichThuoc(Integer id) {
        KichThuocDTO kichThuocDTO = kichThuocRepository.findById(id).orElse(null);
        if (kichThuocDTO != null) {
            kichThuocRepository.delete(kichThuocDTO);
        }else {}
    }
}
