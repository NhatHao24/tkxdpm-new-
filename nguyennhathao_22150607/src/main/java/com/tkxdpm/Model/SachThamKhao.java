package com.tkxdpm.Model;

import java.util.Date;

public class SachThamKhao {
    private String maSach;
    private Date ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;
    private double thue;

    public SachThamKhao(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
        this.thue = thue;
    }

    // @Override
    // public String toString() {
    //     return "Sách Tham Khảo [Mã sách: " + maSach + ", Ngày nhập: " + ngayNhap + ", Đơn giá: " + donGia + ", Số lượng: " + soLuong + ", Nhà xuất bản: " + nhaXuatBan + ", Thuế: " + thue + "]";
    // }
    
    public String getMaSach() {
        return maSach;
    }

    // Setter for maSach
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    // Getter for ngayNhap
    public Date getNgayNhap() {
        return ngayNhap;
    }

    // Setter for ngayNhap
    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    // Getter for donGia
    public double getDonGia() {
        return donGia;
    }

    // Setter for donGia
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    // Getter for soLuong
    public int getSoLuong() {
        return soLuong;
    }

    // Setter for soLuong
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    // Getter for nhaXuatBan
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    // Setter for nhaXuatBan
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    // Getter for thue
    public double getThue() {
        return thue;
    }

    // Setter for thue
    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public String toString() {
        return "SachThamKhao{" +
                "maSach='" + maSach + '\'' +
                ", ngayNhap=" + ngayNhap +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", thue=" + thue +
                '}';
    }
}