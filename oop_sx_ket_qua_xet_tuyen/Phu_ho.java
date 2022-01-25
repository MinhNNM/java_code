package oop_sx_ket_qua_xet_tuyen;

public class Phu_ho {
    private String ma, name, age;
    private double diem1, diem2;

    public Phu_ho(){

    }

    public Phu_ho(int x, String name, String age, double diem1, double diem2){
        this.ma="PH"+String.format("%02d",x);
        this.name=name;
        this.age=age;
        this.diem1=diem1;
        this.diem2=diem2;
    }

    public int getTuoi(){
        int x=Integer.parseInt(this.age.substring(6));
        return 2021-x;
    }

    public double getDiem_thuong(){
        if (this.diem1>=8 && diem2>=8)
            return 1;
        else if (this.diem1>=7.5 && diem2>=7.5)
            return 0.5;
        else
            return 0;
    }

    public int getDiem(){
        double x=(diem1+diem2)/2+getDiem_thuong();
        int s=(int)(Math.round(x*1)/1);
        if(s>10)
            s=10;
        return s;
    }

    public String getXep_loai(){
        int x=getDiem();
        if (x<5)
            return "Truot";
        else if (x<=6)
            return "Trung binh";
        else if (x==7)
            return "Kha";
        else if (x==8)
            return "Gioi";
        else
            return "Xuat sac";
    }

    public String toString(){
        return this.ma+" "+this.name+" "+getTuoi()+" "+getDiem()+" "+getXep_loai();
    }
}
