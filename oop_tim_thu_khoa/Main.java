package oop_tim_thu_khoa;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Thi_sinh> res=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            res.add(new Thi_sinh(i, sc.nextLine(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(res, new Comparator<Thi_sinh>() {
            @Override
            public int compare(Thi_sinh o1, Thi_sinh o2) {
                if(o1.getDiem().compareTo(o2.getDiem())<=0)
                    return 1;
                else
                    return -1;
            }
        });
        System.out.println(res.get(0));
        for (int i = 1; i < t; i++) {
            if(res.get(0).getDiem().equals(res.get(i).getDiem()))
                System.out.println(res.get(i));
        }
    }
}
