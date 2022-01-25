package oop_lk_nhap_hang_theo_nhom;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<San_pham> res=new ArrayList<>();
        while (t-->0){
            San_pham sp=new San_pham(sc.next(), sc.nextInt());
            res.add(sp);
        }
        Collections.sort(res, new Comparator<San_pham>() {
            @Override
            public int compare(San_pham o1, San_pham o2) {
                if(o1.getThue()<o2.getThue())
                    return 1;
                else
                    return -1;
            }
        });
        String x=sc.next();
        for(int i=0; i<res.size(); i++)
            if(res.get(i).getMa().substring(0,1).compareTo(x)==0)
                res.get(i).show();
    }
}
