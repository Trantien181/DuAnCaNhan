package com.example.WebsiteBanHang2.Service;

import com.example.WebsiteBanHang2.Dto.ChatLieuDTO;
import com.example.WebsiteBanHang2.Dto.HoaDonDTO;

import java.util.List;

public interface HoaDonService {
    List<HoaDonDTO> getList();
    HoaDonDTO getHoaDonById(Integer id);
    HoaDonDTO createEndUpdateHoaDon(HoaDonDTO hoaDonDTO);
    void deleteHoaDon(Integer id);
}
