package com.example.WebsiteBanHang2.Service;

import com.example.WebsiteBanHang2.Dto.ChatLieuDTO;
import com.example.WebsiteBanHang2.Dto.HoaDonChiTietDTO;

import java.util.List;

public interface HoaDonChiTietService {
    List<HoaDonChiTietDTO> getList();
    HoaDonChiTietDTO getHoaDonChiTietById(Integer id);
    HoaDonChiTietDTO createEndUpdateHoaDonChiTiet(HoaDonChiTietDTO hoaDonChiTietDTO);
    void deleteHoaDonChiTiet(Integer id);
}
