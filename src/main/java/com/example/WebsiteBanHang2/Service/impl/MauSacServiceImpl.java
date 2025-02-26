package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.MauSacDTO;
import com.example.WebsiteBanHang2.Repository.MauSacRepository;
import com.example.WebsiteBanHang2.Service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MauSacServiceImpl implements MauSacService {
    @Autowired
    MauSacRepository mauSacRepository;

    @Override
    public List<MauSacDTO> getList() {
        return mauSacRepository.findAll();
    }

    @Override
    public MauSacDTO getMauSacById(Integer id) {
        return mauSacRepository.findById(id).orElse(null);
    }

    @Override
    public MauSacDTO createEndUpdateMauSac(MauSacDTO mauSacDTO) {
        return mauSacRepository.save(mauSacDTO);
    }

    @Override
    public void deleteMauSac(Integer id) {
        MauSacDTO mauSacDTO = mauSacRepository.findById(id).orElse(null);
        if (mauSacDTO != null) {
            mauSacRepository.delete(mauSacDTO);
        }else {

        }
    }
}
