package oop_tinh_luong;

public class Phong {
    private String ma_phong, ten_phong;

    public Phong(String ma_phong, String ten_phong) {
        this.ma_phong = ma_phong;
        this.ten_phong = ten_phong;
    }

    public String getMa_phong() {
        return ma_phong;
    }

    public void setMa_phong(String ma_phong) {
        this.ma_phong = ma_phong;
    }

    public String getTen_phong() {
        return ten_phong;
    }

    public void setTen_phong(String ten_phong) {
        this.ten_phong = ten_phong;
    }
}
