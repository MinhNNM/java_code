package oop_bang_diem_thanh_phan_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String a[]=new String[102], b[]=new String[102];
        sinh_vien sv=new sinh_vien();
        for (int i = 1; i <= t; i++) {
            sv.nhap(sc);
            a[i]=sv.show();
            b[i]=sv.getMa_sv();
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t-i; j++) {
                if(b[j].compareTo(b[j+1])>0){
                    String tmp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=tmp;

                    String tp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tp;
                }
            }
        }
        for (int i = 1; i <= t; i++) {
            System.out.print(i+" ");
            System.out.println(a[i]);
        }
    }
}
