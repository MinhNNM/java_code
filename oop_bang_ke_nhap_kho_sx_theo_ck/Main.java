package oop_bang_ke_nhap_kho_sx_theo_ck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String a[]=new String[55], b[]=new String[55];
        long c[]=new long[55];
        for(int i=1; i<=t; i++){
            int dem=1;
            sc.nextLine();
            San_pham sp=new San_pham(sc);
            a[i]=sp.getMa_sp();
            for (int j = 1; j <i; j++) {
                if(a[i].equals(a[j]))
                    dem+=1;
            }
            c[i]=sp.getT_ck();
            b[i]=sp.getMa_sp()+String.valueOf(dem)+" "+sp.show();
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t; j++) {
                if(c[j]<c[j+1]){
                    long tmp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=tmp;

                    String tp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=tp;
                }
            }
        }
        for (int i = 1; i <= t; i++) {
            System.out.println(b[i]);
        }
    }
}
