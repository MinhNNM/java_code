package oop_nhap_xuat_hang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Hang_hoa> res=new ArrayList<>();
        ArrayList<Gia_tri> res1=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0){
            res.add(new Hang_hoa(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q=Integer.parseInt(sc.nextLine());
        while (q-->0){
            String s=sc.nextLine();
            String st[]=s.split(" ");
            for(Hang_hoa i:res){
                if(st[0].equalsIgnoreCase(i.getMa())){
                    res1.add(new Gia_tri(i.getMa(), Integer.parseInt(st[1]),Integer.parseInt(st[2]),Integer.parseInt(st[3]), i));
                }
            }
        }
        for(Gia_tri i:res1){
            System.out.println(i.toString());
        }
    }
}
