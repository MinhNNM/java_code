package oop_tinh_luong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Phong> p=new ArrayList<>();
        ArrayList<Luong> l=new ArrayList<>();
        while(t-->0){
            String st[]=(sc.nextLine()).split(" ");
            p.add(new Phong(st[0], st[1]));
        }
        int q=Integer.parseInt(sc.nextLine());
        while (q-->0){
            String x=sc.nextLine();
            for(Phong i:p){
                if(x.substring(3).equalsIgnoreCase(i.getMa_phong())) {
                    Luong luong=new Luong(x, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
                    luong.setPhong(i.getTen_phong());
                    l.add(luong);
                }
            }
        }
    }
}
