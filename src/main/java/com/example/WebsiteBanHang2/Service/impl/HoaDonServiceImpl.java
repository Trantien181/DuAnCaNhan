package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.HoaDonDTO;
import com.example.WebsiteBanHang2.Repository.HoaDonRepository;
import com.example.WebsiteBanHang2.Service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonServiceImpl  implements HoaDonService {
    @Autowired
    HoaDonRepository hoaDonRepository;

    @Override
    public List<HoaDonDTO> getList() {
        return hoaDonRepository.findAll();
    }

    @Override
    public HoaDonDTO getHoaDonById(Integer id) {
        return hoaDonRepository.findById(id).orElse(null);
    }

    @Override
    public HoaDonDTO createEndUpdateHoaDon(HoaDonDTO hoaDonDTO) {
        return hoaDonRepository.save(hoaDonDTO);
    }

    @Override
    public void deleteHoaDon(Integer id) {
        HoaDonDTO hoaDonDTO = hoaDonRepository.findById(id).orElse(null);
        if (hoaDonDTO != null) {
            hoaDonRepository.delete(hoaDonDTO);
        }
        else {}
    }
}
