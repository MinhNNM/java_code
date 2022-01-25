package oop_sap_xep_bang_tinh_cong;

public class Tinh_cong {
    private String ma_nv;
    private String name;
    private int luong_cb;
    private int ngay_cong;
    private String chuc_vu;

    public Tinh_cong(int x, String name, int luong_cb, int ngay_cong, String chuc_vu){
        this.ma_nv="NV"+String.format("%02d", x);
        this.name=name;
        this.luong_cb=luong_cb;
        this.ngay_cong=ngay_cong;
        this.chuc_vu=chuc_vu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLuong_cb() {
        return luong_cb;
    }

    public void setLuong_cb(int luong_cb) {
        this.luong_cb = luong_cb;
    }

    public int getNgay_cong() {
        return ngay_cong;
    }

    public void setNgay_cong(int ngay_cong) {
        this.ngay_cong = ngay_cong;
    }

    public String getChuc_vu() {
        return chuc_vu;
    }

    public void setChuc_vu(String chuc_vu) {
        this.chuc_vu = chuc_vu;
    }

    public long getLuong(){
        return getLuong_cb()*getNgay_cong();
    }

    public long getThuong(){
        if(getNgay_cong()>=25)
            return getLuong()*20/100;
        else if(getNgay_cong()>=22)
            return getLuong()*10/100;
        else
            return 0;
    }

    public long getPhu_cap(){
        if(getChuc_vu().equals("GD"))
            return 250000;
        else if(getChuc_vu().equals("PGD"))
            return 200000;
        else if(getChuc_vu().equals("TP"))
            return 180000;
        else
            return 150000;
    }

    public long getThu_nhap(){
        return getLuong()+getPhu_cap()+getThuong();
    }

    public void show(){
        System.out.println(this.ma_nv+" "+getName()+" "+getLuong()+" "+getThuong()
                +" "+getPhu_cap()+" "+getThu_nhap());
    }
}
