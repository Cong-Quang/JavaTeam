package com.example.Quang;
 
import com.example.accsset.Color;
public class Console extends Color { // extends là kế thừa những gì đã có ở trong lớp Color.  nếu là private thì nó không lấy ra được
                                        // chỉ public th nhá. cấu trúc     [class mới] extends [class khác]

    static String ANSI_ESC = "\033[";
    // in ra theo vị trí
    public static void print(String s,int row, int col) {
        System.out.print(ANSI_ESC + row + ";" + col + "H" + s + ANSI_ESC + "0m");
        Color.reset();
    }

    public static void println(String s,Color color) {
        System.out.println(s); // thêm ln là xuống hàng
    }
    // hàm loader của teo mới viết ( đọc hiểu nếu hok hiểu có thể coppy)
    // vì sao t có thể gọi các thuộc tính của hàm color mà không cần color.[tới] thì kéo lên đọc lại note ở hàm Console extends Color
    public static void loader(int total) throws InterruptedException {
        
        for (int i = 0; i <= total; i++) {
            printProgressBar(i, total);

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

}
