package oop_sap_xep_bang_tinh_cong;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Tinh_cong> res=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            Tinh_cong tl = new Tinh_cong(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextInt(), sc.next());
            res.add(tl);
        }
        Collections.sort(res, new Comparator<Tinh_cong>() {
            @Override
            public int compare(Tinh_cong o1, Tinh_cong o2) {
                if(o1.getThu_nhap()<o2.getThu_nhap())
                    return 1;
                else
                    return -1;
            }
        });
        for (Tinh_cong i:res)
            i.show();
    }
}
