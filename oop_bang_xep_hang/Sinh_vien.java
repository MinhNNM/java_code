package oop_bang_xep_hang;

public class Sinh_vien {
    private String name;
    private long ac, tong;

    public Sinh_vien(){

    }

    public Sinh_vien(String name, long ac, long tong){
        this.name=name;
        this.ac=ac;
        this.tong=tong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAc() {
        return ac;
    }

    public void setAc(long ac) {
        this.ac = ac;
    }

    public long getTong() {
        return tong;
    }

    public void setTong(long tong) {
        this.tong = tong;
    }

    public String getTen(){
        String st[]=getName().split(" ");
        return st[st.length-1];
    }

    public String toString(){
        return (getName()+" "+getAc()+" "+getTong());
    }
}
