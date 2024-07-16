package com.example;

import com.example.Quang.Console;

public class Main {
    
    public static void main(String[] args) {
        try {
            Console.loader(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
