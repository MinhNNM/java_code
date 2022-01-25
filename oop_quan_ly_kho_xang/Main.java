package oop_quan_ly_kho_xang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            Quan_ly ql=new Quan_ly(sc.next(), sc.nextInt());
            System.out.println(ql.toString());
        }
    }
}
