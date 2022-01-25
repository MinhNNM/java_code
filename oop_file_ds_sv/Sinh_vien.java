package oop_file_ds_sv;

public class Sinh_vien {
    private String ma, name, lop, email;
    public Sinh_vien(){

    }

    public Sinh_vien(String ma, String name, String lop, String email) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        String s="";
        name=name.trim().toLowerCase();
        name=name.replaceAll("\\s+", " ");
        String st[]=name.split(" ");
        for(int i=0; i<st.length; i++){
            s+=String.valueOf(st[i].charAt(0)).toUpperCase() + st[i].substring(1);
            if(i<st.length-1)
                s+=" ";
        }
        return s;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getMa()+" "+getName()+" "+getLop()+" "+getEmail();
    }
}
