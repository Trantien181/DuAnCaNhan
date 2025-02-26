package com.example.WebsiteBanHang2.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "san_pham_chi_tiet")
public class SanPhamChiTiet {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "san_pham_id")
    private Integer sanPhamId;

    @Column(name = "kich_thuoc_id")
    private Integer kichThuocId;

    @Column(name = "mau_sac_id")
    private Integer mauSacId;

    @Column(name = "chat_lieu_id")
    private Integer chatLieuId;

    @Column(name = "kieu_dang_id")
    private Integer kieuDangId;

    @Column(name = "co_ao_id")
    private Integer coAoId;

    @Column(name = "thiet_ke_id")
    private Integer thietKeId;

    @Column(name = "thuong_hieu_id")
    private Integer thuongHieuId;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "don_gia")
    private BigDecimal donGia;

    @Column(name = "ngay_tao")
    private java.sql.Timestamp ngayTao;

    @Column(name = "ngay_cap_nhat")
    private java.sql.Timestamp ngayCapNhat;

    @Column(name = "nguoi_cap_nhat")
    private String nguoiCapNhat;

    @Column(name = "trang_thai")
    private Byte trangThai;

}
