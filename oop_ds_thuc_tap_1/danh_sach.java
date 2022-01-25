package oop_ds_thuc_tap_1;

import java.util.Scanner;

public class danh_sach {
    private String ma_sv;
    private String name;
    private String lop;
    private String email;
    private String dn;

    public danh_sach(){

    }

    public void nhap(Scanner sc){
        ma_sv=sc.next();
        sc.nextLine();
        name=sc.nextLine();
        lop=sc.next();
        email=sc.next();
        dn=sc.next();
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

    public String getEmail() {
        return email;
    }

    public String getDn() {
        return dn;
    }

    public String show(){
        String s=" "+getMa_sv()+" "+getName()+" "+getLop()
                +" "+getEmail()+" "+getDn();
        return s;
    }
}
