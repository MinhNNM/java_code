package bai3;

import java.util.Date;

public class Thread1 extends Thread{
    Data d=new Data();
    public Thread1(Data d){
        this.d=d;
    }

    @Override
    public void run() {
        int so_hang=0;
        while(d.ischeck()){
            synchronized (d){
                Date date=new Date();
                int giay=date.getSeconds();
                so_hang+=1;
                d.setSo_hang(so_hang);
                if(giay%2==0){
                    System.out.println("San xuat tui");
                    d.setIndex(2);
                }
                else{
                    System.out.println("San xuat giay");
                    d.setIndex(3);
                }
                try {
                    sleep(1000);
                }catch (InterruptedException e){
                    System.out.println(e);
                }try {
                    d.wait();
                }catch (InterruptedException e){
                    System.out.println(e);
                }
                d.notifyAll();
            }
        }
    }
}
