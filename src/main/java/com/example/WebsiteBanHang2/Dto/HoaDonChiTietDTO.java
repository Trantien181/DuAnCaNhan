package com.example.WebsiteBanHang2.Dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class HoaDonChiTietDTO {
    private Integer id;
    private HoaDonDTO hoaDon; // Thay Integer hoaDonId bằng HoaDonDTO
    private Integer sanPhamChiTietId; // Giữ Integer nếu chỉ cần ID
    private Integer soLuong;
    private BigDecimal donGia;
    private BigDecimal thanhTien;
    private Byte trangThai;

}