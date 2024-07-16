package com.example.Quang2;

public class Animal {

    public String ten; // tên con vật

    public float DoanhThu; // số tiền 1 kiếm được /1 người xem

    public float DuyTri; // tiền duy trì cho nó

    public Food food; // loại đồ ăn cho nó

    public Cage cage; // loại chuồng cho nó

    public Animal( String ten, float DoanhThu, float DuyTri, Food food, Cage cage) {
        this.ten = ten;
        this.DoanhThu = DoanhThu;
        this.DuyTri = DuyTri;
        this.food = food;
    }
}
