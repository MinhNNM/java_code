package oop_tinh_gia_ban_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Gia_ban> res=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            Gia_ban gb=new Gia_ban(i, sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
            res.add(gb);
        }
        Collections.sort(res, new Comparator<Gia_ban>() {
            @Override
            public int compare(Gia_ban o1, Gia_ban o2) {
                if(o1.getGia_ban()<o2.getGia_ban())
                    return 1;
                else
                    return -1;
            }
        });
        for (Gia_ban i:res)
            i.show();
    }
}
