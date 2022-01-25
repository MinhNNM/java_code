package oop_so_phuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            So_phuc sp=new So_phuc(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            System.out.println(sp.toString());
        }
    }
}
