package com.example;

import com.example.Quang.Quang;
import com.example.accsset.Color;
import com.example.Tuan.Tuan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();

        double c = Tuan.Chia(a, b);

        System.out.println(Color.cRed + "Tong= " +Tuan.Cong(a, b));
        System.out.println(Color.cGreen + "Hieu= " +Tuan.Tru(a, b));
        System.out.println(Color.cBlue + "Tich= " +Tuan.Nhan(a, b));
        if(c==0){
            System.out.println(Color.cCyan+ "Khong the chia cho 0");
        }
        else{
            System.out.println(Color.cCyan + "Thuong= " +c);
        }
        Color.reset();
    }
}