package com.tkxdpm.Controller;

import com.tkxdpm.Input.AddUIConsoleInput;

public class LibraryController {
    private AddUIConsoleInput addUIConsoleInput;

    public LibraryController() {
        addUIConsoleInput = new AddUIConsoleInput();
    }

    public void start() {
        
        addUIConsoleInput.addSachGiaoKhoa();
        addUIConsoleInput.addSachThamKhao();
    }
}