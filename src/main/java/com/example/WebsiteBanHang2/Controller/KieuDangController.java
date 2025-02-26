package com.example.WebsiteBanHang2.Controller;

import com.example.WebsiteBanHang2.Dto.KieuDangDTO;
import com.example.WebsiteBanHang2.Model.KieuDang;
import com.example.WebsiteBanHang2.Service.KieuDangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/kieudang")
public class KieuDangController {
    @Autowired
    KieuDangService kieudangService;
    @GetMapping("")
    public String kieudang(Model model) {
        model.addAttribute("listKieuDang", kieudangService.getList());
        return "KieuDang/HienThi";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("kd", kieudangService.getKieuDangById(id));
        return "KieuDang/Detail";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        kieudangService.deleteKieuDang(id);
        return "redirect:/kieudang";
    }
    @PostMapping("/add")
    public String add(KieuDangDTO kieudang) {
        kieudangService.createEndUpdateKieuDang(kieudang);
        return "redirect:/kieudang";
    }
    @PostMapping("/update")
    public String update(KieuDangDTO kieudang) {
        kieudangService.createEndUpdateKieuDang(kieudang);
        return "redirect:/kieudang";
    }
}
