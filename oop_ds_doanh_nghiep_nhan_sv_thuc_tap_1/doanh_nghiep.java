package oop_ds_doanh_nghiep_nhan_sv_thuc_tap_1;

import java.util.Scanner;

public class doanh_nghiep {
    private String ma_dn;
    private String name;
    private int so_sv;

    public doanh_nghiep(){

    }

    public void nhap(Scanner sc){
        ma_dn=sc.next();
        sc.nextLine();
        name=sc.nextLine();
        so_sv=sc.nextInt();
    }

    public String getMa_dn() {
        return ma_dn;
    }

    public String getName() {
        return name;
    }

    public int getSo_sv() {
        return so_sv;
    }

    public String show(){
        String s=getMa_dn()+" "+getName()+" "+getSo_sv();
        return s;
    }
}
