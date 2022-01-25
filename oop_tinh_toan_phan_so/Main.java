package oop_tinh_toan_phan_so;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            Phan_so ps=new Phan_so(sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong());
            System.out.println(ps.toString());
        }
    }
}
