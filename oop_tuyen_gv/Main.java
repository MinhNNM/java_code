package oop_tuyen_gv;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Giang_vien> res=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            Giang_vien gv=new Giang_vien(i, sc.nextLine(), sc.next(), sc.nextDouble(), sc.nextDouble());
            res.add(gv);
        }
        Collections.sort(res, new Comparator<Giang_vien>() {
            @Override
            public int compare(Giang_vien o1, Giang_vien o2) {
                if(Double.parseDouble(o1.getDiem())<Double.parseDouble(o2.getDiem()))
                    return 1;
                else if(Double.parseDouble(o1.getDiem())==Double.parseDouble(o2.getDiem())){
                    if (o1.getMa_gv().compareTo(o2.getMa_gv())>0)
                        return 1;
                    return -1;
                }
                return -1;
            }
        });
        for (Giang_vien i:res)
            System.out.println(i.toString());
    }
}
