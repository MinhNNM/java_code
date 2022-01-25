package oop_sx_nv_theo_thu_nhap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String a[]=new String[52];
        int b[]=new int[52];
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            Nhan_vien nv=new Nhan_vien(sc);
            a[i]=nv.show(i);
            b[i]=nv.getLuong()+nv.getPhu_cap();
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t-i; j++) {
                if(b[j]<b[j+1]){
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
