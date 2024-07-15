package com.example.Ngoc;

// public class Ngoc {
     // ko tạo file main ở đây ba.
     // có 1 fule main r
     // với lại đang có 1 file ngọc.java thì tên class ko đc trùng
//     // public static void main(String[] args) {
//     //     Scanner scanner = new Scanner(System.in);
//     //     System.out.print("nhap x: ");
//     //     float x = scanner.nextFloat();

//     //     System.out.print("Nhap y: ");
//     //     float y = scanner.nextFloat();

//     //     Cong cong = new Cong();
//     //     Tru tru = new Tru();
//     //     Nhan nhan = new Nhan();
//     //     Chia chia = new Chia();

//     //     float tong = cong.cong(x, y);
//     //     float hieu = tru.tru(x, y);
//     //     float tich = nhan.nhan(x, y);
//     //     float thuong = 0;
        
//     //     try {
//     //         thuong = chia.chia(x, y);
//     //     } catch (ArithmeticException e) {
//     //         System.out.println(e.getMessage());
//     //     }

//     //     // dai mau
//     //     final String RED = "\033[0;31m";
//     //     final String GREEN = "\033[0;32m";
//     //     final String YELLOW = "\033[0;33m";
//     //     final String BLUE = "\033[0;34m";
//     //     final String RESET = "\033[0m";

        
//     //     System.out.println(RED + "tong: " + tong + RESET);
//     //     System.out.println(GREEN + "hieu: " + hieu + RESET);
//     //     System.out.println(YELLOW + "tich: " + tich + RESET);
//     //     if (y != 0) {
//     //         System.out.println(BLUE + "thuong: " + thuong + RESET);
//     //     }
//     //     scanner.close();
//     // }
// }
class Cong {
    public float cong(float a, float b) {
        return a + b;
    }
}

class Tru {
    public float tru(float a, float b) {
        return a - b;
    }
}

class Nhan {
    public float nhan(float a, float b) {
        return a * b;
    }
}

class Chia {
    public float chia(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Khong the chia cho 0");
        }
    }
}