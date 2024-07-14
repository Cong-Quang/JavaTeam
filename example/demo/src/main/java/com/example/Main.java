package com.example;

//import com.example.Quang.Quang;
import com.example.accsset.Color;
import com.example.Tuan.Tuan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tuan tuan = new Tuan();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        tuan.a = scanner.nextInt();
        System.out.println("Nhap b: ");
        tuan.b = scanner.nextInt();
        System.out.println(Color.cRed + "Tong: " + tuan.Cong(tuan.a, tuan.b));
        System.out.println(Color.cGreen + "Tru: " + tuan.Tru(tuan.a, tuan.b));
        System.out.println(Color.cYellow + "Nhan: " + tuan.Nhan(tuan.a, tuan.b));
        if(tuan.Chia(tuan.a, tuan.b) == 0){
            System.out.println(Color.cCyan + "Khong the chia cho 0");
        }
        else{
            System.out.println(Color.cCyan + "Chia: " + tuan.Chia(tuan.a,tuan.b));
        }
        Color.reset();
        scanner.close();
    }
}