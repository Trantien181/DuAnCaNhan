package com.example.WebsiteBanHang2.Repository;

import com.example.WebsiteBanHang2.Dto.RefreshTokenDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshTokenDTO, Integer> {
}
