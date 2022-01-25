package bai3;

public class Thread3 extends Thread{
    private Data d=new Data();
    public Thread3(Data d){
        this.d=d;
    }

    @Override
    public void run() {
        while(d.ischeck()){
            synchronized (d){
                while (d.getIndex()!=3 && d.ischeck()){
                    try {
                        d.wait();
                    }catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
                System.out.println("Ban doi giay gia 5k");
                d.setIndex(1);
                d.notifyAll();
            }
        }
    }
}
