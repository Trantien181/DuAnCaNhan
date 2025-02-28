package com.example.WebsiteBanHang2.Controller;

import com.example.WebsiteBanHang2.Dto.HoaDonDTO;
import com.example.WebsiteBanHang2.Model.HoaDon;
import com.example.WebsiteBanHang2.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/staff/orders")
public class StaffOrderController {
    @Autowired
    private OrderService orderService;

    // Xem danh sách đơn hàng PENDING
    @GetMapping("/pending")
    public String getPendingOrders(Model model) {
        model.addAttribute("orders", orderService.getPendingOrders());
        return "OrderStatus/Order";
    }

    // Xác nhận đơn hàng
    @GetMapping("/{orderId}/confirm")
    public ResponseEntity<HoaDon> confirmOrder(@PathVariable Integer orderId) {
        return ResponseEntity.ok(orderService.confirmOrder(orderId));
    }

    // Hủy đơn hàng
    @GetMapping("/{orderId}/cancel")
    public ResponseEntity<HoaDon> cancelOrder(@PathVariable Integer orderId) {
        return ResponseEntity.ok(orderService.cancelOrder(orderId));
    }
}
