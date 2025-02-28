package com.example.WebsiteBanHang2.Dto;

import com.example.WebsiteBanHang2.Model.HoaDon;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

@Data
public class HoaDonDTO {
    private Integer id;
    private Integer idKhachHang;
    private String maHoaDon;
    private String loaiDon;
    private String diaChiGiaoHang;
    private BigDecimal tongTien;
    private Integer idDonViVanChuyen;
    private HoaDon.TrangThaiVanChuyen trangThaiVanChuyen;
    private LocalDate ngayTao;
    private Byte trangThai;

}
