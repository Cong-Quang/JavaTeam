package com.example.Ngan;

import java.time.LocalDate;

public class Manage {
    private static Nhanvien[] dsNhanvien;

    // Constructor
    public Manage() {
        dsNhanvien = new Nhanvien[5];
        dsNhanvien[0] = new Nhanvien("Nguyen Van", "A", 17, LocalDate.of(2000, 1, 1), LocalDate.of(2020, 1, 2), 1);
        dsNhanvien[1] = new Nhanvien("Nguyen Van", "Ti", 21, LocalDate.of(2001, 2, 6), LocalDate.of(2021, 2, 3), 2);
        dsNhanvien[2] = new Nhanvien("Vo Thi", "Chuc", 22, LocalDate.of(2002, 3, 7), LocalDate.of(2023, 3, 4), 0);
        dsNhanvien[3] = new Nhanvien("Truong Ba", "Ba", 61, LocalDate.of(2003, 4, 8), LocalDate.of(2024, 4, 5), 0);
        dsNhanvien[4] = new Nhanvien("ANh Ba", "Khia", 24, LocalDate.of(2004, 5, 9), LocalDate.of(2025, 5, 6), 4);
        Print print = new Print();
        print.ShowDS(dsNhanvien);
    }
        

}
