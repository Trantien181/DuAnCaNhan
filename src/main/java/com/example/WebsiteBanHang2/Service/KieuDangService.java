package com.example.WebsiteBanHang2.Service;

import com.example.WebsiteBanHang2.Dto.ChatLieuDTO;
import com.example.WebsiteBanHang2.Dto.KieuDangDTO;

import java.util.List;

public interface KieuDangService {
    List<KieuDangDTO> getList();
    KieuDangDTO getKieuDangById(Integer id);
    KieuDangDTO createEndUpdateKieuDang(KieuDangDTO kieuDangDTO);
    void deleteKieuDang(Integer id);
}
