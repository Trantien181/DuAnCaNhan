package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.CoAoDTO;
import com.example.WebsiteBanHang2.Repository.CoAoRepository;
import com.example.WebsiteBanHang2.Service.CoAoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoAoServiceImpl implements CoAoService {
    @Autowired
    CoAoRepository coAoRepository;

    @Override
    public List<CoAoDTO> getList() {
        return coAoRepository.findAll();
    }

    @Override
    public CoAoDTO getCoAoById(Integer id) {
        return coAoRepository.findById(id).orElse(null);
    }

    @Override
    public CoAoDTO createEndUpdateCoAo(CoAoDTO coAoDTO) {
        return coAoRepository.save(coAoDTO);
    }

    @Override
    public void deleteCoAo(Integer id) {
        CoAoDTO coAoDTO = coAoRepository.findById(id).orElse(null);
        if (coAoDTO != null) {
            coAoRepository.delete(coAoDTO);
        }else {}
    }
}
