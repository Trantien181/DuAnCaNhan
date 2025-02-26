package com.example.WebsiteBanHang2.Dto;

public class KieuDangDTO {
    private Integer id;
    private String maKieuDang;
    private String tenKieuDang;
    private Byte trangThai;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaKieuDang() {
        return this.maKieuDang;
    }

    public void setMaKieuDang(String maKieuDang) {
        this.maKieuDang = maKieuDang;
    }

    public String getTenKieuDang() {
        return this.tenKieuDang;
    }

    public void setTenKieuDang(String tenKieuDang) {
        this.tenKieuDang = tenKieuDang;
    }

    public Byte getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Byte trangThai) {
        this.trangThai = trangThai;
    }
}
