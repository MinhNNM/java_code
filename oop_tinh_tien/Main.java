package oop_tinh_tien;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Hang_hoa> res=new ArrayList<>();
        int t=sc.nextInt();
        while (t-->0){
            sc.nextLine();
            res.add(new Hang_hoa(String.valueOf(sc.nextLine()), sc.nextLine(), sc.nextInt(), sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(res, new Comparator<Hang_hoa>() {
            @Override
            public int compare(Hang_hoa o1, Hang_hoa o2) {
                if(o1.getTien()<o2.getTien())
                    return 1;
                else
                    return -1;
            }
        });
        for (Hang_hoa i:res)
            System.out.println(i.toString());
    }
}
