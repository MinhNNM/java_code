package oop_tra_cuu_don_hang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            sc.nextLine();
            Don_hang dh=new Don_hang(sc.nextLine(), sc.next(), sc.nextLong(), sc.nextInt());
            dh.show();
        }
    }
}
