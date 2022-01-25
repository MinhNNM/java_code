package oop_khai_bao_lop_sv;

import java.util.Scanner;

public class sinh_vien {
    private String name;
    private String lop;
    private String age;
    private float diem;

    public sinh_vien() {
        name = "";
        lop = "";
        age = "";
        diem = 0;
    }

    public void nhap(Scanner sc) {
        name = sc.nextLine();
        lop = sc.next();
        age = sc.next();
        diem = sc.nextFloat();
    }
    public String getName() { return name; }

    public String getLop() { return lop; }

    public String getAge() {
        String s = "";
        String s1[] = age.split("/");
        for (String i : s1) {
            if (i.length() == 1)
                s += "0" + i + "/";
            else
                s += i + "/";
        }
        return s.substring(0, s.length() - 1);
    }

    public float getDiem() { return diem; }

    public void show() {
        System.out.print("B20DCCN001" + " " + getName() + " " + getLop() + " " + getAge() + " ");
        System.out.printf("%.2f", getDiem());
    }
}