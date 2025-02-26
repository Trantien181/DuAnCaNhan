package com.example.WebsiteBanHang2.Dto;

public class ThietKeDTO {
    private Integer id;
    private String maThietKe;
    private String tenThietKe;
    private Byte trangThai;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaThietKe() {
        return this.maThietKe;
    }

    public void setMaThietKe(String maThietKe) {
        this.maThietKe = maThietKe;
    }

    public String getTenThietKe() {
        return this.tenThietKe;
    }

    public void setTenThietKe(String tenThietKe) {
        this.tenThietKe = tenThietKe;
    }

    public Byte getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Byte trangThai) {
        this.trangThai = trangThai;
    }
}
