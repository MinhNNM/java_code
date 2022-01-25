package oop_bang_ke_tien_luong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Tien_luong> res=new ArrayList<>();
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            Tien_luong tl=new Tien_luong(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextInt(), sc.next());
            res.add(tl);
        }
        long sum=0;
        for (Tien_luong i:res) {
            i.show();
            sum+=i.getTien_linh();
        }
        System.out.println("Tong chi phi tien luong: "+sum);
    }
}
