package oop_hoa_khach_san;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Hoa_don {
    private String ma_kh, name, ngay_nhan, ngay_tra, so_phong;
    private int tien_dv;

    public Hoa_don(){

    }

    public Hoa_don(int x, String name, String so_phong, String ngay_nhan, String ngay_tra, int tien_dv) {
        this.ma_kh = "KH"+String.format("%02d", x);
        this.name = name;
        this.so_phong = so_phong;
        this.ngay_nhan = ngay_nhan;
        this.ngay_tra = ngay_tra;
        this.tien_dv = tien_dv;
    }

    public int getSo_ngay(){
        String x=this.ngay_nhan, y=this.ngay_tra;
        DateTimeFormatter Formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1=LocalDate.parse(x, Formatter);
        LocalDate date2=LocalDate.parse(y, Formatter);
        int so_ngay= (int)(ChronoUnit.DAYS.between(date1, date2)+1);
        return so_ngay;
    }

    public int getTien(){
        int x;
        if (this.so_phong.charAt(0)=='1')
            x=25;
        else if (this.so_phong.charAt(0)=='2')
            x=34;
        else if (this.so_phong.charAt(0)=='3')
            x=50;
        else
            x=80;
        return x*getSo_ngay()+this.tien_dv;
    }

    public String toString(){
        return (this.ma_kh+" "+this.name+" "+this.so_phong+" "+getSo_ngay()+" "+getTien());
    }
}
