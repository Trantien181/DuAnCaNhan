package com.example.WebsiteBanHang2.Dto;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
@Data
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


}
