package oop_sx_bang_xang_dau;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Quan_ly> res=new ArrayList<>();
        int t=sc.nextInt();
        while (t-->0){
            Quan_ly ql=new Quan_ly(sc.next(), sc.nextInt());
            res.add(ql);
        }
        Collections.sort(res, new Comparator<Quan_ly>() {
            @Override
            public int compare(Quan_ly o1, Quan_ly o2) {
                if(o1.getTien()<o2.getTien())
                    return 1;
                return -1;
            }
        });
        for (Quan_ly i:res)
            System.out.println(i.toString());
    }
}
