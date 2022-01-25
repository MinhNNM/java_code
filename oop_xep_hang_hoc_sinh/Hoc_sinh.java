package oop_xep_hang_hoc_sinh;

public class Hoc_sinh {
    private String ma_hs;
    private String name;
    private double diem;
    public int stt;

    public Hoc_sinh(){

    }

    public Hoc_sinh(int x, String name, double diem){
        this.ma_hs="HS"+String.format("%02d", x);
        this.name=name;
        this.diem=diem;
    }

    public String getMa_hs() {
        return ma_hs;
    }

    public void setMa_hs(String ma_hs) {
        this.ma_hs = ma_hs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getLoai_hs(){
        if(getDiem()>=9)
            return "Gioi";
        else if(getDiem()>=7 && getDiem()<9)
            return "Kha";
        else if(getDiem()>=5 && getDiem()<7)
            return "Trung Binh";
        else
            return "Yeu";
    }

    public void show(){
        System.out.println(this.ma_hs+" "+getName()+" "+getDiem()+" "+getLoai_hs()+" "+this.stt);
    }
}
