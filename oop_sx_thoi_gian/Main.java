package oop_sx_thoi_gian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String a[]=new String[5005];
        int b[]=new int[5005];
        thoi_gian time=new thoi_gian();
        for (int i = 1; i <= t; i++) {
            time.nhap(sc);
            a[i]=time.show();
            b[i]=time.getTime();
        }
        for(int i=1; i<=t; i++)
        {
            for (int j = 1; j <= t-i; j++) {
                if (b[j] > b[j+1]) {
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
