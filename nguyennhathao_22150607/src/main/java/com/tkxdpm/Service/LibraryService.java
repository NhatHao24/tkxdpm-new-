package com.tkxdpm.Service;

import com.tkxdpm.Model.SachGiaoKhoa;
import com.tkxdpm.Model.SachThamKhao;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<SachGiaoKhoa> sachGiaoKhoaList;
    private List<SachThamKhao> sachThamKhaoList;

    public LibraryService() {
        sachGiaoKhoaList = new ArrayList<>();
        sachThamKhaoList = new ArrayList<>();
    }

    public void addSachGiaoKhoa(SachGiaoKhoa sachGiaoKhoa) {
        sachGiaoKhoaList.add(sachGiaoKhoa);
        System.out.println("Thêm sách giáo khoa thành công!");
    }

    public void addSachThamKhao(SachThamKhao sachThamKhao) {
        sachThamKhaoList.add(sachThamKhao);
        System.out.println("Thêm sách tham khảo thành công!");
    }

    public void printSachGiaoKhoaList() {
        System.out.println("Danh sách sách giáo khoa:");
        for (SachGiaoKhoa sach : sachGiaoKhoaList) {
            System.out.println(sach);
        }
    }

    public void printSachThamKhaoList() {
        System.out.println("Danh sách sách tham khảo:");
        for (SachThamKhao sach : sachThamKhaoList) {
            System.out.println(sach);
        }
    }
}