package com.example.WebsiteBanHang2.Dto;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

@Data
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

}
