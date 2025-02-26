package com.example.WebsiteBanHang2.Controller;

import com.example.WebsiteBanHang2.Dto.ChatLieuDTO;
import com.example.WebsiteBanHang2.Model.ChatLieu;
import com.example.WebsiteBanHang2.Service.ChatLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chatlieu")
public class ChatLieuController {
    @Autowired
    private ChatLieuService chatLieuService;

    @GetMapping("")
    public String hienThi(Model model) {
        model.addAttribute("listChatLieu", chatLieuService.getList());
        return "ChatLieu/HienThi";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("cl", chatLieuService.getChatLieuById(id));
        return "ChatLieu/Detail";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        chatLieuService.deleteChatLieu(id);
        return "redirect:/chatlieu";
    }
    @PostMapping("/add")
    public String add(ChatLieuDTO chatLieu) {
        chatLieuService.createEndUpdateChatLieu(chatLieu);
        return "redirect:/chatlieu";
    }
    @PostMapping("/update")
    public String update(ChatLieuDTO chatLieu) {
        chatLieuService.createEndUpdateChatLieu(chatLieu);
        return "redirect:/chatlieu";
    }
}
