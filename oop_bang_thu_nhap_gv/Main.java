package oop_bang_thu_nhap_gv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Giao_vien> res=new ArrayList<>();
        int t=sc.nextInt();
        int dem_ht=0, dem_hp=0;
        while (t-->0){
            sc.nextLine();
            Giao_vien gv=new Giao_vien(String.valueOf(sc.nextLine()), sc.nextLine(), sc.nextLong());
            if (gv.getMa().substring(0, 2).equals("HT")){
                dem_ht++;
                if (dem_ht==1)
                    res.add(gv);
            }

            else if(gv.getMa().substring(0, 2).equals("HP")){
                dem_hp++;
                if (dem_hp<=2)
                    res.add(gv);
            }

            else
                res.add(gv);
        }
        for (Giao_vien i:res)
            System.out.println(i.toString());
    }
}
