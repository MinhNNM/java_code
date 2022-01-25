package bai3;

public class Data {
    private int index, so_hang;
    public Data(){
        index=1;
        so_hang=0;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSo_hang() {
        return so_hang;
    }

    public void setSo_hang(int so_hang) {
        this.so_hang = so_hang;
    }
    public boolean ischeck(){
        return so_hang<=20;
    }
}
