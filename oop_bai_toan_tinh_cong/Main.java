package oop_bai_toan_tinh_cong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Tinh_cong tl=new Tinh_cong(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextInt(), sc.next());
        tl.show();
    }
}
