package oop_tuyen_dung;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Nhan_vien> res=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            Nhan_vien nv=new Nhan_vien(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            res.add(nv);
        }
        Collections.sort(res, new Comparator<Nhan_vien>() {
            @Override
            public int compare(Nhan_vien o1, Nhan_vien o2) {
                if(Double.parseDouble(o1.getDiem())<Double.parseDouble(o2.getDiem()))
                    return 1;
                return -1;
            }
        });
        for (Nhan_vien i:res)
            System.out.println(i.toString());
    }
}
