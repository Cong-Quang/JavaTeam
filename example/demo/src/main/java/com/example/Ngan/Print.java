package com.example.Ngan;

import com.example.accsset.Color;

public class Print extends Color {
    static String ANSI_ESC = "\033[";
    
    // In ra theo vị trí
    public static void print(String s, int row, int col) {
        System.out.print(ANSI_ESC + row + ";" + col + "H" + s + ANSI_ESC + "0m");
        Color.reset();
    }

    public static void println(String s, Color color) {
        System.out.println(s); 
    }

    // Hàm loader
    public static void loader(int total, int row, int col) throws InterruptedException {
        for (int i = 0; i < total; i++) {
            showSpinner(i, total, row, col);
            Thread.sleep(100); 
        }
        reset();
    }

    private static void showSpinner(int current, int total, int row, int col) {
        char[] spinner = {'|', '/', '-', '\\'};
        int percent = (int) ((double) current / total * 100);
        print(spinner[current % spinner.length] + " " + percent + "%", row, col);
    }

    private static final String HEADER = "---------------------------------------------------------------\n";
    
    private void khung() {
        Print.clear();
        Print.print("STT", 2, 0);
        Print.print("HO", 2, 7);
        Print.print("TEN", 2, 20);
        Print.print("TUOI", 2, 31);
        Print.print("NGAY SINH", 2, 40);
        Print.print("CHUC VU", 2, 55);
    }
    public void ShowDS(Nhanvien[] ds) {
        Print.clear();
        try {
            Print.loader(ds.length, 1, 35); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        khung();
        Print.print(HEADER, 3, 0);
        for (int i = 0; i < ds.length; i++) {
            showNv(ds[i], i);
        }
    }

    public void showNv(Nhanvien nv, int i) {
        Print.print("" + (i + 1), i + 4, 2);
        Print.print(nv.getHo(), i + 4, 7);
        Print.print(nv.getTen(), i + 4, 20);

        int tuoi = nv.getTuoi();
        if (tuoi < 18) {
            Print.print(Print.cCyan + "" + tuoi, i + 4, 32);
        } else if (tuoi >= 18 && tuoi < 60) {
            Print.print(Print.cBlue + "" + tuoi, i + 4, 32);
        } else {
            Print.print(Color.cYellow + "" + tuoi, i + 4, 32);
        }

        Print.print("" + nv.getNgaySinh(), i + 4, 40);

        switch (nv.getChucVu()) {
            case 0:
                Print.print("Nhan vien", i + 4, 55);
                break;
            case 1:
                Print.print("Quan ly", i + 4, 55);
                break;
            case 2:
                Print.print("Giam Doc", i + 4, 55);
                break;
            default:
                Print.print("Chu Tich", i + 4, 55);
                break;
        }
        System.out.println("\n");
    }
}
