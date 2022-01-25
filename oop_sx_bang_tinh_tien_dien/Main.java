package oop_sx_bang_tinh_tien_dien;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Tien_dien> res=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            Tien_dien td=new Tien_dien(i, sc.next(), sc.nextInt(), sc.nextInt());
            res.add(td);
        }
        Collections.sort(res, new Comparator<Tien_dien>() {
            @Override
            public int compare(Tien_dien o1, Tien_dien o2) {
                if(o1.getTong()<o2.getTong())
                    return 1;
                else
                    return -1;
            }
        });
        for (Tien_dien i:res)
            i.show();
    }
}
