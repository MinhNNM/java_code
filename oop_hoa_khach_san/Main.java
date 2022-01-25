package oop_hoa_khach_san;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Hoa_don> res=new ArrayList<>();
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            Hoa_don hd=new Hoa_don(i, sc.nextLine(), sc.next(), sc.next(), sc.next(), sc.nextInt());
            res.add(hd);
        }
        Collections.sort(res, new Comparator<Hoa_don>() {
            @Override
            public int compare(Hoa_don o1, Hoa_don o2) {
                if(o1.getTien()<o2.getTien())
                    return 1;
                return -1;
            }
        });
        for (Hoa_don i:res)
            System.out.println(i.toString());
    }
}
