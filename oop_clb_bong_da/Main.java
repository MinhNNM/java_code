package oop_clb_bong_da;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Bong_da> res1=new ArrayList<>();
        List<Tran_dau> res2=new ArrayList<>();
        while (t-->0){
            sc.nextLine();
            Bong_da bd=new Bong_da(sc.nextLine(), sc.nextLine(), sc.nextInt());
            res1.add(bd);
        }
        int q=sc.nextInt();
        sc.nextLine();
        while (q-->0) {
            String s=sc.nextLine();
            String st[]=s.split(" ");
            String x= st[0].substring(1, 3);
            for (Bong_da i : res1) {
                if (x.equals(i.getMa()))
                    res2.add(new Tran_dau(st[0], Integer.parseInt(st[1]), i));
            }
        }
        for (Tran_dau i:res2)
            System.out.println(i.toString());
    }
}
