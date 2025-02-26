package com.example.WebsiteBanHang2.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Entity
@Table(name = "hoa_don_phuong_thuc_thanh_toan")
public class HoaDonPhuongThucThanhToan {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "hoa_don_id")
    private Integer hoaDonId;

    @Column(name = "phuong_thuc_thanh_toan_id")
    private Integer phuongThucThanhToanId;

    @Column(name = "so_tien_thanh_toan")
    private BigDecimal soTienThanhToan;

    @Column(name = "ngay_thuc_hien_thanh_toan")
    private java.sql.Timestamp ngayThucHienThanhToan;

    @Column(name = "ghi_chu")
    private String ghiChu;


}
