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
        return phuongThuocThanhToanRepository.findAll();
    }

    @Override
    public PhuongThucThanhToanDTO getPhuongThucThanhToanById(Integer id) {
        return phuongThuocThanhToanRepository.findById(id).orElse(null);
    }

    @Override
    public PhuongThucThanhToanDTO createEndUpdatePhuongThucThanhToan(PhuongThucThanhToanDTO phuongThucThanhToanDTO) {
        return phuongThuocThanhToanRepository.save(phuongThucThanhToanDTO);
    }

    @Override
    public void deletePhuongThucThanhToan(Integer id) {
        PhuongThucThanhToanDTO phuongThucThanhToanDTO = phuongThuocThanhToanRepository.findById(id).orElse(null);
        if (phuongThucThanhToanDTO != null) {
            phuongThuocThanhToanRepository.deleteById(id);
        }
        else {

        }
    }
}
