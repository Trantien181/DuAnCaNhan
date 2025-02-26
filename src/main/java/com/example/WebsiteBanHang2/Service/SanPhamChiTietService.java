package com.example.WebsiteBanHang2.Service;

import com.example.WebsiteBanHang2.Dto.RefreshTokenDTO;
import com.example.WebsiteBanHang2.Dto.SanPhamChiTietDTO;

import java.util.List;

public interface SanPhamChiTietService {
    List<SanPhamChiTietDTO> getList();
    SanPhamChiTietDTO getSanPhamChiTietById(Integer id);
    SanPhamChiTietDTO createEndUpdateSanPhamChiTiet(SanPhamChiTietDTO sanPhamChiTietDTO);
    void deleteSanPhamChiTiet(Integer id);
}
