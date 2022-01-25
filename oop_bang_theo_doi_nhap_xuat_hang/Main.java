package oop_bang_theo_doi_nhap_xuat_hang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            San_pham sp=new San_pham(sc.next(), sc.nextLong());
            sp.show();
        }
    }
}
