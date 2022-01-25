package oop_sx_sv_theo_ma_sv;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<sinh_vien> res=new ArrayList<>();
        while(sc.hasNext())
        {
            sinh_vien sv=new sinh_vien(sc);
            res.add(sv);
        }
        Collections.sort(res, Comparator.comparing(sinh_vien::getMa_sv));
        for (sinh_vien i:res)
            i.show();
    }
}
