package com.example.Tuan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeParseException;
import java.util.Scanner;
import com.example.accsset.Color;

public class InOut {
    private DanhSachNhanVien dsnv = new DanhSachNhanVien();
    Scanner scanner = new Scanner(System.in);
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public int luachon = 0;

    public static void loader(int total) throws InterruptedException {
        for (int i = 0; i <= total; i++) {
            progressBar(i, total);
            Thread.sleep(50); 
        }
        clearLine();
    }

    private static void progressBar(int current, int total) {
        String[] animationFrames = {"|", "/", "-", "\\"};
        int frameIndex = current % animationFrames.length;

        int barLength = 100; 
        int progress = (int) ((double) current / total * barLength);
        String bar = "[";

        // Tạo phần thanh tiến trình đã hoàn này
        for (int i = 0; i < progress; i++) {
            bar += '#';
        }
        // Tạo phần thanh tiến trình chưa hoàn thành
        for (int i = progress; i < barLength; i++) {
            bar += '-';
        }
        bar += "]";
        // Tính toán phần trăm hoàn thành
        int percent = (int) ((double) current / total * 100);
        System.out.print(bar + "[" + percent + "%/100%]\r" + animationFrames[frameIndex]);
    }

    private static void clearLine() {
        System.out.print("\r" + " ".repeat(120) + "\r"); // Giả sử thanh tiến trình không vượt quá 110 ký tự
    }


    public InOut(DanhSachNhanVien dsnv) {
        this.dsnv = dsnv;
        Color.clear();
        try {
            loader(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Menu();
    }
 
    public void Menu(){
        do {
            System.out.println("MENU -----------");
            System.out.println(
                "1. Nhap danh sach nhan vien\n" +
                "2. Xuat danh sach nhan vien\n" +
                "3. Them nhan vien\n" +
                "4. Xoa nhan vien\n" +
                "5. Tim nhan vien co so tuoi can tim\n" +
                "6. Tim nhan vien co chuc vu can tim\n" +
                "7. Tim nhan vien co ngay sinh can tim\n" +
                "8. Tim nhan vien co nam sinh can tim\n" +
                "9. Tim nhan vien co thang sinh can tim\n" +
                "10. Thoat\n");

            System.out.println("Vui long chon chuc nang: ");
            luachon = scanner.nextInt();
            scanner.nextLine();

            switch(luachon){
                case 1:
                    nhapDanhSach();
                    System.out.println("Nhan Enter de tiep tuc...");
                    scanner.nextLine();
                    break;
                case 2:
                    // Xử lý chức năng xuất danh sách nhân viên
                    dsnv.inDanhSachNhanVien();
                    System.out.println("Nhan Enter de tiep tuc...");
                    scanner.nextLine();
                    break;
                case 3:
                    // Xử lý chức năng thêm nhân viên
                    System.out.print("Vui long nhap ho: ");
                    String ho = scanner.nextLine();
                    System.out.print("Vui long nhap ten: ");
                    String ten = scanner.nextLine();
                    System.out.print("Vui long nhap ngay sinh (dd/MM/yyyy): ");
                    LocalDate ngaySinh = LocalDate.parse(scanner.nextLine(),dateFormatter);
        
                    System.out.print("Vui long nhap tuoi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine(); // Đọc dấu xuống dòng sau khi đọc số nguyên
        
                    System.out.print("Vui long nhap ngay vao lam (dd/MM/yyyy): ");
                    LocalDate ngayVaoLam = LocalDate.parse(scanner.nextLine(),dateFormatter);
        
                    System.out.print("Vui long nhap chuc vu: ");
                    int chucVu = scanner.nextInt();
                    scanner.nextLine(); // Đọc dấu xuống dòng sau khi đọc số nguyên
        
                    NhanVien nv = new NhanVien(ho, ten, ngaySinh, tuoi, ngayVaoLam, chucVu);
                    dsnv.themNhanVien(nv);
                    System.out.println("Nhan Enter de tiep tuc...");
                    scanner.nextLine();
                    break;
                case 4:
                    // Xử lý chức năng xóa nhân viên dua tren chuc vu
                    System.out.print("Vui long nhap chuc vu can xoa (0 Truong Nhom 1 Thu Ki 2 Giam Sat): ");
                    int chucVuXoa = scanner.nextInt();
                    scanner.nextLine();
                    dsnv.xoaNhanVien(chucVuXoa);
                    System.out.println("Nhan Enter de tiep tuc...");
                    scanner.nextLine();
                    break;
                case 5:
                    // Xử lý chức năng tìm nhân viên theo số tuổi
                    System.out.println("Vui long nhap so tuoi can tim: ");
                    int tuoiCanTim = scanner.nextInt();
                    scanner.nextLine();
                    dsnv.timNhanVienTheoTuoi(tuoiCanTim);
                    System.out.println("Nhan Enter de tiep tuc...");
                    scanner.nextLine();
                    break;
                case 6:
                    // Xử lý chức năng tìm nhân viên theo chức vụ
                    System.out.println("Vui long nhap chuc vu can tim (0 Truong Nhom 1 Thu Ki 2 Giam Sat): ");
                    int chucVuCanTim = scanner.nextInt();
                    scanner.nextLine();
                    dsnv.timNhanVienTheoChucVu(chucVuCanTim);
                    System.out.println("Nhan Enter de tiep tuc...");
                    scanner.nextLine();
                    break;
                case 7:
                    // Xử lý chức năng tìm nhân viên theo ngày sinh
                    System.out.println("Vui long nhap ngay sinh can tim (dd/MM/yyyy): ");
                    String ngaySinhCanTim = scanner.nextLine();
                    dsnv.timNhanVienTheoNgaySinh(ngaySinhCanTim);
                    System.out.println("Nhan Enter de tiep tuc...");
                    scanner.nextLine();
                    break;
                case 8:
                    // Xử lý chức năng tìm nhân viên theo năm sinh
                    System.out.println("Vui long nhap nam can tim: ");
                    int namCanTim = scanner.nextInt();
                    scanner.nextLine();
                    dsnv.timNhanVienTheoNamSinh(namCanTim);
                    System.out.println("Nhan Enter de tiep tuc...");
                    scanner.nextLine();
                    break;
                case 9:
                    // Xử lý chức năng tìm nhân viên theo tháng sinh
                    System.out.println("Vui long nhap thang can tim: ");
                    int thangCanTim = scanner.nextInt();
                    scanner.nextLine();
                    dsnv.timNhanVienTheoThangSinh(thangCanTim);
                    System.out.println("Nhan Enter de tiep tuc...");
                    scanner.nextLine();
                    break;
                case 10:
                    System.out.println("Da thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }

        } while (luachon != 10);
    }

    public void nhapDanhSach(){
        System.out.print("Vui long nhap so luong nhan vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Vui long nhap thong tin nhan vien thu " + (i+1) + ": ");
            System.out.print("Vui long nhap ho: ");
            String ho = scanner.nextLine();
            System.out.print("Vui long nhap ten: ");
            String ten = scanner.nextLine();
            System.out.print("Vui long nhap ngay sinh (dd/MM/yyyy): ");
            LocalDate ngaySinh = LocalDate.parse(scanner.nextLine(),dateFormatter);

            System.out.print("Vui long nhap tuoi: ");
            int tuoi = scanner.nextInt();
            scanner.nextLine(); // Đọc dấu xuống dòng sau khi đọc số nguyên

            System.out.print("Vui long nhap ngay vao lam (dd/MM/yyyy): ");
            LocalDate ngayVaoLam = LocalDate.parse(scanner.nextLine(),dateFormatter);

            System.out.print("Vui long nhap chuc vu: ");
            int chucVu = scanner.nextInt();
            scanner.nextLine(); // Đọc dấu xuống dòng sau khi đọc số nguyên

            NhanVien nv = new NhanVien(ho, ten, ngaySinh, tuoi, ngayVaoLam, chucVu);
            dsnv.themNhanVien(nv);
        }
    }
}