package oop_bai_toan_tuyen_sinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hoc_sinh hs=new Hoc_sinh(String.valueOf(sc.nextLine()), sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextDouble(), sc.nextDouble());
        hs.show();
    }
}
