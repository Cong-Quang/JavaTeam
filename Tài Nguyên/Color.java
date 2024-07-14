package com.example;

import java.util.Random;

// Trình Nguyễn
public class Color {
    
    //  References: 
    //  - https://gist.github.com/fnky/458719343aabd01cfb17a3a4f7296797
    //  - https://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html

    // RGB colors constants
    final static String cIvory   = "\u001B[38;5;11m" ;
    final static String cRed     = "\u001B[38;5;196m";
    final static String cYellow  = "\u001B[38;5;220m";
    final static String cGreen   = "\u001B[38;5;46m" ;
    final static String cWhite   = "\u001B[38;5;15m" ;
    final static String cBlue    = "\u001B[38;5;21m" ;
    final static String cMagenta = "\u001B[38;5;129m";
    final static String cCyan    = "\u001B[38;5;87m" ;
    final static String cPink    = "\u001B[38;5;198m";
    final static String cOrange  = "\u001B[38;5;214m";    
    final static String cGray    = "\u001B[38;5;251m";
    final static String cLime    = "\u001B[38;5;190m";
    final static String cLagoon  = "\u001B[38;5;153m";
    final static String cSakura  = "\u001B[38;5;5m"  ;
    final static String cDenim   = "\u001B[38;5;20m" ;
    final static String cBrown   = "\u001B[38;5;130m";
    final static String cBerry   = "\u001B[38;5;54m" ;
    final static String cPlum    = "\u001B[38;5;52m" ;
    final static String cBlack   = "\u001B[38;5;232m";
    final static String cPeach   = "\u001B[38;5;215m";
    final static String cCherry  = "\u001B[38;5;1m"  ;
    final static String cCandy   = "\u001B[38;5;9m"  ;
    final static String cOlive   = "\u001B[38;5;106m";
    final static String cSunset  = "\u001B[38;5;166m";
    final static String cScarlet = "\u001B[38;5;160m";
    final static String cLake    = "\u001B[38;5;117m";
    final static String cTopaz   = "\u001B[38;5;115m";
    final static String cRetro   = "\u001B[38;5;144m";
    final static String cNoir    = "\u001B[38;5;237m";

    // utility
    public static void reset() { System.out.print("\u001B[0m"); }

    // screen helpers
    public static void clear() { System.out.print("\u001B[2J\u001B[H"); }
    public static void clearEOL() { System.out.print("\u001B[0K"); }
    public static void screenSave() { System.out.print("\u001B[?47h"); }
    public static void screenRestore() { System.out.print("\u001B[?47l"); }

    // cursor helpers
    public static void cursorHome() { System.out.print("\u001B[H"); }
    public static void cursorUp() { System.out.print("\u001B[1A"); }
    public static void cursorDown() { System.out.print("\u001B[1B"); }
    public static void cursorLeft() { System.out.print("\u001B[1D"); }
    public static void cursorRight() { System.out.print("\u001B[1C"); }
    public static void cursorMove(int x, int y) { System.out.print("\u001B["+y+";"+x+"H"); }
    public static void cursorVisible(boolean visible) { System.out.print(visible ? "\u001B[?25h" : "\u001B[?25l"); }
        
    // color helpers
    public static String makeColor(int rgb) {
        int r = (rgb & 0x00FF0000) >> 16;
        int g = (rgb & 0x0000FF00) >> 8;
        int b = (rgb & 0x000000FF);
        return makeColor(r, g, b);
    }
    public static String makeColor(int r, int g, int b) {
        StringBuffer buf = new StringBuffer();
        buf.append("\u001B[38;2;");
        buf.append(r); buf.append(";");
        buf.append(g); buf.append(";");
        buf.append(b); buf.append("m");
        return new String(buf);
    }
    public static void setColor(int rgb) {
        int r = (rgb & 0x00FF0000) >> 16;
        int g = (rgb & 0x0000FF00) >> 8;
        int b = (rgb & 0x000000FF);
        setColor(r, g, b);
    }
    public static void setColor(int r, int g, int b) { 
        System.out.print(makeColor(r, g, b)); 
    }

    // print all colors to console
    public static void dumpColors() {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                int code = i * 16 + j;
                System.out.printf("\u001B[48;5;%dm%4d ", code, code);
            }
            System.out.println("\u001B[0m");
        }
    }
    //random color
    public static String randomColor() {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return makeColor(r, g, b);
    }

}
