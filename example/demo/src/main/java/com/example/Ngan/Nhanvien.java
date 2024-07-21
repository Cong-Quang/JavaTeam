package com.example.Ngan;

import java.time.LocalDate;

public class Nhanvien {
    private String ho;
    private String ten;
    private int tuoi;
    private LocalDate ngaySinh;
    private int ChucVu = 0; // 0 nhân viên, 1 Quản lý, 2 Giám đốc
    private float Luong = 3600; 
    private int gioLam = 0;
    
    // Constructor
    public Nhanvien(String ho, String ten, int tuoi, LocalDate ngaySinh, int chucVu) {
        this.ho = ho;
        this.ten = ten;
        this.tuoi = tuoi;
        this.ngaySinh = ngaySinh;
        this.ChucVu = chucVu;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getChucVu() {
        return ChucVu;
    }

    public void setChucVu(int chucVu) {
        ChucVu = chucVu;
    }

    public float getLuong() {
        return Luong;
    }

    public void setLuong(float luong) {
        Luong = luong;
    }

    public int getGioLamViec() {
        return gioLam;
    }

    public void setGioLamViec(int gioLamViec) {
        gioLam = gioLamViec;
    }
}
