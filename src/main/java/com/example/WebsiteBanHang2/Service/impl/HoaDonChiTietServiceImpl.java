package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Model.HoaDonChiTiet;
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
    public List<HoaDonChiTiet> getList() {
        return hoaDonChiTietRepository.findAll();
    }

    @Override
    public HoaDonChiTiet getHoaDonChiTietById(Integer id) {
        return hoaDonChiTietRepository.findById(id).orElse(null);
    }

    @Override
    public HoaDonChiTiet createEndUpdateHoaDonChiTiet(HoaDonChiTiet hoaDonChiTietDTO) {
        return hoaDonChiTietRepository.save(hoaDonChiTietDTO);
    }

    @Override
    public void deleteHoaDonChiTiet(Integer id) {
        HoaDonChiTiet hoaDonChiTietDTO = getHoaDonChiTietById(id);
        if (hoaDonChiTietDTO != null) {
            hoaDonChiTietRepository.delete(hoaDonChiTietDTO);
        }else {}
    }
}
