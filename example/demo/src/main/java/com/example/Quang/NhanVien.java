package com.example.Quang;

import java.time.LocalDate;

public class NhanVien {
    private String ho;
    private String ten;
    private int tuoi;
    private LocalDate ngaySinh;
    private LocalDate ngayVaoLam;
    private int ChucVu = 0; // 0 nhân viên   1 Quản lý      2 Giám đốc
    private float Luong = 50000; // mặc định là 5tr
    private int GioLamViec = 0;// mặc định là 0 gio  
    // Constructor
    public NhanVien(String ho, String ten, int tuoi, LocalDate ngaySinh, LocalDate ngayVaoLam, int chucVu) {
        this.ho = ho;
        this.ten = ten;
        this.tuoi = tuoi;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.ChucVu = chucVu;
    }
    // tạo ra cấu trúc lấy ra và gắn vào thay vì trực tiếp ở biến
    // phân luồng dữ liệu và kiểm soát tốt hơn.
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
    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }
    public void setNgayVaoLam(LocalDate ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
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
        return GioLamViec;
    }
    public void setGioLamViec(int gioLamViec) {
        GioLamViec = gioLamViec;
    }
}