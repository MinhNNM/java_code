package oop_file_ds_luu_tru;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Danh_sach {
    private String ma, name, ma_phong, ngay_den, ngay_di;

    public Danh_sach(int x, String name, String ma_phong, String ngay_den, String ngay_di){
        this.ma="KH"+String.format("%02d", x);
        this.name=name;
        this.ma_phong=ma_phong;
        this.ngay_den=ngay_den;
        this.ngay_di=ngay_di;
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

    public String getMa_phong() {
        return ma_phong;
    }

    public void setMa_phong(String ma_phong) {
        this.ma_phong = ma_phong;
    }

    public String getNgay_den() {
        return ngay_den;
    }

    public void setNgay_den(String ngay_den) {
        this.ngay_den = ngay_den;
    }

    public String getNgay_di() {
        return ngay_di;
    }

    public void setNgay_di(String ngay_di) {
        this.ngay_di = ngay_di;
    }

    public long getSo_ngay_o(){
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1=LocalDate.parse(getNgay_den(), f);
        LocalDate d2=LocalDate.parse(getNgay_di(), f);
        long so_ngay= ChronoUnit.DAYS.between(d1, d2);
        return so_ngay;
    }

    public String toString(){
        return getMa()+" "+getName()+" "+getMa_phong()+" "+getSo_ngay_o();
    }
}
