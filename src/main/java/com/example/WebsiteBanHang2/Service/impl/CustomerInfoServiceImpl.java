package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.CustomerInfoDTO;
import com.example.WebsiteBanHang2.Model.CustomerInfo;
import com.example.WebsiteBanHang2.Repository.CustomerInfoRepository;
import com.example.WebsiteBanHang2.Service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {
    @Autowired
    CustomerInfoRepository customerInfoRepository;
    private CustomerInfoDTO convertToCustomerInfoDTO(CustomerInfo customerInfo) {
        CustomerInfoDTO customerInfoDTO = new CustomerInfoDTO();
        customerInfoDTO.setId(customerInfo.getId());
        customerInfoDTO.setAddress( customerInfo.getAddress());
        customerInfoDTO.setPhone( customerInfo.getPhone());
        customerInfoDTO.setBirthDate(customerInfo.getBirthDate());
        customerInfoDTO.setUserId( customerInfo.getUserId());
    }

    @Override
    public List<CustomerInfoDTO> getList() {
        return customerInfoRepository.findAll();
    }

    @Override
    public CustomerInfoDTO getCustomerInfoById(Integer id) {
        return customerInfoRepository.findById(id).orElse(null);
    }

    @Override
    public CustomerInfoDTO createEndUpdateCustomerInfo(CustomerInfoDTO customerInfoDTO) {
        return customerInfoRepository.save(customerInfoDTO);
    }

    @Override
    public void deleteCustomerInfo(Integer id) {
        CustomerInfoDTO customerInfoDTO = customerInfoRepository.findById(id).orElse(null);
        if (customerInfoDTO != null) {
            customerInfoRepository.delete(customerInfoDTO);
        }else {}
    }
}
