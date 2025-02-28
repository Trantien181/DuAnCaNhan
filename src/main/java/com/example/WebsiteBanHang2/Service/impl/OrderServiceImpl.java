package com.example.WebsiteBanHang2.Service.impl;

import com.example.WebsiteBanHang2.Dto.HoaDonChiTietDTO;
import com.example.WebsiteBanHang2.Dto.HoaDonDTO;
import com.example.WebsiteBanHang2.Model.GioHang.ShoppingCart;
import com.example.WebsiteBanHang2.Model.HoaDon;
import com.example.WebsiteBanHang2.Model.HoaDonChiTiet;
import com.example.WebsiteBanHang2.Model.SanPhamChiTiet;
import com.example.WebsiteBanHang2.Model.UserAccount;
import com.example.WebsiteBanHang2.Repository.*;
import com.example.WebsiteBanHang2.Service.HoaDonService;
import com.example.WebsiteBanHang2.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    HoaDonRepository hoaDonRepository;
    @Autowired
    HoaDonService hoaDonService;
    @Autowired
    HoaDonChiTietRepository hoaDonChiTietRepository;
    @Autowired
    SanPhamChiTietRepository sanPhamChiTietRepository;
    @Autowired
    DonViVanChuyenRepository donViVanChuyenRepository;
    @Autowired
    UserAccountRepository userAccountRepository;
    // Lấy danh sách đơn hàng PENDING
    public List<HoaDon> getPendingOrders() {
        return hoaDonService.findByTrangThaiVanChuyen(HoaDon.TrangThaiVanChuyen.PENDING);
    }


    // Xác nhận đơn hàng
    @Transactional
    public HoaDon confirmOrder(Integer orderId) {
        HoaDon hoaDon = hoaDonRepository.findById(orderId)
                .orElseThrow(() -> new IllegalArgumentException("Không tìm thấy đơn hàng"));

        if (hoaDon.getTrangThaiVanChuyen() != HoaDon.TrangThaiVanChuyen.PENDING) {
            throw new IllegalStateException("Đơn hàng không ở trạng thái PENDING");
        }

        hoaDon.setTrangThaiVanChuyen(HoaDon.TrangThaiVanChuyen.SHIPPED);
        return hoaDonRepository.save(hoaDon);
    }

    // Hủy đơn hàng
    @Transactional
    public HoaDon cancelOrder(Integer orderId) {
        HoaDon hoaDon = hoaDonRepository.findById(orderId)
                .orElseThrow(() -> new IllegalArgumentException("Không tìm thấy đơn hàng"));

        if (hoaDon.getTrangThaiVanChuyen() != HoaDon.TrangThaiVanChuyen.PENDING) {
            throw new IllegalStateException("Đơn hàng không ở trạng thái PENDING");
        }

        // Cập nhật trạng thái
        hoaDon.setTrangThaiVanChuyen(HoaDon.TrangThaiVanChuyen.CANCELLED);
        hoaDonRepository.save(hoaDon);

        // Hoàn lại số lượng sản phẩm
        List<HoaDonChiTietDTO> chiTiets = hoaDonChiTietRepository.findByHoaDonId_Id(orderId);
        for (HoaDonChiTietDTO chiTiet : chiTiets) {
            SanPhamChiTiet spct = chiTiet.getSanPhamChiTietId();
            spct.setSoLuong(spct.getSoLuong() + chiTiet.getSoLuong());
            sanPhamChiTietRepository.save(spct);
        }
        return hoaDon;
    }
    @Override
    @Transactional
    public HoaDonDTO placeOrder(UserAccount khachHang, ShoppingCart cart, String diaChiGiaoHang, Integer idDonViVanChuyen) {
        return null;
    }

}
