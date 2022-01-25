package oop_tinh_luong;

public class Luong {
    private String ma_nv, name, phong;
    private int luong_cb, ngay_cong;

    public Luong(String ma_nv, String name, int luong_cb, int ngay_cong) {
        this.ma_nv = ma_nv;
        this.name = name;
        this.luong_cb = luong_cb;
        this.ngay_cong = ngay_cong;
    }

    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLuong_cb() {
        return luong_cb;
    }

    public void setLuong_cb(int luong_cb) {
        this.luong_cb = luong_cb;
    }

    public int getNgay_cong() {
        return ngay_cong;
    }

    public void setNgay_cong(int ngay_cong) {
        this.ngay_cong = ngay_cong;
    }

    public int getHe_so(){
        int hs;
        String x=getMa_nv().substring(0, 1);
        int y=Integer.parseInt(toString().substring(1, 3));
        if(x.equalsIgnoreCase("A")){
            if(y>=1 && y<=3)
                hs=10;
            else if(y>=4 && y<=8)
                hs=12;
            else if(y>=9 && y<=15)
                hs=14;
            else
                hs=20;
        }
        else if(x.equalsIgnoreCase("B")){
            if(y>=1 && y<=3)
                hs=10;
            else if(y>=4 && y<=8)
                hs=11;
            else if(y>=9 && y<=15)
                hs=13;
            else
                hs=16;
        }
        else if(x.equalsIgnoreCase("C")){
            if(y>=1 && y<=3)
                hs=9;
            else if(y>=4 && y<=8)
                hs=10;
            else if(y>=9 && y<=15)
                hs=12;
            else
                hs=14;
        }
        else{
            if(y>=1 && y<=3)
                hs=8;
            else if(y>=4 && y<=8)
                hs=9;
            else if(y>=9 && y<=15)
                hs=11;
            else
                hs=13;
        }
        return hs;
    }

    public long getLuong_thang(){
        return getHe_so()*getLuong_cb()*getNgay_cong()*1000;
    }

    public String check(){
        String s=getMa_nv().substring(3);
        return s;
    }
    public void setPhong(String x){
        this.phong=x;
    }
    public String getPhong(){
        return this.phong;
    }
    public String toString(){
        return getMa_nv()+" "+getName()+" "+getPhong()+" "+getLuong_thang()+" "+getPhong();
    }
}
