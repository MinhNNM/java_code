package oop_bang_ke_nhap_kho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String a[]=new String[55];
        for(int i=1; i<=t; i++){
            int dem=1;
            sc.nextLine();
            San_pham sp=new San_pham(sc);
            a[i]=sp.getMa_sp();
            for (int j = 1; j <i; j++) {
                if(a[i].equals(a[j]))
                    dem+=1;
            }
            System.out.println(sp.getMa_sp()+String.valueOf(dem)+" "+sp.show());
        }
    }
}
