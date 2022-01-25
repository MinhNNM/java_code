package oop_lk_sv_theo_nganh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String a[]=new String[1002], b[]=new String[1002], c[]=new String[1002];
        for (int i = 1; i <= t; i++) {
            sinh_vien sv=new sinh_vien(sc);
            a[i]=sv.show();
            b[i]=sv.getNganh();
            c[i]=sv.getLop().substring(0, 1);
        }
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s=sc.nextLine(), x="";
            String st[]=s.split(" ");
            for (String i:st)
                x+=String.valueOf(i.charAt(0)).toUpperCase();
            x=x.substring(0,2);
            System.out.println("DANH SACH SINH VIEN NGANH "+s.toUpperCase()+":");
            for (int i = 1; i <= t; i++) {
                if(s.equalsIgnoreCase("cong nghe thong tin") || s.equalsIgnoreCase("an toan thong tin")){
                    if(b[i].equals(x) && !c[i].equals("E"))
                        System.out.println(a[i]);
                }
                else if(b[i].equals(x))
                    System.out.println(a[i]);
            }
        }
    }
}
