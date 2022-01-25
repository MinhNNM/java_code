package oop_diem_danh_2;

public class Diem_danh {
    private String ma_sv, name, lop;
    private int diem;
    public Diem_danh(){

    }

    public Diem_danh(String ma_sv, String name, String lop) {
        this.ma_sv = ma_sv;
        this.name = name;
        this.lop = lop;
    }

    public String getMa_sv() {
        return ma_sv;
    }

    public void setMa_sv(String ma_sv) {
        this.ma_sv = ma_sv;
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

    public void setDiem(int x){
        if(x<=0)
            this.diem=0;
        else
            this.diem=x;
    }

    public int getDiem(){
        return diem;
    }

    public String getGhi_chu(){
        if(getDiem()==0)
            return " KDDK";
        else
            return "";
    }

    public String toString(){
        return getMa_sv()+" "+getName()+" "+getLop()+" "+getDiem()+getGhi_chu();
    }
}
