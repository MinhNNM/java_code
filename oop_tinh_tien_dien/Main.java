package oop_tinh_tien_dien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            Tien_dien td=new Tien_dien(i, sc.next(), sc.nextInt(), sc.nextInt());
            td.show();
        }
    }
}
