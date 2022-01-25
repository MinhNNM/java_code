package oop_clb_bong_da_2;

public class Bong_da {
    private String ma, name;
    private int gia, so_tran;

    public Bong_da(){

    }

    public Bong_da(String ma, String name, int gia) {
        this.ma = ma;
        this.name = name;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public int getGia() {
        return gia;
    }
}
