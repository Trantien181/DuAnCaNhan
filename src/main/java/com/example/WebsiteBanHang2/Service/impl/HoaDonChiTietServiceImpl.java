package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.HoaDonChiTietDTO;
import com.example.WebsiteBanHang2.Repository.HoaDonChiTietRepository;
import com.example.WebsiteBanHang2.Service.HoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {
    @Autowired
    HoaDonChiTietRepository hoaDonChiTietRepository;

    @Override
    public List<HoaDonChiTietDTO> getList() {
        return hoaDonChiTietRepository.findAll();
    }

    @Override
    public HoaDonChiTietDTO getHoaDonChiTietById(Integer id) {
        return hoaDonChiTietRepository.findById(id).orElse(null);
    }

    @Override
    public HoaDonChiTietDTO createEndUpdateHoaDonChiTiet(HoaDonChiTietDTO hoaDonChiTietDTO) {
        return hoaDonChiTietRepository.save(hoaDonChiTietDTO);
    }

    @Override
    public void deleteHoaDonChiTiet(Integer id) {
        HoaDonChiTietDTO hoaDonChiTietDTO = getHoaDonChiTietById(id);
        if (hoaDonChiTietDTO != null) {
            hoaDonChiTietRepository.delete(hoaDonChiTietDTO);
        }else {}
    }
}
