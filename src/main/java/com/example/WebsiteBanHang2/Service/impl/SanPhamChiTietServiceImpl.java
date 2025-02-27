package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.SanPhamChiTietDTO;
import com.example.WebsiteBanHang2.Model.*;
import com.example.WebsiteBanHang2.Repository.SanPhamChiTietRepository;
import com.example.WebsiteBanHang2.Service.SanPhamChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SanPhamChiTietServiceImpl implements SanPhamChiTietService {
    @Autowired
    private SanPhamChiTietRepository sanPhamChiTietRepository;

    // Trong file SanPhamChiTietServiceImpl.java
    private SanPhamChiTietDTO convertToDto(SanPhamChiTiet sanPhamChiTiet) {
        SanPhamChiTietDTO sanPhamChiTietDTO = new SanPhamChiTietDTO();
        sanPhamChiTietDTO.setId(sanPhamChiTiet.getId());
        sanPhamChiTietDTO.setSanPhamId(sanPhamChiTiet.getSanPhamId() != null ? sanPhamChiTiet.getSanPhamId().getId() : null);
        sanPhamChiTietDTO.setKichThuocId(sanPhamChiTiet.getKichThuocId() != null ? sanPhamChiTiet.getKichThuocId().getId() : null);
        sanPhamChiTietDTO.setMauSacId(sanPhamChiTiet.getMauSacId() != null ? sanPhamChiTiet.getMauSacId().getId() : null);
        sanPhamChiTietDTO.setChatLieuId(sanPhamChiTiet.getChatLieuId() != null ? sanPhamChiTiet.getChatLieuId().getId() : null);
        sanPhamChiTietDTO.setKieuDangId(sanPhamChiTiet.getKieuDangId() != null ? sanPhamChiTiet.getKieuDangId().getId() : null);
        sanPhamChiTietDTO.setCoAoId(sanPhamChiTiet.getCoAoId() != null ? sanPhamChiTiet.getCoAoId().getId() : null);
        sanPhamChiTietDTO.setThietKeId(sanPhamChiTiet.getThietKeId() != null ? sanPhamChiTiet.getThietKeId().getId() : null);
        sanPhamChiTietDTO.setThuongHieuId(sanPhamChiTiet.getThuongHieuId() != null ? sanPhamChiTiet.getThuongHieuId().getId() : null);
        sanPhamChiTietDTO.setSoLuong(sanPhamChiTiet.getSoLuong());
        sanPhamChiTietDTO.setDonGia(sanPhamChiTiet.getDonGia());
        sanPhamChiTietDTO.setNgayTao(sanPhamChiTiet.getNgayTao());
        sanPhamChiTietDTO.setNgayCapNhat(sanPhamChiTiet.getNgayCapNhat());
        sanPhamChiTietDTO.setNguoiCapNhat(sanPhamChiTiet.getNguoiCapNhat());
        sanPhamChiTietDTO.setTrangThai(sanPhamChiTiet.getTrangThai());
        return sanPhamChiTietDTO;
    }

    private SanPhamChiTiet convertToEntity(SanPhamChiTietDTO sanPhamChiTietDTO) {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet();
        sanPhamChiTiet.setId(sanPhamChiTietDTO.getId());
        SanPham sanPham = new SanPham();
        sanPham.setId(sanPhamChiTietDTO.getSanPhamId());
        sanPhamChiTiet.setSanPhamId(sanPham);
        KichThuoc kichThuoc = new KichThuoc();
        kichThuoc.setId(sanPhamChiTietDTO.getKichThuocId());
        sanPhamChiTiet.setKichThuocId(kichThuoc);
        MauSac mauSac = new MauSac();
        mauSac.setId(sanPhamChiTietDTO.getMauSacId());
        sanPhamChiTiet.setMauSacId(mauSac);
        ChatLieu chatLieu = new ChatLieu();
        chatLieu.setId(sanPhamChiTietDTO.getChatLieuId());
        sanPhamChiTiet.setChatLieuId(chatLieu);
        KieuDang kieuDang = new KieuDang();
        kieuDang.setId(sanPhamChiTietDTO.getKieuDangId());
        sanPhamChiTiet.setKieuDangId(kieuDang);
        CoAo coAo = new CoAo();
        coAo.setId(sanPhamChiTietDTO.getCoAoId());
        sanPhamChiTiet.setCoAoId(coAo);
        ThietKe thietKe = new ThietKe();
        thietKe.setId(sanPhamChiTietDTO.getThietKeId());
        sanPhamChiTiet.setThietKeId(thietKe);
        ThuongHieu thuongHieu = new ThuongHieu();
        thuongHieu.setId(sanPhamChiTietDTO.getThuongHieuId());
        sanPhamChiTiet.setThuongHieuId(thuongHieu);
        sanPhamChiTiet.setSoLuong(sanPhamChiTietDTO.getSoLuong());
        sanPhamChiTiet.setDonGia(sanPhamChiTietDTO.getDonGia());
        sanPhamChiTiet.setNgayTao(sanPhamChiTietDTO.getNgayTao());
        sanPhamChiTiet.setNgayCapNhat(sanPhamChiTietDTO.getNgayCapNhat());
        sanPhamChiTiet.setNguoiCapNhat(sanPhamChiTietDTO.getNguoiCapNhat());
        sanPhamChiTiet.setTrangThai(sanPhamChiTietDTO.getTrangThai());
        return sanPhamChiTiet;
    }

    @Override
    public List<SanPhamChiTietDTO> getList() {
        List<SanPhamChiTiet> sanPhamChiTietList = sanPhamChiTietRepository.findAll();
        return sanPhamChiTietList.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @Override
    public SanPhamChiTietDTO getSanPhamChiTietById(Integer id) {
        SanPhamChiTiet sanPhamChiTiet = sanPhamChiTietRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sản phẩm chi tiết không tồn tại với ID: " + id));
        return convertToDto(sanPhamChiTiet);
    }

    @Override
    public SanPhamChiTietDTO createEndUpdateSanPhamChiTiet(SanPhamChiTietDTO sanPhamChiTietDTO) {
        SanPhamChiTiet sanPhamChiTiet = convertToEntity(sanPhamChiTietDTO);
        SanPhamChiTiet sanPhamChiTietSaved = sanPhamChiTietRepository.save(sanPhamChiTiet);
        return convertToDto(sanPhamChiTietSaved);
    }

    @Override
    public void deleteSanPhamChiTiet(Integer id) {
        SanPhamChiTiet sanPhamChiTiet = sanPhamChiTietRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sản phẩm chi tiết không tồn tại với ID: " + id));
        sanPhamChiTietRepository.delete(sanPhamChiTiet);
    }
}