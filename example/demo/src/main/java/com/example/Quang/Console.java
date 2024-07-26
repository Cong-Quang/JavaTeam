package com.example.Quang;

import java.util.ArrayList;
import java.util.List;

import com.example.accsset.Color;

public class Console extends Color { // extends là kế thừa những gì đã có ở trong lớp Color. nếu là private thì nó
                                     // không lấy ra được
                                     // chỉ public th nhá. cấu trúc [class mới] extends [class khác]

    static String ANSI_ESC = "\033[";

    // in ra theo vị trí
    public static void print(String s, int row, int col) {
        System.out.print(ANSI_ESC + row + ";" + col + "H" + s + ANSI_ESC + "0m");
        Color.reset();
    }

    public static void println(String s, Color color) {
        System.out.println(s); // thêm ln là xuống hàng
    }

    // hàm loader của teo mới viết ( đọc hiểu nếu hok hiểu có thể coppy)
    // vì sao t có thể gọi các thuộc tính của hàm color mà không cần color.[tới] thì
    // kéo lên đọc lại note ở hàm Console extends Color
    public static void loader(int total) throws InterruptedException {

        for (int i = 0; i <= total; i++) {
            printProgressBar(i, total);
            // test máy mới
            // Giả lập công việc với sleep
            Thread.sleep(100);
        }
        System.out.println(cRed + " [Hoàn thành] ");
        reset();
    }

    private static void printProgressBar(int current, int total) {
        int barLength = 100;
        int progress = (int) ((double) current / total * barLength);
        StringBuilder bar = new StringBuilder("[");

        // Tạo phần thanh tiến trình đã hoàn thành
        for (int i = 0; i < progress; i++) {
            bar.append("=");

        }
        // Tạo mũi tên chỉ thị vị trí hiện tại
        if (progress < barLength) {
            bar.append("->");
        }
        // Tạo phần thanh tiến trình chưa hoàn thành
        for (int i = progress + 1; i < barLength; i++) {
            bar.append(" ");
        }
        bar.append("]");

        // Tính toán phần trăm hoàn thành
        int percent = (int) ((double) current / total * 100);
        System.out.print("\r[" + percent + "%]" + bar.toString());
    }

    private static void khung() {
        // khung
        clear();
        print("[STT]", 0, 0);
        print("[Ho]", 0, 8);
        print("[Ten]", 0, 20);
        print("[Tuoi]", 0, 30);
        print("[Ngay Sinh]", 0, 40);
        print("[Chuc vu]", 0, 55);
    }

    public static void ShowALLNV(NhanVien[] nv) {
        clear();
        try {
            loader(nv.length * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        khung();
        for (int i = 0; i < nv.length; i++) {
            FindShowNV(nv[i], i);
        }
    }

    public static void FindShowNV(NhanVien nv, int i) {
        print("" + (i + 1), i + 3, 3);

        print(nv.getHo(), i + 3, 7);
        print(nv.getTen(), i + 3, 20);

        int tuoi = nv.getTuoi();
        if (tuoi < 18) {
            print(cRed + "" + tuoi, i + 3, 32);
        } else if (tuoi > 18 && tuoi < 60) {
            print(Console.cGreen + "" + tuoi, i + 3, 32);
        } else {
            print(cYellow + "" + tuoi, i + 3, 32);
        }

        print("" + nv.getNgaySinh(), i + 3, 40);

        switch (nv.getChucVu()) {
            case 0:
                print("Nhan vien", i + 3, 55);
                break;
            case 1:
                print("Quan ly", i + 3, 55);
                break;
            case 2:
                print("Giam Doc", i + 3, 55);
                break;
            default: // mặc định nếu không kiếm thấy giá trị nào hợp lý. nó sẽ đi vô đây
                print("Lao Cong", i + 3, 55);
                break;
        }
        System.out.println("\n");
    }

    public static NhanVien[] FindNgaySinh(NhanVien[] nv, int NamSinh) {
        List<NhanVien> nViens = new ArrayList<NhanVien>();
        for (int i = 0; i < nv.length; i++) {
            if (nv[i].getTuoi() == NamSinh) {
                nViens.add(nv[i]);
            }
        }
        return nViens.toArray(new NhanVien[0]);
    }

}