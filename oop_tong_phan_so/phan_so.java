package oop_tong_phan_so;

import java.util.Scanner;

public class phan_so {
    private long ts_1;
    private long ms_1;
    private long ts_2;
    private long ms_2;

    public phan_so(){

    }

    public void nhap(Scanner sc){
        ts_1=sc.nextLong();
        ms_1=sc.nextLong();
        ts_2=sc.nextLong();
        ms_2=sc.nextLong();
    }

    public long getGcd(long a, long b) {
        while (b!=0){
            long tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }

    public void show() {
        long tu_so1=ts_1/getGcd(ts_1, ms_1)*ms_2/getGcd(ts_2, ms_2);
        long tu_so2=ts_2/getGcd(ts_2, ms_2)*ms_1/getGcd(ts_1, ms_1);
        long tu_so=tu_so1+tu_so2;
        long mau_so=ms_1/getGcd(ts_1, ms_1)*ms_2/getGcd(ts_2, ms_2);
        long gcd=getGcd(tu_so, mau_so);
        System.out.println(tu_so/gcd + "/" + mau_so/gcd);
    }
}
