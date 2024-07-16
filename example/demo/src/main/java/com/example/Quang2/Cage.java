package com.example.Quang2;

import java.time.LocalDate;
public class Cage {

    public float with, height; // kích thước chuồng
    public String AnimalCage; // tên loại chuồng

    public LocalDate NgayVS; // ngày cần vệ sinh chuồng
    public LocalDate NgayOpen; // ngày mở chuồng

    public Local local; // vị trí chuồng
   
    public Cage( float with, float height, String AnimalCage, LocalDate NgayVS, LocalDate NgayOpen, Local local) {
        this.with = with;
        this.height = height;
        this.AnimalCage = AnimalCage;
        this.NgayVS = NgayVS;
        this.NgayOpen = NgayOpen;
        this.local = local;
    }
    
}
