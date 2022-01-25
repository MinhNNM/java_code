package oop_sx_ket_qua_xet_tuyen;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Phu_ho> res=new ArrayList<>();
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            res.add(new Phu_ho(i, sc.nextLine(), sc.next(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(res, new Comparator<Phu_ho>() {
            @Override
            public int compare(Phu_ho o1, Phu_ho o2) {
                if(o1.getDiem()<=o2.getDiem())
                    return 1;
                else
                    return -1;
            }
        });
        for (Phu_ho i:res)
            System.out.println(i.toString());
    }
}
