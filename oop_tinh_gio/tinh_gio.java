package oop_tinh_gio;

import java.util.Scanner;

public class tinh_gio {
    private String ma_so;
    private String name;
    private String gio_vao;
    private String gio_ra;

    public tinh_gio(){

    }

    public void nhap(Scanner sc){
        ma_so=sc.next();
        sc.nextLine();
        name=sc.nextLine();
        gio_vao=sc.next();
        gio_ra=sc.next();
    }

    public String getMa_so() {
        return ma_so;
    }

    public String getName() {
        return name;
    }

    public String getGio_vao() {
        return gio_vao;
    }

    public String getGio_ra() {
        return gio_ra;
    }

    public String getThoi_gian(){
        String s1="", x="", y="";
        int a=0, b=0;
        String st1[]=getGio_vao().split(":");
        String st2[]=getGio_ra().split(":");
        a=Integer.parseInt(st2[1])-Integer.parseInt(st1[1]);
        if(a<0){
            a+=60;
            b=Integer.parseInt(st2[0])-Integer.parseInt(st1[0])-1;
        }
        else
            b=Integer.parseInt(st2[0])-Integer.parseInt(st1[0]);
        String s=String.valueOf(a);
        if(s.length()==1)
            s="0"+s;
        s1=String.valueOf(b)+s;
        while(s1.length()<4)
            s1="0"+s1;
        return s1;
    }

    public String getTime(){
        String s="", s1=getThoi_gian();
        s=Integer.parseInt(s1.substring(0,2)) + " gio " + Integer.parseInt(s1.substring(2, s1.length())) + " phut";
        return s;
    }

    public String show(){
        String s=getMa_so() + " " + getName() + " " + getTime();
        return s;
    }
}
