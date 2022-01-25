package oop_ds_doi_tuong_sv_2;

import java.util.Scanner;

public class sinh_vien_2 {
    private String ma_sv;
    private String name;
    private String age;
    private String lop;
    private float diem;

    public sinh_vien_2(){
        ma_sv="";
        name="";
        age="";
        lop="";
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
        String s="";
        name=name.trim().toLowerCase();
        name=name.replaceAll("\\s+", " ");
        String st[]=name.split(" ");
        for(int i=0; i<st.length; i++){
            s+=String.valueOf(st[i].charAt(0)).toUpperCase() + st[i].substring(1);
            if(i<st.length-1)
                s+=" ";
        }
        return s;
    }

    public String getAge() {
        String s="";
        String s1[]=age.split("/");
        for(String i:s1){
            if(i.length()==1)
                s+="0"+i+"/";
            else
                s+=i+"/";
        }
        return s.substring(0, s.length()-1);
    }

    public String getLop() {
        return lop;
    }

    public float getDiem() {
        return diem;
    }

    public void show(){
        System.out.print(" " + getName() + " " + getLop() + " " + getAge() + " ");
        System.out.printf("%.2f", getDiem());
    }
}
