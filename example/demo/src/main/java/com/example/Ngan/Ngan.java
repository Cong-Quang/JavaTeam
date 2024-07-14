package com.example.Ngan;

import java.util.Scanner;

import com.example.accsset.Color;

public class Ngan {
    private int x,y;

    public void ip() {
        Scanner input = new Scanner(System.in);

        System.out.print("x: ");
        x = input.nextInt();

        System.out.print("y: ");
        y = input.nextInt();

        input.close();
        System.out.println("Cong: " + sum() + Color.cRed);
        System.out.println("Tru: " + sub() + Color.cGreen);
        System.out.println("Nhan: " + multi() + Color.cYellow);
        if(div() != 0){
            System.out.println("Chia: " + div() + Color.cBlue);
        }
        else{
            System.out.println("Chia Sai bett" + Color.cBlue);
        }
        Color.reset();     
    }


    // Phép cộng
    private int sum() {
        return x + y;
    }

    // Phép trừ
    private int sub() {
        return x - y;
    }

    // Phép nhân
    private long multi() {
        return (long) x * y;
    }

    // Phép chia
    private float div() {
        if (y != 0) {
            return (float) x / y;}
        return 0;   
    }
}