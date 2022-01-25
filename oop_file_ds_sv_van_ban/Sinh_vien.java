package oop_file_ds_sv_van_ban;

public class Sinh_vien {
    private String ma, name;
    private String lop;
    private String age;
    private float diem;

    public Sinh_vien(int x, String name, String lop, String age, float diem) {
        this.ma="B20DCCN"+String.format("%03d",x);
        this.name = name;
        this.lop = lop;
        this.age = age;
        this.diem = diem;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getAge() {
        String s = "";
        String s1[] = age.split("/");
        for (String i : s1) {
            if (i.length() == 1)
                s += "0" + i + "/";
            else
                s += i + "/";
        }
        return s.substring(0, s.length() - 1);
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getDiem() { return String.format("%.2f", diem); }

    public String toString() {
        return getMa() + " " + getName() + " " + getLop() + " " + getAge() + " " + getDiem();
    }
}

