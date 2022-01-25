package oop_lap_bang_tinh_cong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            Tinh_cong tl = new Tinh_cong(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextInt(), sc.next());
            tl.show();
        }
    }
}