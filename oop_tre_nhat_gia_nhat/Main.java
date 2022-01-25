package oop_tre_nhat_gia_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        danh_sach ds=new danh_sach();
        String a[]=new String[105];
        int b[]=new int[105];
        for (int i = 1; i <= t; i++) {
            ds.nhap(sc);
            a[i]=ds.getName();
            String x=ds.getAge();
            b[i]=Integer.parseInt(x);
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t-i; j++) {
                if(b[j]>b[j+1]) {
                    int tmp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = tmp;

                    String tp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tp;
                }
            }
        }
        System.out.println(a[t]);
        System.out.println(a[1]);
    }
}
