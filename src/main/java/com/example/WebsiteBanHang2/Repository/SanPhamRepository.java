package com.example.WebsiteBanHang2.Repository;

import com.example.WebsiteBanHang2.Dto.SanPhamDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SanPhamRepository extends JpaRepository<SanPhamDTO, Integer> {
}
