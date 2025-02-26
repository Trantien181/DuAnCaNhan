package com.example.WebsiteBanHang2.Service;

import com.example.WebsiteBanHang2.Dto.ChatLieuDTO;
import com.example.WebsiteBanHang2.Model.HoaDonChiTiet;

import java.util.List;

public interface HoaDonChiTietService {
    List<HoaDonChiTiet> getList();
    HoaDonChiTiet getHoaDonChiTietById(Integer id);
    HoaDonChiTiet createEndUpdateHoaDonChiTiet(HoaDonChiTiet hoaDonChiTietDTO);
    void deleteHoaDonChiTiet(Integer id);
}
