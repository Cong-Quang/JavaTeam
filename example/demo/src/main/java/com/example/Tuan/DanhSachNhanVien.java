package com.example.Tuan;

import java.util.ArrayList;
import com.example.accsset.Color;

public class DanhSachNhanVien {
    ArrayList<NhanVien> danhSach;

    public DanhSachNhanVien(){
        this.danhSach = new ArrayList<NhanVien>();
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
    public void inDanhSachNhanVien() {
        // In ra tiêu đề của bảng
        System.out.format("%-5s %-15s %-10s %-8s %-15s %-15s %-10s\n",
                "STT", "Ho", "Ten", "Tuoi", "Ngay Sinh", "Ngay Vao Lam", "Chuc vu");
        System.out.println("---------------------------------------------------------------------------------");

        // In ra từng dòng thông tin nhân viên
        for (int i = 0; i < danhSach.size(); i++) {
            NhanVien nv = danhSach.get(i);
            String ageColor;
            if (nv.getTuoi() <= 18) {
                ageColor = Color.cRed;
            } else if (nv.getTuoi() > 18 && nv.getTuoi() < 40) {
                ageColor = Color.cGreen;
            } else if(nv.getTuoi() >= 40 && nv.getTuoi() < 60) {
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

            System.out.format("%-5s %-15s %-10s " + ageColor + "%-8s ", 
                    (i + 1), nv.getHo(), nv.getTen(), nv.getTuoi());
            Color.reset(); // Reset màu sau khi in tuổi
            System.out.format("%-15s %-15s %-10s\n", 
                    nv.getNgaySinh(), nv.getNgayVaoLam(), chucVuStr);
        }
    }

}
