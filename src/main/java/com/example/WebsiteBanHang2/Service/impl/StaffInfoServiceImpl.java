package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.StaffInfoDTO;
import com.example.WebsiteBanHang2.Repository.StaffInfoRepository;
import com.example.WebsiteBanHang2.Service.StaffInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffInfoServiceImpl implements StaffInfoService {
    @Autowired
    StaffInfoRepository staffInfoRepository;
    @Override
    public List<StaffInfoDTO> getList() {
        return staffInfoRepository.findAll();
    }

    @Override
    public StaffInfoDTO getStaffInfoById(Integer id) {
        return staffInfoRepository.findById(id).orElse(null);
    }

    @Override
    public StaffInfoDTO createEndUpdateStaffInfo(StaffInfoDTO staffInfoDTO) {
        return staffInfoRepository.save(staffInfoDTO);
    }

    @Override
    public void deleteStaffInfo(Integer id) {
        StaffInfoDTO staffInfoDTO = staffInfoRepository.findById(id).orElse(null);
        if(staffInfoDTO != null){
            staffInfoRepository.delete(staffInfoDTO);
        }else {

        }
    }
}
