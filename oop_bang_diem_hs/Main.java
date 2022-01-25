package oop_bang_diem_hs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String a[]=new String[55];
        float b[]=new float[55], c[]=new float[55];
        hoc_sinh hs=new hoc_sinh();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            hs.nhap(sc);
            a[i]=hs.getMa_hs(i)+hs.show();
            float x=(float)Math.round(hs.getDiem()*10)/10;
            b[i]=x;
            c[i]= hs.getDiem();
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t-1; j++) {
                if(b[j]<b[j+1])
                {
                    float tmp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=tmp;

                    float tm=c[j];
                    c[j]=c[j+1];
                    c[j+1]=tm;
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
