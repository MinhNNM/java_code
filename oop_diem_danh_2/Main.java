package oop_diem_danh_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int diem(String s){
        int dem=10;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='x')
                dem+=0;
            else if(s.charAt(i)=='m')
                dem-=1;
            else if(s.charAt(i)=='v')
                dem-=2;
        }
        return dem;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Diem_danh> res=new ArrayList<>();
        for(int i=0; i<t; i++){
            sc.nextLine();
            Diem_danh x=new Diem_danh(sc.nextLine(), sc.nextLine(), sc.next());
            res.add(x);
        }
        sc.nextLine();
        for(int j=0; j<t; j++){
            String s=sc.nextLine();
            String st[]=s.split(" ");
            for(Diem_danh i:res){
                if(i.getMa_sv().equalsIgnoreCase(st[0])){
                    i.setDiem(diem(st[1]));
                }
            }
        }
        String x=sc.next();
        for(Diem_danh i:res){
            if(i.getLop().equalsIgnoreCase(x))
                System.out.println(i.toString());
        }
    }
}
