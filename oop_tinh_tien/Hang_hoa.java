package oop_tinh_tien;

public class Hang_hoa {
    private String ma, name;
    private int so_luong;
    private long don_gia, chiet_khau;

    public Hang_hoa() {

    }

    public Hang_hoa(String ma, String name, int so_luong, long don_gia, long chiet_khau) {
        this.ma = ma;
        this.name = name;
        this.so_luong = so_luong;
        this.don_gia = don_gia;
        this.chiet_khau = chiet_khau;
    }

    public long getTien() {
        return this.don_gia * this.so_luong - this.chiet_khau;
    }

    @Override
    public String toString() {
        String x=String.valueOf(getTien());
        return this.ma + " " + this.name + " " + this.so_luong
                + " " + this.don_gia + " " + this.chiet_khau + " " + x;
    }
}