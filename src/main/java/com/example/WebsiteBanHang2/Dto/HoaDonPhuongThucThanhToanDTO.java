package com.example.WebsiteBanHang2.Dto;

import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HoaDonPhuongThucThanhToanDTO {
    private Integer id;
    private Integer hoaDonId;
    private Integer phuongThucThanhToanId;
    private BigDecimal soTienThanhToan;
    private LocalDate ngayThucHienThanhToan;
    private String ghiChu;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHoaDonId() {
        return this.hoaDonId;
    }

    public void setHoaDonId(Integer hoaDonId) {
        this.hoaDonId = hoaDonId;
    }

    public Integer getPhuongThucThanhToanId() {
        return this.phuongThucThanhToanId;
    }

    public void setPhuongThucThanhToanId(Integer phuongThucThanhToanId) {
        this.phuongThucThanhToanId = phuongThucThanhToanId;
    }

    public BigDecimal getSoTienThanhToan() {
        return this.soTienThanhToan;
    }

    public void setSoTienThanhToan(BigDecimal soTienThanhToan) {
        this.soTienThanhToan = soTienThanhToan;
    }

    public LocalDate getNgayThucHienThanhToan() {
        return this.ngayThucHienThanhToan;
    }

    public void setNgayThucHienThanhToan(LocalDate ngayThucHienThanhToan) {
        this.ngayThucHienThanhToan = ngayThucHienThanhToan;
    }

    public String getGhiChu() {
        return this.ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
