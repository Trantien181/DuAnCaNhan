package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.HoaDonPhuongThucThanhToanDTO;
import com.example.WebsiteBanHang2.Repository.HoaDonPhuongThucThanhToan;
import com.example.WebsiteBanHang2.Service.HoaDonPhuongThucThanhToanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonPhuongThucThanhToanServiceImpl implements HoaDonPhuongThucThanhToanService {
    @Autowired
    HoaDonPhuongThucThanhToan hoaDonPhuongThucThanhToan;

    @Override
    public List<HoaDonPhuongThucThanhToanDTO> getList() {
        return hoaDonPhuongThucThanhToan.findAll();
    }

    @Override
    public HoaDonPhuongThucThanhToanDTO getHoaDonPhuongThucThanhToanById(Integer id) {
        return hoaDonPhuongThucThanhToan.findById(id).orElse(null);
    }

    @Override
    public HoaDonPhuongThucThanhToanDTO createEndUpdateHoaDonPhuongThucThanhToan(HoaDonPhuongThucThanhToanDTO hoaDonPhuongThucThanhToanDTO) {
        return hoaDonPhuongThucThanhToan.save(hoaDonPhuongThucThanhToanDTO);
    }

    @Override
    public void deleteHoaDonPhuongThucThanhToan(Integer id) {
        HoaDonPhuongThucThanhToanDTO hoaDonPhuongThucThanhToanDTO = hoaDonPhuongThucThanhToan.findById(id).orElse(null);
        if (hoaDonPhuongThucThanhToanDTO != null) {
            hoaDonPhuongThucThanhToan.delete(hoaDonPhuongThucThanhToanDTO);
        }else {}
    }
}
