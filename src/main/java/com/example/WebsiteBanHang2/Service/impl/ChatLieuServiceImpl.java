package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.ChatLieuDTO;
import com.example.WebsiteBanHang2.Repository.ChatLieuRepository;
import com.example.WebsiteBanHang2.Service.ChatLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatLieuServiceImpl implements ChatLieuService {
    @Autowired
     ChatLieuRepository chatLieuRepository;

    @Override
    public List<ChatLieuDTO> getList() {
        return chatLieuRepository.findAll();
    }

    @Override
    public ChatLieuDTO getChatLieuById(Integer id) {
        return chatLieuRepository.findById(id).orElse(null);
    }

    @Override
    public ChatLieuDTO createEndUpdateChatLieu(ChatLieuDTO chatLieuDTO) {
        return chatLieuRepository.save(chatLieuDTO);
    }

    @Override
    public void deleteChatLieu(Integer id) {
        ChatLieuDTO chatLieuDTO = chatLieuRepository.findById(id).orElse(null);
        if (chatLieuDTO != null) {
            chatLieuRepository.delete(chatLieuDTO);
        }else {}
    }
}
