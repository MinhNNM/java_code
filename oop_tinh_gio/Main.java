package oop_tinh_gio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[25];
        int b[]=new int[25];
        int t=sc.nextInt();
        tinh_gio time=new tinh_gio();
        for (int i = 1; i <= t; i++) {
            time.nhap(sc);
            a[i]=time.show();
            String x=time.getThoi_gian();
            b[i]=Integer.parseInt(x);
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t-i; j++) {
                if(b[j]<b[j+1]){
                    int tmp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=tmp;

                    String tp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tp;
                }
            }
        }
        for (int i = 1; i <= t; i++) {
            System.out.println(a[i]);
        }
    }
}
