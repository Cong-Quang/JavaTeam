package com.example.Tuan;

import java.util.Scanner;
import com.example.accsset.Color;
public class Tuan {
    private int a, b;
    public void tinhtoan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        this.a = scanner.nextInt();
        System.out.println("Nhap b: ");
        this.b = scanner.nextInt();
        scanner.close(); 
        double c = Chia();
        System.out.println(Color.cRed + "Cong: " + Cong());
        System.out.println(Color.cGreen + "Tru: " + Tru());
        System.out.println(Color.cYellow + "Nhan: " + Nhan());
        if(Chia()==0){
            System.out.println(Color.cCyan + "Khong the chia cho 0");
        }
        else{
            System.out.printf(Color.cCyan + "Chia: %.2f", c);
        }
        Color.reset();
    }

    private int Cong(){
        return this.a + this.b;
    }
    private int Tru(){
        return this.a - this.b;
    }
    private long Nhan(){
        return this.a * this.b;
    }
    private double Chia(){
        if(this.b==0){
            //System.out.println("Khong the chia cho 0");
            return 0;
        }
        return (double)this.a / this.b;
    }
}
