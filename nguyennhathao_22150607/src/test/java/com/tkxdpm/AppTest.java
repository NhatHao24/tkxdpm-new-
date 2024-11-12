package com.tkxdpm;

import com.tkxdpm.Model.SachGiaoKhoa;
import com.tkxdpm.Model.SachThamKhao;
import com.tkxdpm.Service.LibraryService;

import java.util.Date;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Chương trình quản lý thư viện");
            System.out.println("1. Thêm sách giáo khoa");
            System.out.println("2. Thêm sách tham khảo");
            System.out.println("3. In danh sách sách giáo khoa");
            System.out.println("4. In danh sách sách tham khảo");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                
                    System.out.print("Nhập mã sách: ");
                    String maSachGiaoKhoa = scanner.nextLine();
                    System.out.print("Nhập ngày nhập (dd/MM/yyyy): ");
                    Date ngayNhapGiaoKhoa = new Date(); 
                    System.out.print("Nhập đơn giá: ");
                    double donGiaGiaoKhoa = scanner.nextDouble();
                    System.out.print("Nhập số lượng: ");
                    int soLuongGiaoKhoa = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập nhà xuất bản: ");
                    String nhaXuatBanGiaoKhoa = scanner.nextLine();
                    System.out.print("Nhập tình trạng: ");
                    String tinhTrangGiaoKhoa = scanner.nextLine();

                    SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa(maSachGiaoKhoa, donGiaGiaoKhoa, soLuongGiaoKhoa, nhaXuatBanGiaoKhoa, tinhTrangGiaoKhoa);
                    libraryService.addSachGiaoKhoa(sachGiaoKhoa);
                    break;

                case 2:
                    
                    System.out.print("Nhập mã sách: ");
                    String maSachThamKhao = scanner.nextLine();
                    System.out.print("Nhập ngày nhập (dd/MM/yyyy): ");
                    Date ngayNhapThamKhao = new Date(); 
                    System.out.print("Nhập đơn giá: ");
                    double donGiaThamKhao = scanner.nextDouble();
                    System.out.print("Nhập số lượng: ");
                    int soLuongThamKhao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập nhà xuất bản: ");
                    String nhaXuatBanThamKhao = scanner.nextLine();
                    System.out.print("Nhập thuế: ");
                    double thue = scanner.nextDouble();

                    SachThamKhao sachThamKhao = new SachThamKhao(maSachThamKhao, ngayNhapThamKhao, donGiaThamKhao, soLuongThamKhao, nhaXuatBanThamKhao, thue);
                    libraryService.addSachThamKhao(sachThamKhao);
                    break;

                case 3:
                    
                    libraryService.printSachGiaoKhoaList();
                    break;

                case 4:
                    
                    libraryService.printSachThamKhaoList();
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}