package oop_quan_ly_kho_xang;

public class Quan_ly {
    private String ma_dh;
    private long so_luong;

    public Quan_ly(){

    }

    public Quan_ly(String ma_dh, int so_luong){
        this.ma_dh=ma_dh;
        this.so_luong=so_luong;
    }

    public long getDon_gia(){
        if (this.ma_dh.charAt(0)=='X')
            return 128000;
        else if (this.ma_dh.charAt(0)=='D')
            return 11200;
        else
            return 9700;
    }

    public double getThue(){
        if (this.ma_dh.substring(this.ma_dh.length()-2).equals("TN"))
            return 0.0;
        else if (this.ma_dh.charAt(0)=='X')
            return 0.03;
        else if (this.ma_dh.charAt(0)=='D')
            return 0.035;
        else
            return 0.02;
    }

    public String getHang(){
        String s=this.ma_dh.substring(this.ma_dh.length()-2);
        if (s.equals("BP"))
            return "British Petro";
        else if (s.equals("ES"))
            return "Esso";
        else if (s.equals("SH"))
            return "Shell";
        else if (s.equals("CA"))
            return "Castrol";
        else if (s.equals("MO"))
            return "Mobil";
        return "Trong Nuoc";
    }

    public long getTien_thue(){
        double x=getThue()*this.so_luong*getDon_gia();
        return (long)(Math.round(x*1)/1);
    }

    public long getTien(){
        return (getDon_gia()*this.so_luong)+getTien_thue();
    }

    public String toString(){
        return this.ma_dh+" "+getHang()+" "+getDon_gia()+" "+getTien_thue()+" "+getTien();
    }
}
