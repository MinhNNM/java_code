package oop_dua_xe_dap;

public class Dua_xe {
    private String name, don_vi, time;

    public Dua_xe(){

    }

    public Dua_xe(String name, String don_vi, String time) {
        this.name = name;
        this.don_vi = don_vi;
        this.time = time;
    }

    public String getMa(){
        String st1[]=this.don_vi.split(" ");
        String st2[]=this.name.split(" ");
        String s="";
        for (int i = 0; i < st1.length; i++) {
            s+=st1[i].charAt(0);
        }
        for (int i=0; i< st2.length; i++){
            s+=st2[i].charAt(0);
        }
        return s;
    }

    public double getTime() {
        String st1[] = this.time.split(":");
        int x = Integer.parseInt(st1[0]) - 6;
        int y = Integer.parseInt(st1[1]);
        double n = x + y / 60.0;
        return n;
    }

    public String getVan_toc(){
        return String.format("%.0f", 120/getTime());
    }

    public String toString(){
        return getMa()+" "+this.name+" "+this.don_vi+" "+getVan_toc()+" Km/h";
    }
}
