package oop_tinh_gia_ban;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            Gia_ban gb=new Gia_ban(i, sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
            gb.show();
        }
    }
}
