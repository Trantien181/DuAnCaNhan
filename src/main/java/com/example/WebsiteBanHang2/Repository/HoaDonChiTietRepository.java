package com.example.WebsiteBanHang2.Repository;

import com.example.WebsiteBanHang2.Dto.HoaDonChiTietDTO;
import com.example.WebsiteBanHang2.Model.HoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoaDonChiTietRepository extends JpaRepository<HoaDonChiTiet, Integer> {
}
