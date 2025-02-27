package com.example.WebsiteBanHang2.Controller;

import com.example.WebsiteBanHang2.Dto.ThietKeDTO;
import com.example.WebsiteBanHang2.Service.ThietKeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/thietke")
public class ThietKeController {
    @Autowired
    private ThietKeService thietKeService;

    @GetMapping("")
    public String hienThi(Model model) {
        model.addAttribute("listThietKe", thietKeService.getList());
        return "ThietKe/HienThi";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("cl", thietKeService.getThietKeById(id));
        return "ThietKe/Detail";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        thietKeService.deleteThietKe(id);
        return "redirect:/ThietKe";
    }
    @PostMapping("/add")
    public String add(ThietKeDTO ThietKe) {
        thietKeService.createEndUpdateThietKe(ThietKe);
        return "redirect:/ThietKe";
    }
    @PostMapping("/update")
    public String update(ThietKeDTO ThietKe) {
        thietKeService.createEndUpdateThietKe(ThietKe);
        return "redirect:/ThietKe";
    }
}
