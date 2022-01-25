package oop_tinh_thu_nhap_cho_nv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            Nhan_vien nv=new Nhan_vien(sc);
            nv.show(i);
        }
    }
}
