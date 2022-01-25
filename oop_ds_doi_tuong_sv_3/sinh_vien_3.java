package oop_ds_doi_tuong_sv_3;

import java.util.Scanner;

public class sinh_vien_3 {
    private String ma_sv;
    private String name;
    private String lop;
    private String age;
    private float diem;

    public sinh_vien_3(){
        ma_sv="";
        name="";
        lop="";
        age="";
        diem=0;
    }

    public void nhap(Scanner sc){
        name=sc.nextLine();
        lop=sc.next();
        age=sc.next();
        diem=sc.nextFloat();
    }

    public String getMa_sv(int i) {
        if(i<10)
            ma_sv="B20DCCN00"+i;
        else
            ma_sv="B20DCCN0"+i;
        return ma_sv;
    }

    public String getName() {
        name=name.replaceAll("\\s+", " ").trim().toLowerCase();
        String a[]= name.split(" ");
        String s="";
        for(int i=0; i<a.length; i++){
            s+=String.valueOf(a[i].charAt(0)).toUpperCase()+a[i].substring(1);
            if(i<a.length-1)
                s+=" ";
        }
        return s;
    }

    public String getLop() {
        return lop;
    }

    public String getAge() {
        String s="";
        String st[]=age.split("/");
        for(String i:st){
            if(i.length()==1)
                s+="0"+i+"/";
            else
                s+=i+"/";
        }
        return s.substring(0,s.length()-1);
    }

    public Float getDiem() {
        return diem;
    }

    public String show(){
        String s=" " +getName() + " " + getLop() + " " + getAge() + " " + String.format("%.2f", getDiem());
        return s;
    }
}
