package oop_ds_doi_tuong_sv_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[102];
        float b[]=new float[102];
        int t=sc.nextInt(), vt=0;
        for(int i=1; i<=t; i++){
            sc.nextLine();
            sinh_vien_3 sv=new sinh_vien_3();
            sv.nhap(sc);
            a[i]= sv.getMa_sv(i)+sv.show();
            for(int j=a[i].length()-1; j>=0; j--)
            {
                if(a[i].charAt(j)==' ')
                {
                    vt=j+1;
                    break;
                }
            }
            b[i]=Float.parseFloat(a[i].substring(vt));
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t-i; j++) {
                if(b[j]<b[j+1])
                {
                    float tmp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=tmp;

                    String tp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tp;
                }
            }
        }
        for (int i = 1; i <=t ; i++) {
            System.out.println(a[i]);
        }
    }
}
