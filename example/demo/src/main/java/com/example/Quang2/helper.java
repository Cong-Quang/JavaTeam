package com.example.Quang2;

import com.example.Quang.Console;
import com.example.accsset.Color;

public class helper extends Console { // đa kế thừa, console đc kế thừa từ color

    public static void drawBoard(int width, int height) {
        Console.clear();
       Console.print(Color.cGreen+"ZOO",0,width);
        Console.reset();
        System.out.println("");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" ");
                if (i == 0) {
                    System.out.print("-");
                }
                if (i == height - 1 ){
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
