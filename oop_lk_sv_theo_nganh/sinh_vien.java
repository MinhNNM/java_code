package oop_lk_sv_theo_nganh;

import java.util.Scanner;

public class sinh_vien {
    private String ma_sv;
    private String name;
    private String lop;
    private String email;

    public sinh_vien(Scanner sc){
        this.ma_sv=sc.next();
        sc.nextLine();
        this.name=sc.nextLine();
        this.lop=sc.next();
        this.email=sc.next();
    }

    public String getMa_sv() {
        return ma_sv;
    }

    public void setMa_sv(String ma_sv) {
        this.ma_sv = ma_sv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNganh(){
        String s=ma_sv.substring(5,7);
        return s;
    }
    public String show(){
        return (getMa_sv()+" "+getName()+" "+getLop()+" "+getEmail());
    }
}
