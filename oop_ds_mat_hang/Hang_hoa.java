package oop_ds_mat_hang;

public class Hang_hoa {
    private String ma, name,don_vi;
    private int gia_mua, gia_ban;

    public Hang_hoa(){

    }

    public Hang_hoa(int x, String name, String don_vi, int gia_mua, int gia_ban) {
        this.ma ="MH"+String.format("%03d", x);
        this.name = name;
        this.don_vi = don_vi;
        this.gia_mua = gia_mua;
        this.gia_ban = gia_ban;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDon_vi() {
        return don_vi;
    }

    public void setDon_vi(String don_vi) {
        this.don_vi = don_vi;
    }

    public int getGia_mua() {
        return gia_mua;
    }

    public void setGia_mua(int gia_mua) {
        this.gia_mua = gia_mua;
    }

    public int getGia_ban() {
        return gia_ban;
    }

    public void setGia_ban(int gia_ban) {
        this.gia_ban = gia_ban;
    }

    public int getLoi_nhuan(){
        return getGia_ban()-gia_mua;
    }

    @Override
    public String toString() {
        return getMa()+" "+getName()+" "+getDon_vi()+" "+getGia_mua()+" "+getGia_ban()+" "+getLoi_nhuan();
    }
}
