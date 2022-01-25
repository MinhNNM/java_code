package oop_quan_ly_bt_nhom_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        String a[]=new String[102], b[]=new String[102];
        int c[]=new int[102];
        for (int i = 1; i <= n; i++) {
            sinh_vien sv=new sinh_vien(sc);
            a[i]=sv.show();
            c[i]=sv.getStt();
        }
        sc.nextLine();
        for (int i = 1; i <= m; i++) {
            bai_tap bt=new bai_tap(sc.nextLine());
            b[i]=bt.getBt();
        }
        int q=sc.nextInt();
        while(q-->0){
            int i=sc.nextInt();
            System.out.println("DANH SACH NHOM "+i+":");
            for (int j = 1; j <= n; j++) {
                if(c[j]==i)
                    System.out.println(a[j]);
            }
            System.out.println("Bai tap dang ky: " + b[i]);
        }
    }
}
