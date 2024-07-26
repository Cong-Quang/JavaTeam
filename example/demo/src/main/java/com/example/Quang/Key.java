package com.example.Quang;

import java.util.Scanner;

public class Key {

    enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    int x = 0, y = 0;

    Direction dir;

    char readKey() {
        Scanner scanner = new Scanner(System.in);
        try {
            if (System.in.available() > 0) {
                return scanner.next().charAt(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return '\0';
    }

    public void updateKDB() {
        char input = readKey();
        switch (input) {
            case 'w':
                y--;
                break;
            case 's':
                y++;
                break;
            case 'a':
                x--;
                break;
            case 'd':
                x++;
                break;
        }
    }

    public void updateCDB() {
        Scanner scanner = new Scanner(System.in);
        scanner();
    }
}
