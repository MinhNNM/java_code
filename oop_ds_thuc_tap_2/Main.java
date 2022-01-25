package oop_ds_thuc_tap_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        danh_sach_2 sv = new danh_sach_2();
        String a[] = new String[t + 2], b[] = new String[t + 2], c[] = new String[t + 2];
        for (int i = 1; i <= t; i++) {
            sv.nhap(sc);
            a[i] = String.valueOf(i) + sv.show();
            b[i] = sv.getMa_sv();
            c[i] = sv.getDn();
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t - i; j++) {
                if (b[j].compareTo(b[j + 1]) > 0) {
                    String tmp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = tmp;

                    String tp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tp;

                    String tm = c[j];
                    c[j] = c[j+1];
                    c[j+1] = tm;
                }
            }
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            String x = sc.next();
            for (int i = 1; i <= t; i++) {
                if (c[i].equals(x))
                    System.out.println(a[i]);
            }
        }
    }
}
