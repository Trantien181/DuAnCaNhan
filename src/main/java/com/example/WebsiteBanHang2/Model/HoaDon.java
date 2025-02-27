package com.example.WebsiteBanHang2.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "hoa_don")
public class HoaDon {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_khach_hang")
    private UserAccount idKhachHang;

    @ManyToOne
    @JoinColumn(name = "id_nhan_vien")
    private StaffInfo idNhanVien;

    @Column(name = "ma_hoa_don")
    private String maHoaDon;

    @Column(name = "loai_don")
    private String loaiDon;

    @Column(name = "tong_tien")
    private BigDecimal tongTien;

    @ManyToOne
    @JoinColumn(name = "id_don_vi_van_chuyen")
    private DonViVanChuyen idDonViVanChuyen;

    @Column(name = "trang_thai_van_chuyen")
    private String trangThaiVanChuyen;

    @Column(name = "ngay_tao")
    private java.sql.Timestamp ngayTao;

    @Column(name = "trang_thai")
    private Byte trangThai;

}
