package oop_sx_ds_doi_tuong_nv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String a[]=new String[45];
        int b[]=new int[45];
        for (int i = 1; i <= t; i++) {
            String x="";
            sc.nextLine();
            nhan_vien nv=new nhan_vien();
            nv.nhap(sc);
            a[i]=nv.getMa_nv(i) + nv.show();
            String st[]=nv.getAge().split("/");
            for(String j:st)
                x=j+x;
            b[i]=Integer.parseInt(x);
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t-i; j++) {
                if(b[j]>b[j+1])
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
        for (int i = 1; i <= t; i++) {
            System.out.println(a[i]);
        }
    }
}
