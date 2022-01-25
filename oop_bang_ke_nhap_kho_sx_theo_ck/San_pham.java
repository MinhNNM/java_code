package oop_bang_ke_nhap_kho_sx_theo_ck;

import java.util.Scanner;

public class San_pham {
    private String ma_sp;
    private String name;
    private long so_luong;
    private long gia;
    public San_pham(Scanner sc){
        this.name=sc.nextLine();
        this.so_luong=sc.nextLong();
        this.gia=sc.nextLong();
        this.ma_sp="";
    }

    public String getMa_sp() {
        String st[]=name.split(" ");
        return (String.valueOf(st[0].charAt(0))+String.valueOf(st[1].charAt(0))).toUpperCase()+"0";
    }

    public void setMa_sp(String ma_sp) { this.ma_sp = ma_sp; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public long getSo_luong() { return so_luong; }

    public void setSo_luong(long so_luong) { this.so_luong = so_luong; }

    public long getGia() { return gia; }

    public void setGia(long gia) { this.gia = gia; }

    public long getT_ck(){
        if(getSo_luong()>10)
            return (long)(getGia()*getSo_luong()*0.05);
        else if(getSo_luong()<=10 && getSo_luong()>=8)
            return (long)(getGia()*getSo_luong()*0.02);
        else if(getSo_luong()<8 && getSo_luong()>=5)
            return (long)(getGia()*getSo_luong()*0.01);
        else
            return 0;
    }

    public long getTong(){ return getGia()*getSo_luong()-getT_ck(); }

    public String show(){ return (getName()+" "+getT_ck()+" "+getTong()); }
}
