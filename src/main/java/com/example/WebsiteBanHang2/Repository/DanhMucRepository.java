package com.example.WebsiteBanHang2.Repository;

import com.example.WebsiteBanHang2.Dto.DanhMucDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DanhMucRepository extends JpaRepository<DanhMucDTO, Integer> {
}
