package oop_ket_qua_xet_tuyen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            Phu_ho ph=new Phu_ho(i, sc.nextLine(), sc.next(), sc.nextDouble(), sc.nextDouble());
            System.out.println(ph.toString());
        }
    }
}
