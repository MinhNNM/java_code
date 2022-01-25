package oop_bang_diem_hs;

import java.util.Scanner;

public class hoc_sinh {
    private String ma_hs;
    private String name;
    private float toan, tv, anh, ly, hoa, sinh;
    private float su, dia, cd, cn;

    public hoc_sinh(){

    }

    public void nhap(Scanner sc){
        name=sc.nextLine();
        toan=sc.nextFloat();  tv=sc.nextFloat();    anh=sc.nextFloat();
        ly=sc.nextFloat();    hoa=sc.nextFloat();   sinh=sc.nextFloat();
        su=sc.nextFloat();  dia=sc.nextFloat();  cd=sc.nextFloat();  cn=sc.nextFloat();
    }

    public String getMa_hs(int i) {
        if(i<10)
            ma_hs="HS0" + i;
        else
            ma_hs="HS"+i;
        return ma_hs;
    }

    public String getName() {
        return name;
    }

    public float getDiem() {
        return (toan*2+tv*2+anh+ly+hoa+sinh+su+dia+cd+cn)/12;
    }

    public String show(){
        String s="";
        float x=(float)Math.round(getDiem()*10)/10;
        if(x>=9)
            s=" " + getName() + " " + x + " XUAT SAC";
        else if(8<=x && x<9)
            s=" " + getName() + " " + x + " GIOI";
        else if(7<=x && x<8)
            s=" " + getName() + " " + x + " KHA";
        else if(5<=x && x<7)
            s=" " + getName() + " " + x + " TB";
        else if(x<5)
            s=" " + getName() + " " + x + " YEU";
        return s;
    }
}
