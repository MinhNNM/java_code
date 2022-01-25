package oop_hoa_don_nuoc;

public class Hoa_don {
    private String ma_kh, name;
    private int cs1, cs2;

    public Hoa_don(){

    }

    public Hoa_don(int x, String name, int cs1, int cs2){
        this.ma_kh="KH"+String.format("%02d", x);
        this.name=name;
        this.cs1=cs1;
        this.cs2=cs2;
    }

    public int getChi_so(){
        return cs2-cs1;
    }

    public String getTien(){
        int x=getChi_so();
        double y;
        if (x<=50)
            y=x*100*1.02;
        else if (x<=100)
            y=(50*100+(x-50)*150)*1.03;
        else
            y=(50*100+50*150+(x-100)*200)*1.05;
        return String.format("%.0f", y);
    }

    public String toString(){
        return this.ma_kh+" "+this.name+" "+getTien();
    }
}
