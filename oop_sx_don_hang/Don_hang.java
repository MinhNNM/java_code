package oop_sx_don_hang;

public class Don_hang {
    private String ten_hang;
    private String ma_hang;
    private long gia;
    private int so_luong;

    public Don_hang(String ten_hang, String ma_hang, long gia, int so_luong){
        this.ten_hang=ten_hang;
        this.ma_hang=ma_hang;
        this.gia=gia;
        this.so_luong=so_luong;
    }

    public String getTen_hang() {
        return ten_hang;
    }

    public void setTen_hang(String ten_hang) {
        this.ten_hang = ten_hang;
    }

    public String getMa_hang() {
        return ma_hang;
    }

    public void setMa_hang(String ma_hang) {
        this.ma_hang = ma_hang;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public String get_stt(){
        return getMa_hang().substring(1, 4);
    }

    public long getGiam_gia(){
        int x=getMa_hang().length();
        if(getMa_hang().substring(x-1).equals("1"))
            return getGia()*50/100*getSo_luong();
        else
            return getGia()*30/100*getSo_luong();
    }

    public long getTien(){
        return getGia()*getSo_luong()-getGiam_gia();
    }

    public void show(){
        System.out.println(getTen_hang()+" "+getMa_hang()+" "+get_stt()
                +" "+getGiam_gia()+" "+getTien());
    }
}
