package com.example.Phat;
import java.util.Scanner;

public class Phat {
    public int x,y;
    // public void tinhtoan(){
    //     Scanner Nhap = new Scanner(System.in);
    //     System.out.println("Nhap x: ");
    //     this.x = Nhap.nextInt();
    //     System.out.println("Nhap y: ");
    //     this.y = Nhap.nextInt();
    //     Nhap.close(); 
    //     System.out.println("Tong = "+sum());
    //     System.out.println("Tru = "+tru());
    //     System.out.println("Nhan = "+nhan());
    // }
    // private int sum(){
    //     return this.x + this.y;
    // }
    // private int tru(){
    //     return this.x - this.y;
    // }
    // private long nhan(){
    //     return this.x * this.y;
    // }
    // private float chia(){
    //     return this.x / this.y;
    // }
    public void nhap(){
        Scanner Nhap = new Scanner(System.in);
        System.out.println("Nhap x: ");
        this.x = Nhap.nextInt();
        System.out.println("Nhap y: ");
        this.y = Nhap.nextInt();
        Nhap.close();
    } 
    public void sum(){
        System.out.println("Tong = "+(this.x + this.y));
    }
    public void tru(){
        System.out.println("tru = "+(this.x - this.y));
    }
    public void nhan(){
        System.out.println("Nhan = "+(this.x * this.y));
    }
    public void chia(){
        System.err.println("Chia = "+(this.x / this.y));
    }
    public void goi_ra(){
        nhan();
        sum();
        tru();
        nhan();
        chia();
    }
    public Phat(){
        goi_ra();
    }
}