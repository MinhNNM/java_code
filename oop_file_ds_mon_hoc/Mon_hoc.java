package oop_file_ds_mon_hoc;

public class Mon_hoc {
    private String ma, name;
    private int tin_chi;

    public Mon_hoc() {
    }

    public Mon_hoc(String ma, String name, int tin_chi) {
        this.ma = ma;
        this.name = name;
        this.tin_chi = tin_chi;
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

    public int getTin_chi() {
        return tin_chi;
    }

    public void setTin_chi(int tin_chi) {
        this.tin_chi = tin_chi;
    }

    @Override
    public String toString() {
        return getMa()+" "+getName()+" "+getTin_chi();
    }
}
