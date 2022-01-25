package oop_phan_so;

import java.util.Scanner;

public class phan_so {
    private long x;
    private long y;
    private long gcd;

    public phan_so(){

    }

    public void nhap(Scanner sc){
        x=sc.nextLong();
        y=sc.nextLong();
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long getGcd(long a, long b) {
        long tmp;
        while (b!=0){
            tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }

    public void show(){
        System.out.println((getX()/getGcd(getX(), getY())) + "/" + (getY()/getGcd(getX(), getY())));
    }
}