package oop_tuyen_gv;

public class Giang_vien {
    private String ma_gv, name, ma;
    private double diem1, diem2;

    public Giang_vien(){

    }

    public Giang_vien(int x, String name, String ma, double diem1, double diem2) {
        this.ma_gv = "GV"+String.format("%02d", x);
        this.name = name;
        this.ma = ma;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public String getMa_gv(){
        return this.ma_gv;
    }

    public String getMon_hoc(){
        String x=this.ma.substring(0,1);
        if (x.equals("A"))
            return "TOAN";
        else  if(x.equals("B"))
            return "LY";
        else
            return "HOA";
    }

    public String getDiem(){
        double x=diem1*2+diem2;
        String y=this.ma.substring(1);
        if (y.equals("1"))
            return String.format("%.1f", x+2.0);
        else if (y.equals("2"))
            return String.format("%.1f", x+1.5);
        else if (y.equals("3"))
            return String.format("%.1f", x+1.0);
        else
            return String.format("%.1f", x);
    }

    public String getXep_loai(){
        double x=Double.parseDouble(getDiem());
        if (x>=18)
            return "TRUNG TUYEN";
        else
            return "LOAI";
    }

    public String toString(){
        return this.ma_gv+" "+this.name+" "+getMon_hoc()+" "+getDiem()+" "+getXep_loai();
    }
}
