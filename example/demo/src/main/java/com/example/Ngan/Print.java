package com.example.Ngan;

import com.example.accsset.Color;

public class Print extends Color{
    static String ANSI_ESC = "\033[";

    // In ra theo vị trí
    public static void print(String s, int row, int col) {
        System.out.print(ANSI_ESC + row + ";" + col + "H" + s + ANSI_ESC + "0m");
        Color.reset();
    }

    public static void println(String s, Color color) {
        System.out.println(s); // Thêm ln là xuống hàng
    }

    // Hàm loader mới với vị trí trung tâm
    public static void loader(int total, int row, int col) throws InterruptedException {
        for (int i = 0; i < total; i++) {
            showSpinner(i, total, row, col);
            Thread.sleep(100); // Giả lập công việc với sleep
        }
        System.out.println(cRed + " [Hoàn thành] ");
        reset();
    }

    private static void showSpinner(int current, int total, int row, int col) {
        char[] spinner = {'|', '/', '-', '\\'};
        int percent = (int) ((double) current / total * 100);
        print(spinner[current % spinner.length] + " " + percent + "%", row, col);
    }
}
