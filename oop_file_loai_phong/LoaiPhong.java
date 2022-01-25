package oop_file_loai_phong;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String id, loai_phong;
    private int don_gia;
    private double phi;

    public LoaiPhong(String s){
        String st[]=s.split(" ");
        this.id=st[0];
        this.loai_phong=st[1];
        this.don_gia=Integer.parseInt(st[2]);
        this.phi=Double.parseDouble(st[3]);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoai_phong() {
        return loai_phong;
    }

    public void setLoai_phong(String loai_phong) {
        this.loai_phong = loai_phong;
    }

    public int getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(int don_gia) {
        this.don_gia = don_gia;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public LoaiPhong() {
        super();
    }

    public int compareTo(LoaiPhong o){
        if(this.loai_phong.compareTo(o.loai_phong)>=0)
            return 1;
        return -1;
    }

    public String toString(){
        return getId()+" "+getLoai_phong()+" "+getDon_gia()+" "+getPhi();
    }
}
