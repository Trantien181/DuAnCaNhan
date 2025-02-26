package com.example.WebsiteBanHang2.Dto;

public class CoAoDTO {
    private Integer id;
    private String maCoAo;
    private String tenCoAo;
    private Byte trangThai;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaCoAo() {
        return this.maCoAo;
    }

    public void setMaCoAo(String maCoAo) {
        this.maCoAo = maCoAo;
    }

    public String getTenCoAo() {
        return this.tenCoAo;
    }

    public void setTenCoAo(String tenCoAo) {
        this.tenCoAo = tenCoAo;
    }

    public Byte getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Byte trangThai) {
        this.trangThai = trangThai;
    }
}
