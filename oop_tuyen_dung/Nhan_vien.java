package oop_tuyen_dung;

import java.text.DecimalFormat;
import java.text.Format;

public class Nhan_vien {
    private String ma;
    private String name;
    private double diem1, diem2;

    public Nhan_vien(){

    }

    public Nhan_vien(int x, String name, double diem1, double diem2) {
        this.ma="TS"+String.format("%02d", x);
        this.name = name;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public String getDiem(){
        if (diem1>10)
            diem1/=10;
        if (diem2>10)
            diem2/=10;
        return String.format("%.2f", (diem1+diem2)/2);
    }

    public String getXep_loai(){
        Double x=Double.parseDouble(getDiem());
        if (x<5)
            return "TRUOT";
        else if (x<8)
            return "CAN NHAC";
        else if (x<9.5)
            return "DAT";
        else
            return "XUAT SAC";
    }

    public String toString(){
        return this.ma+" "+this.name+" "+getDiem()+" "+getXep_loai();
    }
}
