package com.tkxdpm.UseCase;

// import com.tkxdpm.Model.SachGiaoKhoa;
// import com.tkxdpm.Model.SachThamKhao;

import java.util.ArrayList;
import java.util.List;

import com.tkxdpm.Model.SachGiaoKhoa;
import com.tkxdpm.Model.SachThamKhao;

public class LibraryUseCase {
    private List<SachGiaoKhoa> sachGiaoKhoaList;
    private List<SachThamKhao> sachThamKhaoList;

    public LibraryUseCase() {
        sachGiaoKhoaList = new ArrayList<>();
        sachThamKhaoList = new ArrayList<>();
    }

    public void themSachGiaoKhoa(SachGiaoKhoa sachGiaoKhoa) {
        sachGiaoKhoaList.add(sachGiaoKhoa);
    }

    public void themSachThamKhao(SachThamKhao sachThamKhao) {
        sachThamKhaoList.add(sachThamKhao);
    }
}