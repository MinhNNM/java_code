package oop_sx_thoi_gian;

import java.util.Scanner;

public class thoi_gian {
    private String gio;
    private String phut;
    private String giay;

    public thoi_gian(){

    }

    public String getGio() {
        if(gio.length()==1)
            gio="0"+gio;
        return gio;
    }

    public String getPhut() {
        if(phut.length()==1)
            phut="0"+phut;
        return phut;
    }

    public String getGiay() {
        if(giay.length()==1)
            giay="0"+giay;
        return giay;
    }

    public void nhap(Scanner sc){
        gio=sc.next();
        phut=sc.next();
        giay=sc.next();
    }

    public int getTime() {
        String s=getGio()+getPhut()+getGiay();
        return Integer.parseInt(s);
    }

    public String show(){
        String s=gio+" "+phut+" "+giay;
        return s;
    }
}
