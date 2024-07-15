package com.example.Quang;

import com.example.accsset.Color;

public class Handle {
    private NhanVien[] nv;

    public Handle(NhanVien[] nv) {
        this.nv = nv;
    }

    public void addNV(NhanVien[] nv) {
        for (int i = 0; i < nv.length; i++) {
            this.nv[i] = nv[i];
        }
    }

    public NhanVien getNV(int i) {
        return this.nv[i];
    }

    public void setNV(int i, NhanVien nv) {
        this.nv[i] = nv;
    }

    public NhanVien[] getFullNV() {
        return nv;
    }

    public void setFullNV(NhanVien[] nv) {
        this.nv = nv;
    }
    private void khung(){
        // khung
        Console.clear();
        Console.print("[STT]", 0, 0);
        Console.print("[Ho]", 0, 8);
        Console.print("[Ten]", 0, 20);
        Console.print("[Tuoi]", 0, 30);
        Console.print("[Ngay Sinh]", 0, 40);
        Console.print("[Chuc vu]", 0, 55);
    }
    public void ShowNV() {
        khung();
        for (int i = 0; i < nv.length; i++) {
            Console.print("" + i, i+3, 3); // "" + i ép kiểu về string
            Console.print(nv[i].getHo(), i+3, 7);
            Console.print(nv[i].getTen(), i+3, 20);
            
            int tuoi =  nv[i].getTuoi();
            if (tuoi < 18) {
                Console.print(Console.cRed + "" + tuoi, i+3, 32);
            }
            else if (tuoi > 18 && tuoi < 60) {
                Console.print(Console.cGreen + "" + tuoi, i+3, 32);
            }
            else{
                Console.print(Color.cYellow + "" + tuoi, i+3, 32);
            }
                
            Console.print("" + nv[i].getNgaySinh(), i+3, 40);
            
            switch (nv[i].getChucVu()) {
                case 0:
                    Console.print("Nhan vien" , i+3, 55);
                    break;
                case 1:
                    Console.print("Quan ly" , i+3, 55);
                    break;
                case 2:
                    Console.print("Giam Doc" , i+3, 55);
                    break;
                default: // mặc định nếu không kiếm thấy giá trị nào hợp lý. nó sẽ đi vô đây
                    Console.print("Lao Cong" , i+3, 55);
                    break;
            }
        }
        System.out.println("\n");
    }
}

