package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.PhuongThucThanhToanDTO;
import com.example.WebsiteBanHang2.Repository.PhuongThuocThanhToanRepository;
import com.example.WebsiteBanHang2.Service.PhuongThucThanhToanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhuongThucThanhToanServiceImpl implements PhuongThucThanhToanService {
    @Autowired
    PhuongThuocThanhToanRepository phuongThuocThanhToanRepository;

    @Override
    public List<PhuongThucThanhToanDTO> getList() {
        return List.of();
    }

    @Override
    public PhuongThucThanhToanDTO getPhuongThucThanhToanById(Integer id) {
        return null;
    }

    @Override
    public PhuongThucThanhToanDTO createEndUpdatePhuongThucThanhToan(PhuongThucThanhToanDTO phuongThucThanhToanDTO) {
        return null;
    }

    @Override
    public void deletePhuongThucThanhToan(Integer id) {

    }
}
