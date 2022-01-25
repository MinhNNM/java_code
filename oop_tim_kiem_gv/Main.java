package oop_tim_kiem_gv;

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
            b[i]=gv.getName();
        }
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s=sc.next(), s1="";
            String x=s.toLowerCase();
            String st[]=s.split(" ");
            for(String i:st){
                s1+=String.valueOf(i.charAt(0)).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " +s+": ");
            for (int i = 1; i <= t; i++) {
                if(b[i].toLowerCase().contains(x))
                    System.out.println(a[i]);
            }
        }
    }
}
