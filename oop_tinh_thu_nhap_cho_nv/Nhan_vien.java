package oop_tinh_thu_nhap_cho_nv;

import java.util.Scanner;

public class Nhan_vien {
    private String ma_nv;
    private String name;
    private String ch_vu;
    private int luongcb;
    private int ngay_cong;

    public Nhan_vien(Scanner sc){
        name=sc.nextLine();
        ch_vu=sc.next();
        luongcb=sc.nextInt();
        ngay_cong=sc.nextInt();
        ma_nv="NV";
    }

    public String getMa_nv(int i) {
        if(i<10)
            ma_nv+="0"+String.valueOf(i);
        else
            ma_nv+=String.valueOf(i);
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) { this.ma_nv = ma_nv; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCh_vu() { return ch_vu; }

    public void setCh_vu(String ch_vu) { this.ch_vu = ch_vu; }

    public int getLuongcb() { return luongcb; }

    public void setLuong(int luongcb) { this.luongcb = luongcb; }

    public int getNgay_cong() { return ngay_cong; }

    public void setNgay_cong(int ngay_cong) { this.ngay_cong = ngay_cong; }

    public int getPhu_cap(){
        int x=0;
        if(ch_vu.equals("GD"))
            x=500;
        else if(ch_vu.equals("PGD"))
            x=400;
        else if(ch_vu.equals("TP"))
            x=300;
        else if(ch_vu.equals("KT"))
            x=250;
        else
            x=100;
        return x;
    }

    public int getLuong(){ return getLuongcb()*getNgay_cong(); }

    public int getTam_ung(){
        double x=(double)(getPhu_cap()+getLuong())*2/3;
        if(x<25000)
            return (int)Math.round(x/1000)*1000;
        else
            return 25000;
    }

    public int getT_thua(){
        return getLuong()+getPhu_cap()-getTam_ung();
    }

    public void show(int i){
        System.out.println(getMa_nv(i)+" "+getName()+" "+ getPhu_cap()+" "
                +getLuong()+" "+getTam_ung()+" "+getT_thua());
    }
}
