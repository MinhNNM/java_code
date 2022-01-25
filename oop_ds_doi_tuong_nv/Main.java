package oop_ds_doi_tuong_nv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            nhan_vien nv=new nhan_vien();
            nv.nhap(sc);
            nv.ma_nv(i);
            nv.show();
        }
    }
}
