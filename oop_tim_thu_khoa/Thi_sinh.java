package oop_tim_thu_khoa;

import java.text.DecimalFormat;

public class Thi_sinh {
    private String name, age;
    int ma;
    private double diem1, diem2, diem3;

    public Thi_sinh(){

    }

    public Thi_sinh(int x, String name, String age, double diem1, double diem2, double diem3){
        this.ma=x;
        this.name=name;
        this.age=age;
        this.diem1=diem1;
        this.diem2=diem2;
        this.diem3=diem3;
    }

    public String getDiem(){
        DecimalFormat Format=new DecimalFormat("#.#");
        return Format.format(this.diem1+this.diem2+this.diem3);
    }

    public int getMa(){
        return this.ma;
    }

    public String toString(){
        return (this.ma+" "+this.name+" "+this.age+" "+getDiem());
    }
}
