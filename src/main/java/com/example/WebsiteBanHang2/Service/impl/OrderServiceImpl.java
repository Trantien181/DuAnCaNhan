package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.HoaDonDTO;
import com.example.WebsiteBanHang2.Model.*;
import com.example.WebsiteBanHang2.Model.GioHang.CartItem;
import com.example.WebsiteBanHang2.Model.GioHang.ShoppingCart;
import com.example.WebsiteBanHang2.Repository.DonViVanChuyenRepository;
import com.example.WebsiteBanHang2.Repository.HoaDonChiTietRepository;
import com.example.WebsiteBanHang2.Repository.HoaDonRepository;
import com.example.WebsiteBanHang2.Repository.SanPhamChiTietRepository;
import com.example.WebsiteBanHang2.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    HoaDonRepository hoaDonRepository;
    @Autowired
    HoaDonChiTietRepository hoaDonChiTietRepository;
    @Autowired
    SanPhamChiTietRepository sanPhamChiTietRepository;
    @Autowired
    DonViVanChuyenRepository donViVanChuyenRepository;
    @Override
    @Transactional
    public HoaDon placeOrder(UserAccount khachHang, ShoppingCart cart, String diaChiGiaoHang, Integer idDonViVanChuyen) {
        String maHoaDon = generateMaHoaDon();
        DonViVanChuyen donViVanChuyen = donViVanChuyenRepository.findById(idDonViVanChuyen).orElseThrow(() -> new RuntimeException("DonViVanChuyen not found"));
        BigDecimal tongTienSanPham = cart.getTongTien();
        BigDecimal phiVanChuyen = donViVanChuyen.getPhiVanChuyen() != null ? donViVanChuyen.getPhiVanChuyen() : BigDecimal.ZERO;
        BigDecimal tongTien = tongTienSanPham.add(phiVanChuyen);

        HoaDon hoaDon = new HoaDon();
        hoaDon.setIdKhachHang(khachHang);
        hoaDon.setMaHoaDon(maHoaDon);
        hoaDon.setTongTien(tongTien);
        hoaDon.setLoaiDon("ONLINE");
        hoaDon.setTrangThaiVanChuyen(HoaDon.TrangThaiVanChuyen.PENDING);
        hoaDon.setDiaChiGiaoHang(diaChiGiaoHang);
        hoaDon.setIdDonViVanChuyen(donViVanChuyen);
        hoaDon.setNgayTao(LocalDate.now());
        hoaDon.setTrangThai((byte) 1);
        hoaDon = hoaDonRepository.save(hoaDon);

        List<HoaDonChiTiet> chiTietHoaDonList = new ArrayList<>();
        for (CartItem item : cart.getItems()) {
            SanPhamChiTiet spct = sanPhamChiTietRepository.findById(item.getSanPhamChiTietId())
                    .orElseThrow(() -> new RuntimeException("Sản phẩm không tồn tại"));

            if (spct.getSoLuong() < item.getSoLuongMua()) {
                throw new RuntimeException("Số lượng tồn kho không đủ cho sản phẩm: " + item.getTenSanPham());
            }

            HoaDonChiTiet chiTiet = new HoaDonChiTiet();
            chiTiet.setHoaDonId(hoaDon);
            chiTiet.setSanPhamChiTietId(spct);
            chiTiet.setSoLuong(item.getSoLuongMua());
            chiTiet.setDonGia(item.getDonGia());
            chiTiet.setTrangThai((byte) 1);
            chiTietHoaDonList.add(chiTiet);

            spct.setSoLuong(spct.getSoLuong() - item.getSoLuongMua());
            sanPhamChiTietRepository.save(spct);

        }
        hoaDonChiTietRepository.saveAll(chiTietHoaDonList);
        return hoaDon;
    }
    private String generateMaHoaDon() {
        long count = hoaDonRepository.count() + 1;
        return "HD" + String.format("%03d", count);
    }
}
