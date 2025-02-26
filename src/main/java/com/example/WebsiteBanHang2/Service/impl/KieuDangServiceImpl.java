package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.ChatLieuDTO;
import com.example.WebsiteBanHang2.Dto.KieuDangDTO;
import com.example.WebsiteBanHang2.Model.ChatLieu;
import com.example.WebsiteBanHang2.Repository.KieuDangRepository;
import com.example.WebsiteBanHang2.Service.KieuDangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KieuDangServiceImpl implements KieuDangService {
    @Autowired
    KieuDangRepository kieuDangRepository;

    @Override
    public List<KieuDangDTO> getList() {
        return kieuDangRepository.findAll();
    }

    @Override
    public KieuDangDTO getKieuDangById(Integer id) {
        return kieuDangRepository.findById(id).orElse(null);
    }

    @Override
    public KieuDangDTO createEndUpdateKieuDang(KieuDangDTO kieuDangDTO) {
        return kieuDangRepository.save(kieuDangDTO);
    }

    @Override
    public void deleteKieuDang(Integer id) {
        KieuDangDTO kieuDangDTO = kieuDangRepository.findById(id).orElse(null);
        if (kieuDangDTO != null) {
            kieuDangRepository.delete(kieuDangDTO);
        }
        else {}
    }

}
