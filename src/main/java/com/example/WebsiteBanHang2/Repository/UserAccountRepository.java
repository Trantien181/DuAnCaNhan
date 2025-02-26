package com.example.WebsiteBanHang2.Repository;

import com.example.WebsiteBanHang2.Dto.UserAccountDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccountDTO, Integer> {
}
