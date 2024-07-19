package com.example.Tuan;

import java.time.LocalDate;

public class Boss {
    public Boss(){
        DanhSachNhanVien ds = new DanhSachNhanVien();
        ds.themNhanVien(new NhanVien("Nguyen", "Anh", LocalDate.of(1999, 4, 15), 20, LocalDate.of(2020, 1, 10), 1));
        ds.themNhanVien(new NhanVien("Tran", "Binh", LocalDate.of(1979, 8, 20), 40 , LocalDate.of(2000, 3, 25), 2));
        ds.themNhanVien(new NhanVien("Le", "Cao", LocalDate.of(1964, 12, 1), 55, LocalDate.of(1995, 7, 12), 1));
        ds.themNhanVien(new NhanVien("Pham", "Duy", LocalDate.of(1994, 6, 19), 23, LocalDate.of(2015, 11, 30), 2));
        ds.themNhanVien(new NhanVien("Hoang", "E", LocalDate.of(2006, 1, 15), 17, LocalDate.of(2023, 5, 1), 1));
        InOut in = new InOut(ds);
        in.Menu();
    }
}
