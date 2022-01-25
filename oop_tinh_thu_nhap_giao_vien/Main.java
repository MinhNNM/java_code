package oop_tinh_thu_nhap_giao_vien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Giao_vien gv=new Giao_vien(String.valueOf(sc.nextLine()), sc.nextLine(), sc.nextLong());
        System.out.println(gv.toString());
    }
}
