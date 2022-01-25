package oop_tinh_gia_ban;

public class Gia_ban {
    private String ma_hang;
    private String ten_hang;
    private String don_vi;
    private int gia;
    private int so_luong;

    public Gia_ban(int x, String ten_hang, String don_vi, int gia, int so_luong){
        this.ma_hang="MH"+String.format("%02d", x);
        this.ten_hang=ten_hang;
        this.don_vi=don_vi;
        this.gia=gia;
        this.so_luong=so_luong;
    }

    public String getMa_hang() {
        return this.ma_hang;
    }

    public void setMa_hang(String ma_hang) {
        this.ma_hang = ma_hang;
    }

    public String getTen_hang() {
        return ten_hang;
    }

    public void setTen_hang(String ten_hang) {
        this.ten_hang = ten_hang;
    }

    public String getDon_vi() {
        return don_vi;
    }

    public void setDon_vi(String don_vi) {
        this.don_vi = don_vi;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public long getPhi_vc(){
        return Math.round(getGia()*getSo_luong()*5.0/100);
    }

    public long getTien(){
        return getPhi_vc()+getGia()*getSo_luong();
    }

    public long getGia_ban(){
        return Math.round(getTien()+getTien()*2.0/100);
    }

    public void show(){
        System.out.println(getMa_hang()+" "+getTen_hang()+" "+getDon_vi()
                +" "+getPhi_vc()+" "+getTien()+" "+getGia_ban());
    }
}
