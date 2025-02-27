package com.example.WebsiteBanHang2.Dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

public class HoaDonDTO {
    private Integer id;
    private Integer idKhachHang;
    private Integer idNhanVien;
    private String maHoaDon;
    private String loaiDon;
    private BigDecimal tongTien;
    private Integer idDonViVanChuyen;
    private String trangThaiVanChuyen;
    private LocalDate ngayTao;
    private Byte trangThai;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdKhachHang() {
        return this.idKhachHang;
    }

    public void setIdKhachHang(Integer idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Integer getIdNhanVien() {
        return this.idNhanVien;
    }

    public void setIdNhanVien(Integer idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getMaHoaDon() {
        return this.maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getLoaiDon() {
        return this.loaiDon;
    }

    public void setLoaiDon(String loaiDon) {
        this.loaiDon = loaiDon;
    }

    public BigDecimal getTongTien() {
        return this.tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public Integer getIdDonViVanChuyen() {
        return this.idDonViVanChuyen;
    }

    public void setIdDonViVanChuyen(Integer idDonViVanChuyen) {
        this.idDonViVanChuyen = idDonViVanChuyen;
    }

    public String getTrangThaiVanChuyen() {
        return this.trangThaiVanChuyen;
    }

    public void setTrangThaiVanChuyen(String trangThaiVanChuyen) {
        this.trangThaiVanChuyen = trangThaiVanChuyen;
    }

    public Timestamp getNgayTao() {
        return this.ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Byte getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Byte trangThai) {
        this.trangThai = trangThai;
    }
}
