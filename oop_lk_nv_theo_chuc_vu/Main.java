package oop_lk_nv_theo_chuc_vu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String a[]=new String[55], b[]=new String[55];
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            Nhan_vien nv=new Nhan_vien(sc);
            a[i]=nv.show(i);
            b[i]=nv.getCh_vu();
        }
        String x=sc.next();
        for (int i = 1; i <= t; i++) {
            if(b[i].equals(x))
                System.out.println(a[i]);
        }
    }
}
