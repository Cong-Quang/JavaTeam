package com.example.Tuan;

import java.util.ArrayList;
import com.example.accsset.Color;

public class DanhSachNhanVien {
    private ArrayList<NhanVien> danhSach;
    private ArrayList<NhanVien> danhSachTimDuoc;

    public DanhSachNhanVien(){
        this.danhSach = new ArrayList<NhanVien>();
        this.danhSachTimDuoc = new ArrayList<>();
    }

    public DanhSachNhanVien(ArrayList<NhanVien> danhSach) {
        this.danhSach = danhSach;
        this.danhSachTimDuoc = new ArrayList<>();
    }
    public void themNhanVien(NhanVien nv){
        this.danhSach.add(nv);
    }

    public void xoaNhanVien(int chucVu){
        for(int i = danhSach.size() - 1; i >= 0; i--){
            if(danhSach.get(i).getChucVu() == chucVu){
                danhSach.remove(i);
            }
        }
    }

    public void timNhanVienTheoTuoi(int tuoi) {
        danhSachTimDuoc.clear(); // Xóa danh sách tìm được cũ

        for (NhanVien nv : danhSach) {
            if (nv.getTuoi() == tuoi) {
                danhSachTimDuoc.add(nv);
            }
        }

        // Nếu danh sách tìm được rỗng
        if (danhSachTimDuoc.isEmpty()) {
            System.out.println("Khong tim thay nhan vien nao voi tuoi nay.");
        } else {
            // In danh sách tìm được
            inDanhSachNhanVien();
        }
    }

    public void timNhanVienTheoChucVu(int chucVu) {
        danhSachTimDuoc.clear(); // Xóa danh sách tìm được cũ

        for (NhanVien nv : danhSach) {
            if (nv.getChucVu() == chucVu) {
                danhSachTimDuoc.add(nv);
            }
        }

        // Nếu danh sách tìm được rỗng
        if (danhSachTimDuoc.isEmpty()) {
            System.out.println("Không tim thay nhan vien nao voi chuc vu nay.");
        } else {
            // In danh sách tìm được
            inDanhSachNhanVien();
        }
    }

public void inDanhSachNhanVien() {
    // Nếu danh sách tìm được không có phần tử, in ra thông báo
    if (danhSachTimDuoc.isEmpty() && danhSach.isEmpty()) {
        System.out.println("Danh sach nhan vien rong.");
        return;
    }

    ArrayList<NhanVien> danhSachIn = danhSachTimDuoc.isEmpty() ? danhSach : danhSachTimDuoc;

    // Nếu danh sách tìm được không có phần tử
    // if (danhSachTimDuoc.isEmpty() && danhSachIn.isEmpty()) {
    //     System.out.println("Khong tim thay nhan vien nao");
    //     return;
    // }

    // In tiêu đề bảng
    System.out.format("%-5s %-15s %-10s %-8s %-15s %-15s %-10s\n",
            "STT", "Ho", "Ten", "Tuoi", "Ngay Sinh", "Ngay Vao Lam", "Chuc vu");
    System.out.println("---------------------------------------------------------------------------------");

    // In thông tin nhân viên
    for (int i = 0; i < danhSachIn.size(); i++) {
        NhanVien nv = danhSachIn.get(i);
        String ageColor;
        if (nv.getTuoi() <= 18) {
            ageColor = Color.cRed;
        } else if (nv.getTuoi() > 18 && nv.getTuoi() < 40) {
            ageColor = Color.cGreen;
        } else if (nv.getTuoi() >= 40 && nv.getTuoi() < 60) {
            ageColor = Color.cYellow;
        } else {
            ageColor = Color.cBrown;
        }
        String chucVuStr;
        switch (nv.getChucVu()) {
            case 0:
                chucVuStr = "Truong Nhom";
                break;
            case 1:
                chucVuStr = "Thu Ki";
                break;
            case 2:
                chucVuStr = "Giam Sat";
                break;
            default:
                chucVuStr = "Khac";
                break;
        }
        System.out.format("%-5s %-15s %-10s " + ageColor + "%-8d ",
                (i + 1), nv.getHo(), nv.getTen(), nv.getTuoi());
        Color.reset();
        System.out.format("%-15s %-15s %-10s\n",
                nv.getNgaySinh(), nv.getNgayVaoLam(), chucVuStr);
        }
    }

}
