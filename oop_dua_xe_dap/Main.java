package oop_dua_xe_dap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Dua_xe> res=new ArrayList<>();
        while (t-->0){
            sc.nextLine();
            Dua_xe dx=new Dua_xe(sc.nextLine(), sc.nextLine(), sc.next());
            res.add(dx);
        }
        Collections.sort(res, new Comparator<Dua_xe>() {
            @Override
            public int compare(Dua_xe o1, Dua_xe o2) {
                if (o1.getTime()>o2.getTime())
                    return 1;
                return -1;
            }
        });
        for (Dua_xe i:res)
            System.out.println(i.toString());
    }
}
