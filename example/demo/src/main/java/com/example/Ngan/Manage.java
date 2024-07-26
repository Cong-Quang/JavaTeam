package com.example.Ngan;

import java.time.LocalDate;

public class Manage {
    private Nhanvien[] ds;
    private Menu menu;

    // Constructor
    public Manage() {
        ds = new Nhanvien[5];
        ds[0] = new Nhanvien("Nguyen Van", "A", 17, LocalDate.of(2000, 1, 1), 1);
        ds[1] = new Nhanvien("Nguyen Van", "Ti", 21, LocalDate.of(2001, 2, 6), 2);
        ds[2] = new Nhanvien("Vo Thi", "Chuc", 22, LocalDate.of(2002, 3, 7), 0);
        ds[3] = new Nhanvien("Truong Ba", "Ba", 61, LocalDate.of(2003, 4, 8),0);
        ds[4] = new Nhanvien("ANh Ba", "Khia", 24, LocalDate.of(2004, 5, 9), 4);
        menu = new Menu(ds);
        menu.displayMenu(); 
    }
}
