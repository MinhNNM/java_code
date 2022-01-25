package oop_ds_doi_tuong_sv_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            sinh_vien_1 sv=new sinh_vien_1();
            sv.nhap(sc);
            System.out.print(sv.getMa_sv(i));
            sv.show();
            System.out.println();
        }
    }
}
