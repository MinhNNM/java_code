package oop_liet_ke_sv_theo_lop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sinh_vien sv = new sinh_vien();
        String a[] = new String[t + 2], b[] = new String[t + 2];
        for (int i = 1; i <= t; i++) {
            sv.nhap(sc);
            a[i] = sv.show();
            b[i] = sv.getLop();
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            String x = sc.next();
            System.out.println("DANH SACH SINH VIEN LOP "+x+":");
            for (int i = 1; i <= t; i++) {
                if (b[i].equals(x))
                    System.out.println(a[i]);
            }
        }
    }
}
