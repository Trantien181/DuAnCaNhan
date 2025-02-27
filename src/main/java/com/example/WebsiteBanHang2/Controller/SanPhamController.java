package com.example.WebsiteBanHang2.Controller;

import com.example.WebsiteBanHang2.Dto.SanPhamDTO;
import com.example.WebsiteBanHang2.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sanpham")
public class SanPhamController {
    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping("")
    public String hienThi(Model model) {
        model.addAttribute("listSanPham", sanPhamService.getList());
        return "SanPham/HienThi";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("cl", sanPhamService.getSanPhamDTOById(id));
        return "SanPham/Detail";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        sanPhamService.deleteSanPhamDTO(id);
        return "redirect:/SanPham";
    }
    @PostMapping("/add")
    public String add(SanPhamDTO SanPham) {
        sanPhamService.createEndUpdateSanPhamDTO(SanPham);
        return "redirect:/SanPham";
    }
    @PostMapping("/update")
    public String update(SanPhamDTO SanPham) {
        sanPhamService.createEndUpdateSanPhamDTO(SanPham);
        return "redirect:/SanPham";
    }
}
