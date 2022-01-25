package oop_bang_diem_thanh_phan_2;

import java.util.Scanner;

public class sinh_vien {
    private String ma_sv;
    private String name;
    private String lop;
    private float diem1, diem2, diem3;

    public sinh_vien(){

    }

    public void nhap(Scanner sc){
        ma_sv=sc.next();
        sc.nextLine();
        name=sc.nextLine();
        lop=sc.next();
        diem1=sc.nextFloat();
        diem2=sc.nextFloat();
        diem3=sc.nextFloat();
    }

    public String getMa_sv() {
        return ma_sv;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }

    public float getDiem1() {
        return diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public String show(){
        String s=getMa_sv()+" "+getName()+" "+getLop()
                +" "+getDiem1()+" "+getDiem2()+" "+getDiem3();
        return s;
    }
}
