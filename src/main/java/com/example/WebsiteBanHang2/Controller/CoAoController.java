package com.example.WebsiteBanHang2.Controller;

import com.example.WebsiteBanHang2.Dto.CoAoDTO;
import com.example.WebsiteBanHang2.Model.CoAo;
import com.example.WebsiteBanHang2.Service.CoAoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/coao")
public class CoAoController {
    @Autowired
    CoAoService coAoService;
    @GetMapping("")
    public String coao(Model model) {
        model.addAttribute("listCoAo", coAoService.getList());
        return "CoAo/HienThi";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("ca", coAoService.getCoAoById(id));
        return "CoAo/Detail";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        coAoService.deleteCoAo(id);
        return "redirect:/coao";
    }
    @PostMapping("/add")
    public String add(CoAoDTO coAo) {
        coAoService.createEndUpdateCoAo(coAo);
        return "redirect:/coao";
    }
    @PostMapping("/update")
    public String update(CoAoDTO coAo) {
        coAoService.createEndUpdateCoAo(coAo);
        return "redirect:/coao";
    }
}
