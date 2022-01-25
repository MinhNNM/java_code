package oop_quan_ly_bt_nhom_1;

import java.util.Scanner;

public class sinh_vien {
    private String ma_sv;
    private String name;
    private String phone;
    private int stt;

    public sinh_vien(Scanner sc){
        this.ma_sv=sc.next();
        sc.nextLine();
        this.name=sc.nextLine();
        this.phone=sc.next();
        this.stt=sc.nextInt();
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String show(){
        return (getMa_sv()+" "+getName()+" "+getPhone());
    }
}
