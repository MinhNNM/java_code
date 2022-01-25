package oop_sx_ds_giang_vien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String a[]=new String[55], b[]=new String[55];
        for (int i = 1; i <= t; i++) {
            giang_vien gv=new giang_vien(sc.nextLine(), sc.nextLine());
            a[i]=gv.show(i);
            b[i]=gv.getName1();
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t-i; j++) {
                if(b[j].compareTo(b[j+1])>0){
                    String tmp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=tmp;

                    String tm=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tm;
                }
            }
        }
        for (int i = 1; i <= t; i++) {
            System.out.println(a[i]);
        }
    }
}
