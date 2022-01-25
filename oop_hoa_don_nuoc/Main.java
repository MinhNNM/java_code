package oop_hoa_don_nuoc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Hoa_don> res=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            Hoa_don hd=new Hoa_don(i, sc.nextLine(), sc.nextInt(), sc.nextInt());
            res.add(hd);
        }
        Collections.sort(res, new Comparator<Hoa_don>() {
            @Override
            public int compare(Hoa_don o1, Hoa_don o2) {
                if(o1.getChi_so()<o2.getChi_so())
                    return 1;
                return -1;
            }
        });
        for (Hoa_don i:res){
            System.out.println(i.toString());
        }
    }
}
