package com.example.Quang;

import java.time.LocalDate;

public class Quang {
    public Quang(){
        // data mẫu
        NhanVien[] nv = new NhanVien[5];
        nv[0] = new NhanVien("Nguyen", "Van A", 17, LocalDate.of(2000, 1, 1), LocalDate.of(2020, 1, 2),1);
        nv[1] = new NhanVien("Nguyen", "Van B", 21, LocalDate.of(2001, 2, 6), LocalDate.of(2021, 2, 3),2);
        nv[2] = new NhanVien("Nguyen", "Van C", 22, LocalDate.of(2002, 3, 7), LocalDate.of(2023, 3, 4),0);
        nv[3] = new NhanVien("Nguyen", "Van D", 61, LocalDate.of(2003, 4, 8), LocalDate.of(2024, 4, 5),0);
        nv[4] = new NhanVien("Nguyen", "Van E", 24, LocalDate.of(2004, 5, 9), LocalDate.of(2025, 5, 6),4);
        Handle h = new Handle(nv);
        h.ShowNV();
    }        
}

