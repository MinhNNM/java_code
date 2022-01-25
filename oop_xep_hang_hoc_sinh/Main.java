package oop_xep_hang_hoc_sinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<Hoc_sinh> res=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            Hoc_sinh hs=new Hoc_sinh(i, sc.nextLine(), Double.parseDouble(sc.nextLine()));
            res.add(hs);
        }
        Collections.sort(res, new Comparator<Hoc_sinh>() {
            @Override
            public int compare(Hoc_sinh o1, Hoc_sinh o2) {
                if(o1.getDiem()<o2.getDiem())
                    return 1;
                else
                    return -1;
            }
        });
        int x=1, y=1;
        res.get(0).setStt(y);
        for (int i = 1; i < res.size(); i++) {
            if(res.get(i).getDiem()==res.get(i-1).getDiem()){
                res.get(i).setStt(y);
                x++;
            }
            else{
                y=x+1;
                res.get(i).setStt(y);
                x++;
            }
        }
        Collections.sort(res, Comparator.comparing(Hoc_sinh::getMa_hs));
        for (Hoc_sinh i:res)
            i.show();
    }
}
