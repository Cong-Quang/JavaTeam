package com.example.Tuan;

public class Tuan {
    public static int Cong(int a, int b){
        return a+b;
    }
    public static int Tru(int a, int b){
        return a-b;
    }
    public static long Nhan(int a, int b){
        return a*b;
    }
    public static double Chia(int a, int b){
        if(b==0){
            //System.out.println("Khong the chia cho 0");
            return 0;
        }
        return (double)a/b;
    }
}
