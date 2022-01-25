package oop_lk_nhap_hang_theo_nhom;

public class San_pham {
    private String ma;
    private long so_luong;

    public San_pham(){

    }

    public San_pham(String ma, long so_luong){
        this.ma=ma;
        this.so_luong=so_luong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public long getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(long so_luong) {
        this.so_luong = so_luong;
    }

    public long getSo_luong_xuat(){
        if(getMa().substring(0,1).compareTo("A")==0)
            return Math.round((double)getSo_luong()*60/100*1)/1;
        else
            return Math.round((double)getSo_luong()*70/100*1)/1;
    }

    public long getDon_gia(){
        if(getMa().substring(getMa().length()-1).compareTo("Y")==0)
            return 110000;
        else
            return 135000;
    }

    public long getTien(){
        return getSo_luong_xuat()*getDon_gia();
    }

    public long getThue(){
        if(getMa().substring(0, 1).compareTo("A")==0 && getMa().substring(getMa().length()-1).compareTo("Y")==0)
            return (getTien()*8)/100;
        else if(getMa().substring(0, 1).compareTo("A")==0 && getMa().substring(getMa().length()-1).compareTo("N")==0)
            return (getTien()*11)/100;
        else if(getMa().substring(0, 1).compareTo("B")==0 && getMa().substring(getMa().length()-1).compareTo("Y")==0)
            return (getTien()*17)/100;
        else
            return (getTien()*22)/100;
    }

    public void show(){
        System.out.println(getMa()+" "+getSo_luong()+" "+getSo_luong_xuat()+" "
                +getDon_gia()+" "+getTien()+" "+getThue());
    }
}
