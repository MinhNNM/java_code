package oop_lop_hoc_phan_2;

public class Hoc_phan {
    private String ma, name, lop, ten_gv;

    public Hoc_phan(String ma, String name, String lop, String ten_gv) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.ten_gv = ten_gv;
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getTen_gv() {
        return ten_gv;
    }

    public void setTen_gv(String ten_gv) {
        this.ten_gv = ten_gv;
    }

    public String toString(){
        return getMa()+" "+getName()+" "+getLop();
    }
}
