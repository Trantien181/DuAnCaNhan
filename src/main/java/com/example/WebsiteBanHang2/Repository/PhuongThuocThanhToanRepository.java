package com.example.WebsiteBanHang2.Repository;

import com.example.WebsiteBanHang2.Dto.PhuongThucThanhToanDTO;
import com.example.WebsiteBanHang2.Model.PhuongThucThanhToan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhuongThuocThanhToanRepository extends JpaRepository<PhuongThucThanhToan, Integer> {
}
