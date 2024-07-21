package com.example.Ngan;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private Nhanvien[] ds;
    private Print print;
    private void show_each(Nhanvien nv) {
        System.out.println(nv.getHo() + "    " + nv.getTen() + "    " + nv.getTuoi() + "    " + nv.getNgaySinh() + "    " + nv.getChucVu());
    }
    public Menu(Nhanvien[] ds) {
        this.ds = ds;
        this.print = new Print();
    }


    public void displayMenu() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Hien thi danh sach hien tai");
            System.out.println("2. Nhap them nhan vien");
            System.out.println("3. Sua thong tin nhan vien");
            System.out.println("4. Xoa mot nhan vien");
            System.out.println("5. Tim kiem thong tin");
            System.out.println("0. Thoat");
            System.out.println("Lua chon: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    showDS();
                    break;
                case 2:
                    addEmploy();
                    break;
                case 3:
                    editEmploy();
                    break;
                case 4:
                    deleteEmploy();
                    break;
                case 5:
                    searchEmploy();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    return;
                default:
                    System.out.println("Loi");
            }
        }
    }

    private void showDS() {
        print.ShowDS(ds);
    }

    public void addEmploy() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ho: ");
        String ho = sc.nextLine();
        System.out.print("Nhap Ten: ");
        String ten = sc.nextLine();
        System.out.print("Nhap Tuoi: ");
        int tuoi = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Nhap Ngay Sinh (dd): ");
        int ngay = sc.nextInt();
        System.out.print("Nhap Thang Sinh (mm): ");
        int thang = sc.nextInt();
        System.out.print("Nhap Nam Sinh (yyyy): ");
        int nam = sc.nextInt();
        System.out.print("Nhap Chuc vu (0: Nhan vien, 1: Quan ly, 2: Giam Doc): ");
        int chucVu = sc.nextInt();
        LocalDate ngaySinh = LocalDate.of(nam, thang, ngay);
    
        // Tạo đối tượng Nhanvien mới
        Nhanvien newEmployee = new Nhanvien(ho, ten, tuoi, ngaySinh, chucVu);
        Nhanvien[] newDs = new Nhanvien[ds.length + 1];
        System.arraycopy(ds, 0, newDs, 0, ds.length);
        newDs[ds.length] = newEmployee;
        this.ds = newDs;
        showDS(); 
    }
    

    private void editEmploy() {
        System.out.print("STT nhan vien can sua : ");
        int i = scanner.nextInt() - 1;
        scanner.nextLine();  
        // Kiểm tra chỉ số hợp lệ
        if (i < 0 || i >= ds.length) {
            System.out.println("Loi!");
            return;
        }
        Nhanvien nv = ds[i];
        System.out.println("Chon thong tin can sua: ");
        System.out.println("1. Ho");
        System.out.println("2. Ten");
        System.out.println("3. Tuoi");
        System.out.println("4. Ngay Sinh");
        System.out.println("5. Chuc Vu");
        System.out.print("Chon: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  
        switch (choice) {
            case 1:
                System.out.print("Ho moi: ");
                nv.setHo(scanner.nextLine());
                break;
            case 2:
                System.out.print("Ten moi: ");
                nv.setTen(scanner.nextLine());
                break;
            case 3:
                System.out.print("Tuoi moi: ");
                nv.setTuoi(scanner.nextInt());
                scanner.nextLine();  
                break;
            case 4:
                System.out.print("Ngay/thang/nam sinh moi (yyyy-mm-dd): ");
                nv.setNgaySinh(LocalDate.parse(scanner.nextLine()));
                break;
            case 5:
                System.out.print("Chuc vu moi (0: nv, 1: ql, 2: gd): ");
                nv.setChucVu(scanner.nextInt());
                scanner.nextLine(); 
                break;
            default:
                System.out.println("Loi!");
                return;
        }
        showDS();
    }
    

    private void deleteEmploy() {
        System.out.print("STT nhan vien can xoa: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();  

        if (index < 0 || index >= ds.length) {
            System.out.println("Loi!");
            return;
        }

        Nhanvien[] DS = new Nhanvien[ds.length - 1];
        for (int i = 0, j = 0; i < ds.length; i++) {
            if (i != index) {
                DS[j++] = ds[i];
            }
        }
        ds = DS; //cập nhật ds
        showDS();
    }
    private void searchEmploy() {
        System.out.println("Thong tin can tim:");
        System.out.println("1. Ho");
        System.out.println("2. Ten");
        System.out.println("3. Tuoi");
        System.out.println("4. Ngay Sinh");
        System.out.println("5. Thang Sinh");
        System.out.println("6. Nam Sinh");
        System.out.println("7. Chuc Vu");
        System.out.print("Chon: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  
        switch (choice) {
            case 1:
                searchHo();
                break;
            case 2:
                searchTen();
                break;
            case 3:
                searchTuoi();
                break;
            case 4:
                searchNgaySinh();
                break;
            case 5:
                searchThangSinh();
                break;
            case 6:
                searchNamSinh();
                break;
            case 7:
                searchChucVu();
                break;
            default:
                System.out.println("Loi: Lua chon khong hop le!");
        }
    }
    private void searchHo() {
        System.out.print("Ho can tim: ");
        String ho = scanner.nextLine();
        boolean found = true;
        for (Nhanvien nv : ds) {
            if (nv.getHo().equalsIgnoreCase(ho)) { //so sánh 2 chuỗi ko phân biệt hoa thường
                show_each(nv);
                found = false;
            }
        }
        if (found) {
            System.out.println("Khong tim thay thong tin nay!");
        }
    }
    private void searchTen() {
        System.out.print("Ten can tim: ");
        String ten = scanner.nextLine();
        boolean found = true;
        for (Nhanvien nv : ds) {
            if (nv.getTen().equalsIgnoreCase(ten)) {
                show_each(nv);
                found = false;
            }
        }
        if (found) {
            System.out.println("Khong tim thay thong tin nay!");
        }
    }
    
    private void searchTuoi() {
        System.out.print("Tuoi can tim: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        boolean found = true;
        for (Nhanvien nv : ds) {
            if (nv.getTuoi() == tuoi) {
                show_each(nv);
                found = true;
            }
        }
        if (found) {
            System.out.println("Khong tim thay thong tin nay!");
        }
    }
    
    private void searchNgaySinh() {
        System.out.print("Nhap Ngay Sinh (dd): ");
        int ngay = scanner.nextInt();
        scanner.nextLine(); 
        boolean found = true;
        for (Nhanvien nv : ds) {
            if (nv.getNgaySinh().getDayOfMonth() == ngay) {
                show_each(nv);
                found = false;
            }
        }
        if (found) {
            System.out.println("Khong tim thay thong tin nay!");
        }
    }
    
    private void searchThangSinh() {
        System.out.print("Nhap Thang Sinh (mm): ");
        int thang = scanner.nextInt();
        scanner.nextLine(); 
        boolean found = true;
        for (Nhanvien nv : ds) {
            if (nv.getNgaySinh().getMonthValue() == thang) {
                show_each(nv);
                found = false;
            }
        }
        if (found) {
            System.out.println("Khong tim thay thong tin nay!");
        }
    }
    
    private void searchNamSinh() {
        System.out.print("Nhap Nam Sinh (yyyy): ");
        int nam = scanner.nextInt();
        scanner.nextLine();
        boolean found = true;
        for (Nhanvien nv : ds) {
            if (nv.getNgaySinh().getYear() == nam) {
                show_each(nv);
                found = false;
            }
        }
        if (found) {
            System.out.println("Khong tim thay thong tin nay!");
        }
    }
    
    private void searchChucVu() {
        System.out.print("Nhap Chuc Vu can tim (0: nv, 1: ql, 2: gd): ");
        int chucVu = scanner.nextInt();
        scanner.nextLine();  
        boolean found = true;
        for (Nhanvien nv : ds) {
            if (nv.getChucVu() == chucVu) {
                show_each(nv);
                found = false;
            }
        }
        if (found) {
            System.out.println("Khong tim thay thong tin nay!");
        }
    }
}
