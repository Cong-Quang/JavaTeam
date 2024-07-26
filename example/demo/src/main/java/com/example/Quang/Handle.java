package com.example.Quang;

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

    // private void khung() {
    // // khung
    // Console.clear();
    // Console.print("[STT]", 0, 0);
    // Console.print("[Ho]", 0, 8);
    // Console.print("[Ten]", 0, 20);
    // Console.print("[Tuoi]", 0, 30);
    // Console.print("[Ngay Sinh]", 0, 40);
    // Console.print("[Chuc vu]", 0, 55);
    // }

    // public void ShowNV() {
    // Console.clear();
    // try {
    // Console.loader(nv.length * 3); // thêm màu mè th
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // khung();
    // for (int i = 0; i < nv.length; i++) {
    // FindShowNV(this.nv[i], i);
    // }
    // }

    // public void FindShowNV(NhanVien nv, int i) {
    // Console.print("" + (i + 1), i + 3, 3); // "" + i ép kiểu về string

    // Console.print(nv.getHo(), i + 3, 7);
    // Console.print(nv.getTen(), i + 3, 20);

    // int tuoi = nv.getTuoi();
    // if (tuoi < 18) {
    // Console.print(Console.cRed + "" + tuoi, i + 3, 32);
    // } else if (tuoi > 18 && tuoi < 60) {
    // Console.print(Console.cGreen + "" + tuoi, i + 3, 32);
    // } else {
    // Console.print(Color.cYellow + "" + tuoi, i + 3, 32);
    // }

    // Console.print("" + nv.getNgaySinh(), i + 3, 40);

    // switch (nv.getChucVu()) {
    // case 0:
    // Console.print("Nhan vien", i + 3, 55);
    // break;
    // case 1:
    // Console.print("Quan ly", i + 3, 55);
    // break;
    // case 2:
    // Console.print("Giam Doc", i + 3, 55);
    // break;
    // default: // mặc định nếu không kiếm thấy giá trị nào hợp lý. nó sẽ đi vô đây
    // Console.print("Lao Cong", i + 3, 55);
    // break;
    // }
    // System.out.println("\n");
    // }

    // public NhanVien FindTuoi(int tuoi) {
    // for (NhanVien nv : this.nv) {
    // if (nv.getTuoi() == tuoi) {
    // return nv;
    // }
    // }
    // return null;
    // }

    // public NhanVien FindChucVu(int chucVu) {
    // for (NhanVien nv : this.nv) {
    // if (nv.getChucVu() == chucVu) {
    // return nv;
    // }
    // }
    // return null;
    // }

    // public NhanVien FindNgayThangNam(int ngay, int thang, int nam) {
    // for (NhanVien nv : this.nv) {
    // if (nv.getNgaySinh().getDayOfMonth() == ngay &&
    // nv.getNgaySinh().getMonthValue() == thang && nv.getNgaySinh().getYear() ==
    // nam) {
    // return nv;
    // }
    // }
    // return null;
    // }

    // public NhanVien FindNgaySinh(int ngay) {
    // for (NhanVien nv : this.nv) {
    // if (nv.getNgaySinh().getDayOfMonth() == ngay) {
    // return nv;
    // }
    // }
    // return null;
    // }

    // public NhanVien FindNamSinh(int nam) {
    // for (NhanVien nv : this.nv) {
    // if (nv.getNgaySinh().getYear() == nam) {
    // return nv;
    // }
    // }
    // return null;
    // }

    // public NhanVien FindThangSinh(int thang) {
    // for (NhanVien nv : this.nv) {
    // if (nv.getNgaySinh().getMonthValue() == thang) {
    // return nv;
    // }
    // }
    // return null;
    // }

}
