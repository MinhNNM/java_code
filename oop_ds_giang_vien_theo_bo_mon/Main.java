package oop_ds_giang_vien_theo_bo_mon;

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
            b[i]=gv.getBo_mon1();
        }
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s=sc.nextLine(),s1="";
            String st[]=s.split(" ");
            for(String i:st){
                s1+=String.valueOf(i.charAt(0)).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " +s1+": ");
            for (int i = 1; i <= t; i++) {
                if(s.equals(b[i]))
                    System.out.println(a[i]);
            }
        }
    }
}
