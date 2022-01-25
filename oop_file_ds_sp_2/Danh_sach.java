package oop_file_ds_sp_2;

public class Danh_sach {
    private String ma, name;
    private int gia_ban, thoi_han;
    public Danh_sach(String ma, String name, int gia_ban, int thoi_han){
        this.ma=ma;
        this.name=name;
        this.gia_ban=gia_ban;
        this.thoi_han=thoi_han;
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

    public int getGia_ban() {
        return gia_ban;
    }

    public void setGia_ban(int gia_ban) {
        this.gia_ban = gia_ban;
    }

    public int getThoi_han() {
        return thoi_han;
    }

    public void setThoi_han(int thoi_han) {
        this.thoi_han = thoi_han;
    }

    public String toString(){
        return getMa()+" "+getName()+" "+getGia_ban()+" "+getThoi_han();
    }
}
