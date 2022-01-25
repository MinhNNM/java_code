package oop_khai_bao_lop_thisinh;

import java.util.Scanner;

public class thi_sinh {
    private String name;
    private String age;
    private float diem1;
    private float diem2;
    private float diem3;
    private float tdiem;
    public thi_sinh(){
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
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

    public float getTdiem() {
        return tdiem;
    }
    public void nhap(Scanner sc){
        name=sc.nextLine();
        age=sc.next();
        diem1= sc.nextFloat();
        diem2= sc.nextFloat();
        diem3= sc.nextFloat();
        tdiem=diem1+diem2+diem3;
    }
    public void show(){
        System.out.print(name + " " + age + " ");
        System.out.printf("%.1f", tdiem);
    }
}
