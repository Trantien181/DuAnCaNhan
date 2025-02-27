package com.example.WebsiteBanHang2.Dto;

import java.math.BigDecimal;

public class HoaDonChiTietDTO {
    private Integer id;
    private HoaDonDTO hoaDon; // Thay Integer hoaDonId bằng HoaDonDTO
    private Integer sanPhamChiTietId; // Giữ Integer nếu chỉ cần ID
    private Integer soLuong;
    private BigDecimal donGia;
    private BigDecimal thanhTien;
    private Byte trangThai;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HoaDonDTO getHoaDon() {
        return this.hoaDon;
    }

    public void setHoaDon(HoaDonDTO hoaDon) {
        this.hoaDon = hoaDon;
    }

    public Integer getSanPhamChiTietId() {
        return this.sanPhamChiTietId;
    }

    public void setSanPhamChiTietId(Integer sanPhamChiTietId) {
        this.sanPhamChiTietId = sanPhamChiTietId;
    }

    public Integer getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return this.donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public BigDecimal getThanhTien() {
        return this.thanhTien;
    }

    public void setThanhTien(BigDecimal thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Byte getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Byte trangThai) {
        this.trangThai = trangThai;
    }
}