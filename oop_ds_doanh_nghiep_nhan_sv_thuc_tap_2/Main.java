package oop_ds_doanh_nghiep_nhan_sv_thuc_tap_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        doanh_nghiep dn=new doanh_nghiep();
        String a[]=new String[t+2], c[]=new String[t+2];
        int b[]=new int[t+2];
        for (int i = 1; i <= t; i++) {
            dn.nhap(sc);
            a[i]=dn.show();
            b[i]=dn.getSo_sv();
            c[i]=dn.getMa_dn();
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t-i; j++) {
                if(c[j].compareTo(c[j+1])>0)
                {
                    String tmp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=tmp;

                    String tp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tp;

                    int tm=b[j];
                    b[j]=b[j+1];
                    b[j+1]=tm;
                }
            }
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t-i; j++) {
                if(b[j]<b[j+1])
                {
                    int tmp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=tmp;

                    String tp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tp;
                }
            }
        }
        int q=sc.nextInt();
        while(q-->0){
            int x=sc.nextInt(), y=sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+x+" DEN "+y+" SINH VIEN:");
            for (int i = 1; i <= t; i++) {
                if(b[i]>=x && b[i]<=y)
                    System.out.println(a[i]);
            }
        }
    }
}
