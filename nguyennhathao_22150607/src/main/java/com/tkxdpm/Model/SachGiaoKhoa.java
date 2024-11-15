package com.tkxdpm.Model;

// import java.util.Date;

public class SachGiaoKhoa {
    private String maSach;
    // private Date ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;
    private String tinhTrang;

    public SachGiaoKhoa(String maSach, 
    // Date ngayNhap, 
    double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        this.maSach = maSach;
        // this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
        this.tinhTrang = tinhTrang;
    }
    // @Override
    // public String toString() {
    //     return "Sách Giáo Khoa [Mã sách: " + maSach + ", Ngày nhập: " + ngayNhap + ", Đơn giá: " + donGia + ", Số lượng: " + soLuong + ", Nhà xuất bản: " + nhaXuatBan + ", Tình trạng: " + tinhTrang + "]";
    // }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
 
    // public Date getNgayNhap() {
    //     return ngayNhap;
    // }

    // public void setNgayNhap(Date ngayNhap) {
    //     this.ngayNhap = ngayNhap;
    // }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
 
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "SachGiaoKhoa{" +
                "maSach='" + maSach + '\'' +
                // ", ngayNhap=" + ngayNhap +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", tinhTrang='" + tinhTrang + '\'' +
                '}';
    }
}