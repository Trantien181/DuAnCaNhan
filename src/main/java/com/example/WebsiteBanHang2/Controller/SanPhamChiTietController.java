package com.example.WebsiteBanHang2.Controller;

import com.example.WebsiteBanHang2.Dto.SanPhamChiTietDTO;
import com.example.WebsiteBanHang2.Service.SanPhamChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/samphamchitiet")
public class SanPhamChiTietController {
    @Autowired
    private SanPhamChiTietService sanPhamChiTietService;

    @GetMapping("")
    public String hienThi(Model model) {
        model.addAttribute("listSanPhamChiTiet", sanPhamChiTietService.getList());
        return "SanPhamChiTiet/HienThi";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("cl", sanPhamChiTietService.getSanPhamChiTietById(id));
        return "SanPhamChiTiet/Detail";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        sanPhamChiTietService.deleteSanPhamChiTiet(id);
        return "redirect:/SanPhamChiTiet";
    }
    @PostMapping("/add")
    public String add(SanPhamChiTietDTO SanPhamChiTiet) {
        sanPhamChiTietService.createEndUpdateSanPhamChiTiet(SanPhamChiTiet);
        return "redirect:/SanPhamChiTiet";
    }
    @PostMapping("/update")
    public String update(SanPhamChiTietDTO SanPhamChiTiet) {
        sanPhamChiTietService.createEndUpdateSanPhamChiTiet(SanPhamChiTiet);
        return "redirect:/SanPhamChiTiet";
    }
}
