package com.example.Tuan;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import com.example.accsset.Color;

public class DanhSachNhanVien {
    private ArrayList<NhanVien> danhSach;
    private ArrayList<NhanVien> danhSachTimDuoc;

    public DanhSachNhanVien(){
        this.danhSach = new ArrayList<>();
    }

    public DanhSachNhanVien(ArrayList<NhanVien> danhSach) {
        this.danhSach = danhSach;
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
        danhSachTimDuoc = new ArrayList<>(); // Khởi tạo danh sách tìm được
        for (NhanVien nv : danhSach) {
            if (nv.getTuoi() == tuoi) {
                danhSachTimDuoc.add(nv);
            }
        }
        inDanhSachNhanVien();
    }

    public void timNhanVienTheoNgaySinh(String birthDate) {
        danhSachTimDuoc = new ArrayList<>(); // Khởi tạo danh sách tìm được
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (NhanVien nv : danhSach) {
            if (nv.getbirthDate().format(formatter).equals(birthDate)) {
                danhSachTimDuoc.add(nv);
            }
        }
        inDanhSachNhanVien();
    }

    public void timNhanVienTheoNamSinh(int namSinh) {
        danhSachTimDuoc = new ArrayList<>(); // Khởi tạo danh sách tìm được
        for (NhanVien nv : danhSach) {
            if (nv.getbirthDate().getYear() == namSinh) {
                danhSachTimDuoc.add(nv);
            }
        }
        inDanhSachNhanVien();
    }

    public void timNhanVienTheoThangSinh(int thangSinh) {
        danhSachTimDuoc = new ArrayList<>(); // Khởi tạo danh sách tìm được
        for (NhanVien nv : danhSach) {
            if (nv.getbirthDate().getMonthValue() == thangSinh) {
                danhSachTimDuoc.add(nv);
            }
        }
        inDanhSachNhanVien();
    }

    public void timNhanVienTheoChucVu(int chucVu) {
        danhSachTimDuoc = new ArrayList<>(); // Khởi tạo danh sách tìm được
        for (NhanVien nv : danhSach) {
            if (nv.getChucVu() == chucVu) {
                danhSachTimDuoc.add(nv);
            }
        }
        inDanhSachNhanVien();
    }

    public void inDanhSachNhanVien() {
        ArrayList<NhanVien> danhSachIn = (danhSachTimDuoc == null || danhSachTimDuoc.isEmpty()) ? danhSach : danhSachTimDuoc;

        if (danhSachIn.isEmpty()) {
            System.out.println("Khong tim thay nhan vien nao");
            return;
        }

        System.out.format("%-5s %-15s %-10s %-8s %-15s %-15s %-10s\n",
                "STT", "Ho", "Ten", "Tuoi", "Ngay Sinh", "Ngay Vao Lam", "Chuc vu");
        System.out.println("---------------------------------------------------------------------------------");

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
                    nv.getbirthDate(), nv.getNgayVaoLam(), chucVuStr);
        }
    }

}
