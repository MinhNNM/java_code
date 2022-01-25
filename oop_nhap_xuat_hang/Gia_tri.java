package oop_nhap_xuat_hang;

public class Gia_tri {
    private Hang_hoa hh;
    private String ma;
    private int so_luong, gia_lay, gia_ban;

    public Gia_tri(String ma, int so_luong, int gia_lay, int gia_ban, Hang_hoa hh) {
        this.ma = ma;
        this.so_luong = so_luong;
        this.gia_lay = gia_lay;
        this.gia_ban = gia_ban;
        this.hh=hh;
    }

    public Hang_hoa getHh() {
        return hh;
    }

    public void setHh(Hang_hoa hh) {
        this.hh = hh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public int getGia_lay() {
        return gia_lay*getSo_luong();
    }

    public void setGia_lay(int gia_lay) {
        this.gia_lay = gia_lay;
    }

    public int getGia_ban() {
        return gia_ban;
    }

    public void setGia_ban(int gia_ban) {
        this.gia_ban = gia_ban;
    }

    public int getTong_gt_xuat(){
        int x=getGia_ban()*this.gia_lay;
        int y=(int)(x*hh.getLai());
        return x+y;
    }
    public String toString(){
        return hh.getMa()+" "+hh.getName()+" "+getGia_lay()+" "+getTong_gt_xuat();
    }
}
