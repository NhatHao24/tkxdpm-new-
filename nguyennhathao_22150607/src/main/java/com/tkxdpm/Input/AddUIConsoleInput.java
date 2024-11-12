package com.tkxdpm.Input;

import com.tkxdpm.UseCase.LibraryUseCase;
import com.tkxdpm.Model.SachGiaoKhoa;
import com.tkxdpm.Model.SachThamKhao;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AddUIConsoleInput {
    private LibraryUseCase libraryUseCase;
    private Scanner scanner;

    public AddUIConsoleInput() {
        libraryUseCase = new LibraryUseCase();
        scanner = new Scanner(System.in);
    }

    public void addSachGiaoKhoa() {
        System.out.println("Nhập mã sách: ");
        String maSach = scanner.nextLine();

        System.out.println("Nhập ngày nhập (dd/MM/yyyy): ");
        String ngayNhapStr = scanner.nextLine();
        Date ngayNhap = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            ngayNhap = sdf.parse(ngayNhapStr);
        } catch (ParseException e) {
            System.out.println("Ngày nhập không hợp lệ.");
            return;
        }

        System.out.println("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();

        System.out.println("Nhập số lượng: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.println("Nhập nhà xuất bản: ");
        String nhaXuatBan = scanner.nextLine();

        System.out.println("Nhập tình trạng (mới/cũ): ");
        String tinhTrang = scanner.nextLine();

        SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, tinhTrang);
        libraryUseCase.themSachGiaoKhoa(sachGiaoKhoa);
        System.out.println("Thêm sách giáo khoa thành công!");
    }

    public void addSachThamKhao() {
        System.out.println("Nhập mã sách: ");
        String maSach = scanner.nextLine();

        System.out.println("Nhập ngày nhập (dd/MM/yyyy): ");
        String ngayNhapStr = scanner.nextLine();
        Date ngayNhap = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            ngayNhap = sdf.parse(ngayNhapStr);
        } catch (ParseException e) {
            System.out.println("Ngày nhập không hợp lệ.");
            return;
        }

        System.out.println("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();

        System.out.println("Nhập số lượng: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.println("Nhập nhà xuất bản: ");
        String nhaXuatBan = scanner.nextLine();

        System.out.println("Nhập thuế: ");
        double thue = scanner.nextDouble();

        SachThamKhao sachThamKhao = new SachThamKhao(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, thue);
        libraryUseCase.themSachThamKhao(sachThamKhao);
        System.out.println("Thêm sách tham khảo thành công!");
    }
}