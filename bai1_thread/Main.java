package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
        int x;
        while(sc.hasNext() && (x=sc.nextInt())!=0){
            if(x==1){
                t1.suspend();
            }
            if(x==2){
                t1.resume();
            }
        }
        t1.stop();
        t2.stop();
    }
}
