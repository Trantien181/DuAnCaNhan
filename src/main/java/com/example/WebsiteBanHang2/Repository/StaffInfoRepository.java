package com.example.WebsiteBanHang2.Repository;

import com.example.WebsiteBanHang2.Dto.StaffInfoDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffInfoRepository extends JpaRepository<StaffInfoDTO, Integer> {
}
