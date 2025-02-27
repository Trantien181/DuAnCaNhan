package com.example.WebsiteBanHang2.Controller;

import com.example.WebsiteBanHang2.Dto.MauSacDTO;
import com.example.WebsiteBanHang2.Service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mausac")
public class MauSacController {
    @Autowired
    private MauSacService mauSacService;

    @GetMapping("")
    public String hienThi(Model model) {
        model.addAttribute("listMauSac", mauSacService.getList());
        return "MauSac/HienThi";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("cl", mauSacService.getMauSacById(id));
        return "MauSac/Detail";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        mauSacService.deleteMauSac(id);
        return "redirect:/MauSac";
    }
    @PostMapping("/add")
    public String add(MauSacDTO MauSac) {
        mauSacService.createEndUpdateMauSac(MauSac);
        return "redirect:/MauSac";
    }
    @PostMapping("/update")
    public String update(MauSacDTO MauSac) {
        mauSacService.createEndUpdateMauSac(MauSac);
        return "redirect:/MauSac";
    }
}
