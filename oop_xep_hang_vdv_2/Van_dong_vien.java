package oop_xep_hang_vdv_2;

public class Van_dong_vien {
    private String ma;
    private String name;
    private String age;
    private String xuat_phat;
    private String den_dich;
    private int stt;

    public Van_dong_vien(){ }

    public Van_dong_vien(int x, String name, String age, String xuat_phat, String den_dich){
        this.ma="VDV"+String.format("%02d",x);
        this.name=name;
        this.age=age;
        this.xuat_phat=xuat_phat;
        this.den_dich=den_dich;
    }

    public void setHang(int x){
        this.stt=x;
    }

    public String getMa(){
        return this.ma;
    }

    public String getThanh_tich_thuc(){
        int a=0, b=0;
        String st1[]=this.xuat_phat.split(":");
        String st2[]=this.den_dich.split(":");
        a=Integer.parseInt(st2[2])-Integer.parseInt(st1[2]);
        if(a<0){
            a+=60;
            b=Integer.parseInt(st2[1])-Integer.parseInt(st1[1])-1;
        }
        else
            b=Integer.parseInt(st2[1])-Integer.parseInt(st1[1]);
        String s=String.valueOf(a);
        if(s.length()==1)
            s="0"+s;
        String s1=String.valueOf(b)+s;
        while(s1.length()<6)
            s1="0"+s1;
        s1=s1.substring(0,2)+":"+s1.substring(2,4)+":"+s1.substring(4);
        return s1;
    }

    public String getUu_tien(){
        int age1=2021-Integer.parseInt(this.age.substring(6));
        if (age1<18)
            return "00:00:00";
        else if(age1<25)
            return "00:00:01";
        else if(age1<32)
            return "00:00:02";
        else
            return "00:00:03";
    }

    public String getThanh_tich(){
        int x, age1=2021-Integer.parseInt(this.age.substring(6));
        if (age1<18)
            x=0;
        else if(age1<25)
            x=1;
        else if(age1<32)
            x=2;
        else
            x=3;
        int a=0, b=0;
        String st[]=getThanh_tich_thuc().split(":");
        a=Integer.parseInt(st[2])-x;
        if(a<0){
            a+=60;
            b=Integer.parseInt(st[1])-1;
        }
        else
            b=Integer.parseInt(st[1]);
        String s=String.valueOf(a);
        if(s.length()==1)
            s="0"+s;
        String s1=String.valueOf(b)+s;
        while(s1.length()<6)
            s1="0"+s1;
        s1=s1.substring(0,2)+":"+s1.substring(2,4)+":"+s1.substring(4);
        return s1;
    }

    public void show(){
        System.out.println(this.ma+" "+this.name+" "+getThanh_tich_thuc()
                +" "+getUu_tien()+" "+getThanh_tich()+" "+this.stt);
    }
}
