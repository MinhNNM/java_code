package oop_bang_xep_hang;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Sinh_vien> res=new ArrayList<>();
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            res.add(new Sinh_vien(sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(res, Comparator.comparing(Sinh_vien::getTen));
        Collections.sort(res, Comparator.comparing(Sinh_vien::getTong));
        Collections.sort(res, new Comparator<Sinh_vien>() {
            @Override
            public int compare(Sinh_vien o1, Sinh_vien o2) {
                if(o1.getAc()<=o2.getAc())
                    return 1;
                else
                    return -1;
            }
        });
        for (Sinh_vien i:res)
            System.out.println(i.toString());
    }
}
