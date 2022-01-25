package oop_khai_bao_lop_nhan_vien;

import java.util.Scanner;

public class nhan_vien {
    private String name;
    private String gioitinh;
    private String age;
    private String address;
    private String maso;
    private String ngayki;
    public nhan_vien(){
    }
    public void nhap(Scanner sc){
        name=sc.nextLine();
        gioitinh=sc.next();
        age=sc.next();
        sc.nextLine();
        address=sc.nextLine();
        maso=sc.next();
        ngayki=sc.next();
    }

    public String getName() {
        return name;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getMaso() {
        return maso;
    }

    public String getNgayki() {
        return ngayki;
    }
    public void show(){
        System.out.println("00001 " + name + " " + gioitinh + " "
                + age + " " + address + " " + maso + " " + ngayki);
    }
}
