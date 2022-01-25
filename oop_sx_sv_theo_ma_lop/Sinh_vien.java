package oop_sx_sv_theo_ma_lop;

import java.util.Scanner;

public class Sinh_vien {
    private String ma_sv;
    private String name;
    private String lop;
    private String email;
    public Sinh_vien(){

    }
    public Sinh_vien(Scanner sc){
        this.ma_sv=sc.next();
        sc.nextLine();
        this.name=sc.nextLine();
        this.lop=sc.next();
        this.email=sc.next();
    }

    public String getMa_sv() { return ma_sv; }

    public void setMa_sv(String ma_sv) { this.ma_sv = ma_sv; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getLop() { return lop; }

    public void setLop(String lop) { this.lop = lop; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public void show(){
        System.out.println(getMa_sv()+" "+getName()+" "+getLop()+" "+getEmail());
    }
}
