package oop_khai_bao_lop_nhan_vien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        nhan_vien nv=new nhan_vien();
        Scanner sc =new Scanner(System.in);
        nv.nhap(sc);
        nv.show();
    }
}
