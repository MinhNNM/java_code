package oop_tim_kiem_gv;

public class giang_vien {
    private String ma_gv="GV";
    private String name;
    private String bo_mon;

    public giang_vien(String name, String bo_mon){
        this.name=name;
        this.bo_mon=bo_mon;
    }

    public String getMa_gv(int i) {
        if(i<10)
            return (ma_gv + "0" + i);
        else
            return (ma_gv + i);
    }

    public void setMa_gv(String ma_gv) {
        this.ma_gv = ma_gv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBo_mon() {
        String st[]=bo_mon.split(" ");
        String s="";
        for (String i:st) {
            s+=String.valueOf(i.charAt(0)).toUpperCase();
        }
        return s;
    }

    public void setBo_mon(String bo_mon) {
        this.bo_mon = bo_mon;
    }

    public String show(int i){
        return (getMa_gv(i) + " " + getName() + " " + getBo_mon());
    }
}
