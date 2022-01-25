package oop_bang_thu_nhap_gv;

public class Giao_vien {
    private String ma, name;
    private long luong;

    public Giao_vien(){

    }

    public Giao_vien(String ma, String name, long luong) {
        this.ma = ma;
        this.name = name;
        this.luong = luong;
    }

    public String getMa(){
        return this.ma;
    }

    public long getPhu_cap(){
        if(this.ma.substring(0, 2).equals("HT"))
            return 2000000;
        if(this.ma.substring(0, 2).equals("HP"))
            return 900000;
        else
            return 500000;
    }

    public int getHe_so(){
        String x=this.ma.substring(2);
        return Integer.parseInt(x);
    }

    public long getLuong_cb(){
        return this.luong*getHe_so()+getPhu_cap();
    }

    public String toString(){
        return (this.ma+" "+this.name+" "+getHe_so()
                +" "+getPhu_cap()+" "+getLuong_cb());
    }
}
