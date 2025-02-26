package com.example.WebsiteBanHang2.Repository;

import com.example.WebsiteBanHang2.Dto.CustomerInfoDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfoDTO, Integer> {
}
