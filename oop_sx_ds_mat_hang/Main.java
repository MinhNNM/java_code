package oop_sx_ds_mat_hang;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Danh_sach> res=new ArrayList<>();
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            res.add(new Danh_sach(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(res, new Comparator<Danh_sach>() {
            @Override
            public int compare(Danh_sach o1, Danh_sach o2) {
                if(Double.parseDouble(o1.getLoi_nhuan())<Double.parseDouble(o2.getLoi_nhuan()))
                    return 1;
                else
                    return -1;
            }
        });
        for (Danh_sach i:res)
            System.out.println(i.toString());
    }
}
