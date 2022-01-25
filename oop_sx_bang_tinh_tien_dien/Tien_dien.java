package oop_sx_bang_tinh_tien_dien;

public class Tien_dien {
    private String ma_kh;
    private String loai_kh;
    private int so_cu;
    private int so_moi;

    public Tien_dien(int x, String loai_kh, int so_cu, int so_moi){
        this.ma_kh="KH"+String.format("%02d", x);
        this.loai_kh=loai_kh;
        this.so_cu=so_cu;
        this.so_moi=so_moi;
    }

    public void setMa_kh(String ma_kh) {
        this.ma_kh = ma_kh;
    }

    public String getMa_kh(){
        return this.ma_kh;
    }

    public String getLoai_kh() {
        return loai_kh;
    }

    public void setLoai_kh(String loai_kh) {
        this.loai_kh = loai_kh;
    }

    public int getSo_cu() {
        return so_cu;
    }

    public void setSo_cu(int so_cu) {
        this.so_cu = so_cu;
    }

    public int getSo_moi() {
        return so_moi;
    }

    public void setSo_moi(int so_moi) {
        this.so_moi = so_moi;
    }

    public int getHe_so(){
        if(getLoai_kh().equals("KD"))
            return 3;
        else if(getLoai_kh().equals("NN"))
            return 5;
        else if(getLoai_kh().equals("TT"))
            return 4;
        else
            return 2;
    }

    public long getTien(){
        return (getSo_moi()-getSo_cu())*getHe_so()*550;
    }

    public long getPhu_troi(){
        if(getSo_moi()-getSo_cu()<50)
            return 0;
        else if(getSo_moi()-getSo_cu()>=50 && getSo_moi()-getSo_cu()<=100)
            return Math.round((double)getTien()*35/100*1)/1;
        else
            return Math.round((double)getTien()*100/100*1)/1;
    }

    public long getTong(){
        return getTien()+getPhu_troi();
    }

    public void show(){
        System.out.println(getMa_kh()+" "+getHe_so()+" "+getTien()+" "
                +getPhu_troi()+" "+getTong());
    }
}
