package com.example.WebsiteBanHang2.Dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

public class SanPhamChiTietDTO {
    private Integer id;
    private Integer sanPhamId;
    private Integer kichThuocId;
    private Integer mauSacId;
    private Integer chatLieuId;
    private Integer kieuDangId;
    private Integer coAoId;
    private Integer thietKeId;
    private Integer thuongHieuId;
    private Integer soLuong;
    private BigDecimal donGia;
    private LocalDate ngayTao;
    private LocalDate ngayCapNhat;
    private String nguoiCapNhat;
    private Byte trangThai;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSanPhamId() {
        return this.sanPhamId;
    }

    public void setSanPhamId(Integer sanPhamId) {
        this.sanPhamId = sanPhamId;
    }

    public Integer getKichThuocId() {
        return this.kichThuocId;
    }

    public void setKichThuocId(Integer kichThuocId) {
        this.kichThuocId = kichThuocId;
    }

    public Integer getMauSacId() {
        return this.mauSacId;
    }

    public void setMauSacId(Integer mauSacId) {
        this.mauSacId = mauSacId;
    }

    public Integer getChatLieuId() {
        return this.chatLieuId;
    }

    public void setChatLieuId(Integer chatLieuId) {
        this.chatLieuId = chatLieuId;
    }

    public Integer getKieuDangId() {
        return this.kieuDangId;
    }

    public void setKieuDangId(Integer kieuDangId) {
        this.kieuDangId = kieuDangId;
    }

    public Integer getCoAoId() {
        return this.coAoId;
    }

    public void setCoAoId(Integer coAoId) {
        this.coAoId = coAoId;
    }

    public Integer getThietKeId() {
        return this.thietKeId;
    }

    public void setThietKeId(Integer thietKeId) {
        this.thietKeId = thietKeId;
    }

    public Integer getThuongHieuId() {
        return this.thuongHieuId;
    }

    public void setThuongHieuId(Integer thuongHieuId) {
        this.thuongHieuId = thuongHieuId;
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

    public Timestamp getNgayTao() {
        return this.ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Timestamp getNgayCapNhat() {
        return this.ngayCapNhat;
    }

    public void setNgayCapNhat(Timestamp ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    public String getNguoiCapNhat() {
        return this.nguoiCapNhat;
    }

    public void setNguoiCapNhat(String nguoiCapNhat) {
        this.nguoiCapNhat = nguoiCapNhat;
    }

    public Byte getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Byte trangThai) {
        this.trangThai = trangThai;
    }
}
