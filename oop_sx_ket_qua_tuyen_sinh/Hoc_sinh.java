package oop_sx_ket_qua_tuyen_sinh;

import java.text.DecimalFormat;

public class Hoc_sinh {
    private String ma_hs;
    private String name;
    private double diem_toan;
    private double diem_ly;
    private double diem_hoa;

    public Hoc_sinh(){

    }

    public Hoc_sinh(String ma_hs, String name, double diem_toan, double diem_ly, double diem_hoa){
        this.ma_hs=ma_hs;
        this.name=name;
        this.diem_toan=diem_toan;
        this.diem_ly=diem_ly;
        this.diem_hoa=diem_hoa;
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

    public double getDiem_toan() {
        return diem_toan;
    }

    public void setDiem_toan(double diem_toan) {
        this.diem_toan = diem_toan;
    }

    public double getDiem_ly() {
        return diem_ly;
    }

    public void setDiem_ly(double diem_ly) {
        this.diem_ly = diem_ly;
    }

    public double getDiem_hoa() {
        return diem_hoa;
    }

    public void setDiem_hoa(double diem_hoa) {
        this.diem_hoa = diem_hoa;
    }

    public String getDiem(){
        DecimalFormat Format=new DecimalFormat("#.#");
        double diem=getDiem_toan()*2+getDiem_ly()+getDiem_hoa();
        return Format.format(diem);
    }

    public String getUu_tien(){
        DecimalFormat Format=new DecimalFormat("#.#");
        if (getMa_hs().contains("KV1"))
            return Format.format(0.5);
        else if(getMa_hs().contains("KV2"))
            return Format.format(1.0);
        else
            return Format.format(2.5);
    }

    public String getTrang_thai(){
        if(Double.parseDouble(getDiem())+Double.parseDouble(getUu_tien())>=24)
            return "TRUNG TUYEN";
        else
            return "TRUOT";
    }

    public double getDiem_xt(){
        return Double.parseDouble(getDiem())+Double.parseDouble(getUu_tien());
    }

    public void show(){
        DecimalFormat Format=new DecimalFormat("#.#");
        System.out.println(getMa_hs()+" "+getName()+" "+getUu_tien()
                +" "+Format.format(getDiem_xt())+" "+getTrang_thai());
    }
}
