package oop_sx_ds_mat_hang;

public class Danh_sach {
    private int stt;
    private String ten_mh, nhom_mh;
    private double gia_mua, gia_ban;

    public Danh_sach(){

    }

    public Danh_sach(int x, String ten_mh, String nhom_mh, double gia_mua, double gia_ban) {
        this.stt=x;
        this.ten_mh = ten_mh;
        this.nhom_mh = nhom_mh;
        this.gia_mua = gia_mua;
        this.gia_ban = gia_ban;
    }

    public String getLoi_nhuan(){
        double x=this.gia_ban-this.gia_mua;
        return String.format("%.2f", x);
    }

    @Override
    public String toString() {
        return stt + " " + ten_mh + " " +
                " " + nhom_mh + " " + getLoi_nhuan();
    }
}
