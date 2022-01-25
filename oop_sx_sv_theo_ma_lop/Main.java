package oop_sx_sv_theo_ma_lop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Sinh_vien> res=new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            Sinh_vien sv=new Sinh_vien(sc);
            res.add(sv);
        }
        Collections.sort(res, Comparator.comparing(Sinh_vien::getMa_sv));
        Collections.sort(res, Comparator.comparing(Sinh_vien::getLop));
        for(Sinh_vien i:res)
            i.show();
    }
}
