package com.example.Ngan;

import java.time.LocalDate;

public class Manage{
    //ds mau
    public Manage(){
        Nhanvien[] ds = new Nhanvien[5];
        ds[0] = new Nhanvien("Nguyen Van", "A", 17, LocalDate.of(2000, 1, 1), LocalDate.of(2020, 1, 2),1);
        ds[1] = new Nhanvien("Nguyen Van", "Tí", 21, LocalDate.of(2001, 2, 6), LocalDate.of(2021, 2, 3),2);
        ds[2] = new Nhanvien("Vo Thi", "Chúc", 22, LocalDate.of(2002, 3, 7), LocalDate.of(2023, 3, 4),0);
        ds[3] = new Nhanvien("Truong Ba", "Ba", 61, LocalDate.of(2003, 4, 8), LocalDate.of(2024, 4, 5),0);
        ds[4] = new Nhanvien("ANh Ba", "Khía", 24, LocalDate.of(2004, 5, 9), LocalDate.of(2025, 5, 6),4);
    }
}
