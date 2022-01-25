package oop_lop_hoc_phan_2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Hoc_phan> res=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0){
            res.add(new Hoc_phan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(res, Comparator.comparing(Hoc_phan::getLop));
        Collections.sort(res, Comparator.comparing(Hoc_phan::getMa));
        int q=Integer.parseInt(sc.nextLine());
        for(int k=0; k<q; k++){
            String s=sc.nextLine(), st="";
            System.out.println("Danh sach cho giang vien "+s+":");
            for (Hoc_phan i: res){
                if(i.getTen_gv().equalsIgnoreCase(s)){
                    System.out.println(i.toString());
                }
            }
        }
    }
}
