package oop_lop_hoc_phan_1;

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
        int q=sc.nextInt();
        for(int k=0; k<q; k++){
            String s=sc.next(), st="";
            for (Hoc_phan i: res){
                if(i.getMa().equalsIgnoreCase(s)){
                    st=i.getName();
                }
            }
            System.out.println("Danh sach nhom lop mon "+st+":");
            for (Hoc_phan i: res){
                if(i.getMa().equalsIgnoreCase(s)){
                    System.out.println(i.toString());
                }
            }
        }
    }
}
