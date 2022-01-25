package oop_nhap_xuat_hang;

public class Hang_hoa {
    private String ma, name, loai;

    public Hang_hoa(String ma, String name, String loai) {
        this.ma = ma;
        this.name = name;
        this.loai = loai;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getLai(){
        if(getLoai().equalsIgnoreCase("A"))
            return 0.08;
        else if(getLoai().equalsIgnoreCase("B"))
            return 0.05;
        else
            return 0.02;
    }
}
