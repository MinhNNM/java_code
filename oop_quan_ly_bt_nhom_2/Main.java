package oop_quan_ly_bt_nhom_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        String a[]=new String[102], b[]=new String[102], s[]=new String[102];
        int c[]=new int[102];
        for (int i = 1; i <= n; i++) {
            sinh_vien sv=new sinh_vien(sc);
            a[i]=sv.show();
            c[i]=sv.getStt();
            s[i]=sv.getMa_sv();
        }
        sc.nextLine();
        for (int i = 1; i <= m; i++) {
            bai_tap bt=new bai_tap(sc.nextLine());
            b[i]=bt.getBt();
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(c[j]==i)
                    a[j]+=b[i];
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                if(s[j].compareTo(s[j+1])>0){
                    String tmp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=tmp;

                    String tp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tp;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(a[i]);
        }
    }
}
