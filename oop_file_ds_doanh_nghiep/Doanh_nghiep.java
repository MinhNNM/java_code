package oop_file_ds_doanh_nghiep;

public class Doanh_nghiep {
    private String ma_dn;
    private String name;
    private int so_sv;

    public Doanh_nghiep(){

    }

    public Doanh_nghiep(String ma_dn, String name, int so_sv) {
        this.ma_dn = ma_dn;
        this.name = name;
        this.so_sv = so_sv;
    }

    public String getMa_dn() {
        return ma_dn;
    }

    public void setMa_dn(String ma_dn) {
        this.ma_dn = ma_dn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSo_sv() {
        return so_sv;
    }

    public void setSo_sv(int so_sv) {
        this.so_sv = so_sv;
    }

    public String toString(){
        return getMa_dn()+" "+getName()+" "+getSo_sv();
    }
}
