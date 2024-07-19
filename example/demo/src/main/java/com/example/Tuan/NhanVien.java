package com.example.Tuan;

import java.time.LocalDate;

public class NhanVien {
    private String ho;
    private String ten;
    private LocalDate ngaySinh;
    private int tuoi;
    private LocalDate ngayVaoLam;
    private int chucVu = 0;  // 0 Truong Nhom 1 Thu Ki 2 Giam Sat
    public NhanVien(String ho, String ten, LocalDate ngaySinh, int tuoi, LocalDate ngayVaoLam, int chucVu) {
        this.ho=ho;
        this.ten=ten;
        this.ngaySinh=ngaySinh;
        this.tuoi=tuoi;
        this.ngayVaoLam=ngayVaoLam;
        this.chucVu=chucVu;
    }


    public String getHo() {
        return this.ho;
    }
    public void setHo(String ho) {
        this.ho=ho;
    }

    public String getTen() {
        return this.ten;
    }
    public void setTen(String ten) {
        this.ten=ten;
    }

    public LocalDate getNgaySinh() {
        return this.ngaySinh;
    }
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh=ngaySinh;
    }

    public int getTuoi() {  
        return this.tuoi;
    }       
    public void setTuoi(int tuoi) {     
        this.tuoi=tuoi;
    }

    public LocalDate getNgayVaoLam() {  
        return this.ngayVaoLam;
    }
    public void setNgayVaoLam(LocalDate ngayVaoLam) {   
        this.ngayVaoLam=ngayVaoLam;
    }

    public int getChucVu() {
        return this.chucVu;
    }
    public void setChucVu(int chucVu) {
        this.chucVu=chucVu;
    }

}
