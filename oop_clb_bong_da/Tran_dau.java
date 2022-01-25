package oop_clb_bong_da;

public class Tran_dau {
    private Bong_da x;
    private String name;
    private int so_cdv;

    public Tran_dau(){

    }

    public Tran_dau(String name, int so_cdv, Bong_da x){
        this.name=name;
        this.so_cdv=so_cdv;
        this.x=x;
    }

    public String getName() {
        return name;
    }

    public int getSo_cdv() {
        return so_cdv;
    }

    public long getDoanh_thu(){
        return x.getGia()*getSo_cdv();
    }

    public String toString(){
        return this.name+" "+x.getName()+" "+getDoanh_thu();
    }
}
