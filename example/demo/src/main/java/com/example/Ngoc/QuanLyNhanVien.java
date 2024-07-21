package com.example.Ngoc;
import java.util.ArrayList;
import java.util.Scanner;

class NhanVien {
    private String ten;
    private int tuoi;
    private int soNgayDaVaoLam;
    private String chucVu;

    public NhanVien(String ten, int tuoi, int soNgayDaVaoLam, String chucVu) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.soNgayDaVaoLam = soNgayDaVaoLam;
        this.chucVu = chucVu;
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

    public int getSoNgayDaVaoLam() {
        return soNgayDaVaoLam;
    }

    public void setSoNgayDaVaoLam(int soNgayDaVaoLam) {
        this.soNgayDaVaoLam = soNgayDaVaoLam;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    
    public String toString() {
        return "NhanVien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", soNgayDaVaoLam=" + soNgayDaVaoLam +
                ", chucVu='" + chucVu + '\'' +
                '}';
    }
}

public class QuanLyNhanVien {
    private static ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== He thong Quan ly Nhan vien =====");
            System.out.println("1. Them Nhan vien");
            System.out.println("2. Xoa Nhan vien");
            System.out.println("3. Sua Nhan vien");
            System.out.println("4. Xuat thong tin Nhan vien");
            System.out.println("5. Tim kiem Nhan vien");
            System.out.println("6. Thoat");
            System.out.print("Chon mot tuy chon: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (luaChon) {
                case 1:
                    themNhanVien(scanner);
                    break;
                case 2:
                    xoaNhanVien(scanner);
                    break;
                case 3:
                    suaNhanVien(scanner);
                    break;
                case 4:
                    xuatThongTinNhanVien();
                    break;
                case 5:
                    timKiemNhanVien(scanner);
                    break;
                case 6:
                    System.out.println("Dang thoat he thong...");
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
            }
        }
    }

    private static void themNhanVien(Scanner scanner) {
        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = scanner.nextInt();
        System.out.print("Nhap so ngay da vao lam: ");
        int soNgayDaVaoLam = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Nhap chuc vu: ");
        String chucVu = scanner.nextLine();

        NhanVien nhanVienMoi = new NhanVien(ten, tuoi, soNgayDaVaoLam, chucVu);
        danhSachNhanVien.add(nhanVienMoi);
        System.out.println("Them Nhan vien thanh cong.");
    }

    private static void xoaNhanVien(Scanner scanner) {
        System.out.print("Nhap ten Nhan vien can xoa: ");
        String ten = scanner.nextLine();
        NhanVien nhanVienCanXoa = null;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getTen().equalsIgnoreCase(ten)) {
                nhanVienCanXoa = nv;
                break;
            }
        }

        if (nhanVienCanXoa != null) {
            danhSachNhanVien.remove(nhanVienCanXoa);
            System.out.println("Xoa Nhan vien thanh cong.");
        } else {
            System.out.println("Khong tim thay Nhan vien.");
        }
    }

    private static void suaNhanVien(Scanner scanner) {
        System.out.print("Nhap ten Nhan vien can sua: ");
        String ten = scanner.nextLine();
        NhanVien nhanVienCanSua = null;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getTen().equalsIgnoreCase(ten)) {
                nhanVienCanSua = nv;
                break;
            }
        }

        if (nhanVienCanSua != null) {
            System.out.print("Nhap ten moi (bo trong de giu nguyen): ");
            String tenMoi = scanner.nextLine();
            if (!tenMoi.isEmpty()) {
                nhanVienCanSua.setTen(tenMoi);
            }

            System.out.print("Nhap tuoi moi (bo trong de giu nguyen): ");
            String tuoiMoiStr = scanner.nextLine();
            if (!tuoiMoiStr.isEmpty()) {
                int tuoiMoi = Integer.parseInt(tuoiMoiStr);
                nhanVienCanSua.setTuoi(tuoiMoi);
            }

            System.out.print("Nhap so ngay da vao lam moi (bo trong de giu nguyen): ");
            String soNgayDaVaoLamMoiStr = scanner.nextLine();
            if (!soNgayDaVaoLamMoiStr.isEmpty()) {
                int soNgayDaVaoLamMoi = Integer.parseInt(soNgayDaVaoLamMoiStr);
                nhanVienCanSua.setSoNgayDaVaoLam(soNgayDaVaoLamMoi);
            }

            System.out.print("Nhap chuc vu moi (bo trong de giu nguyen): ");
            String chucVuMoi = scanner.nextLine();
            if (!chucVuMoi.isEmpty()) {
                nhanVienCanSua.setChucVu(chucVuMoi);
            }

            System.out.println("Sua Nhan vien thanh cong.");
        } else {
            System.out.println("Khong tim thay Nhan vien.");
        }
    }

    private static void xuatThongTinNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Khong co Nhan vien nao de hien thi.");
        } else {
            for (NhanVien nv : danhSachNhanVien) {
                System.out.println(nv);
            }
        }
    }

    private static void timKiemNhanVien(Scanner scanner) {
        System.out.print("Nhap ten Nhan vien can tim: ");
        String ten = scanner.nextLine();
        boolean timThay = false;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getTen().equalsIgnoreCase(ten)) {
                System.out.println(nv);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay Nhan vien.");
        }
    }
}