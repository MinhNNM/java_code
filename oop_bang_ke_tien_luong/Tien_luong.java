package oop_bang_ke_tien_luong;

public class Tien_luong {
    private String ma_nv;
    private String name;
    private int luong_ngay;
    private int ngay_cong;
    private String chuc_vu;

    public Tien_luong(int x, String name, int luong_ngay, int ngay_cong, String chuc_vu){
        this.ma_nv="NV"+String.format("%02d", x);
        this.name=name;
        this.luong_ngay=luong_ngay;
        this.ngay_cong=ngay_cong;
        this.chuc_vu=chuc_vu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLuong_thang(){
        return this.luong_ngay*this.ngay_cong;
    }

    public long getThuong(){
        if(this.ngay_cong>=25)
            return getLuong_thang()*20/100;
        else if(this.ngay_cong>=22)
            return getLuong_thang()*10/100;
        else
            return 0;
    }

    public long getPhu_cap(){
        if(this.chuc_vu.equals("GD"))
            return 250000;
        else if(this.chuc_vu.equals("PGD"))
            return 200000;
        else if(this.chuc_vu.equals("TP"))
            return 180000;
       else
            return 150000;
    }

    public long getTien_linh(){
        return getLuong_thang()+getPhu_cap()+getThuong();
    }

    public void show(){
        System.out.println(this.ma_nv+" "+getName()+" "+getLuong_thang()
                +" "+getThuong()+" "+getPhu_cap()+" "+getTien_linh());
    }
}
