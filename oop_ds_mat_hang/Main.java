package oop_ds_mat_hang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Hang_hoa> res=new ArrayList<>();
        for(int i=1; i<=t; i++){
            sc.nextLine();
            Hang_hoa hh=new Hang_hoa(i, sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt());
            res.add(hh);
        }
        Collections.sort(res, new Comparator<Hang_hoa>() {
            @Override
            public int compare(Hang_hoa o1, Hang_hoa o2) {
                if(o1.getLoi_nhuan()<=o2.getLoi_nhuan())
                    return 1;
                else
                    return -1;
            }
        });
        for (Hang_hoa i:res){
            System.out.println(i.toString());
        }
    }
}
