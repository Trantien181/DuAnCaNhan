package com.example.WebsiteBanHang2.Controller;

import com.example.WebsiteBanHang2.Dto.KichThuocDTO;
import com.example.WebsiteBanHang2.Model.KichThuoc;
import com.example.WebsiteBanHang2.Service.KichThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/kichthuoc")
public class KichThuocController {
    @Autowired
    private KichThuocService kichThuocService;
    @GetMapping("")
    public String kichThuoc(Model model) {
        model.addAttribute("listKichThuoc", kichThuocService.getList());
        return "KichThuoc/HienThi";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("kt", kichThuocService.getKichThuocById(id));
        return "KichThuoc/Detail";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        kichThuocService.deleteKichThuoc(id);
        return "redirect:/kichthuoc";
    }
    @PostMapping("/add")
    public String add(KichThuocDTO kichThuoc) {
        kichThuocService.createEndUpdateKichThuoc(kichThuoc);
        return "redirect:/kichthuoc";
    }
    @PostMapping("/update")
    public String update(KichThuocDTO kichThuoc) {
        kichThuocService.createEndUpdateKichThuoc(kichThuoc);
        return "redirect:/kichthuoc";
    }
}
