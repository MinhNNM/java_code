package oop_tre_nhat_gia_nhat;

import java.util.Scanner;

public class danh_sach {
    private String name;
    private String age;

    public danh_sach(){

    }

    public void nhap(Scanner sc){
        name=sc.next();
        age=sc.next();
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        String st[]=age.split("/");
        String s="";
        for(String i:st)
            s=i+s;
        return s;
    }
}
