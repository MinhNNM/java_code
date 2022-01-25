package oop_tinh_thu_nhap_giao_vien;

public class Giao_vien {
    private String ma, name;
    private long luong_cb;

    public Giao_vien(){

    }

    public Giao_vien(String ma, String name, long luong_cb){
        this.ma=ma;
        this.name=name;
        this.luong_cb=luong_cb;
    }

    public int getBac_luong(){
        return Integer.parseInt(this.ma.substring(2));
    }

    public int getPhu_cap(){
        if(this.ma.substring(0, 2).equals("HT"))
            return 2000000;
        else if(this.ma.substring(0, 2).equals("HP"))
            return 900000;
        else
            return 500000;
    }

    public long getThu_nhap(){
        return this.luong_cb*getBac_luong()+getPhu_cap();
    }

    public String toString(){
        return this.ma+" "+this.name+" "+getBac_luong()+" "+getPhu_cap()+" "+getThu_nhap();
    }
}
