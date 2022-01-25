package oop_sx_ds_doi_tuong_nv;

import java.util.Scanner;

public class nhan_vien {
    private String ma_nv;
    private String name;
    private String gioi_tinh;
    private String age;
    private String address;
    private String ma_thue;
    private String ngay_ki;

    public nhan_vien(){
        ma_nv="";
        name="";
        gioi_tinh="";
        age="";
        address="";
        ma_thue="";
        ngay_ki="";
    }

    public void nhap(Scanner sc){
        name=sc.nextLine();
        gioi_tinh=sc.next();
        age=sc.next();
        sc.nextLine();
        address=sc.nextLine();
        ma_thue=sc.next();
        ngay_ki=sc.next();
    }

    public String getMa_nv(int i) {
        if(i<10)
            ma_nv="0000"+i;
        else
            ma_nv="000"+i;
        return ma_nv;
    }

    public String getName() {
        return name;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getMa_thue() {
        return ma_thue;
    }

    public String getNgay_ki() {
        return ngay_ki;
    }

    public String show(){
        String s=" " + getName() + " " + getGioi_tinh() + " " + getAge() +
                " " + getAddress() + " " + getMa_thue() + " " + getNgay_ki();
        return s;
    }
}
