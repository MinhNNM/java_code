package oop_liet_ke_sv_theo_lop;

import java.util.Scanner;

public class sinh_vien {
    private String ma_sv;
    private String name;
    private String lop;
    private String email;

    public sinh_vien(){

    }

    public void nhap(Scanner sc){
        ma_sv=sc.next();
        sc.nextLine();
        name=sc.nextLine();
        lop=sc.next();
        email=sc.next();
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


    public String show(){
        String s=getMa_sv()+" "+getName()+" "+getLop()
                +" "+getEmail();
        return s;
    }
}
