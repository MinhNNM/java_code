package bai3;

public class Thread2 extends Thread{
    private Data d=new Data();
    public Thread2(Data d){
        this.d=d;
    }

    @Override
    public void run() {
        while(d.ischeck()){
            synchronized (d){
                while(d.getIndex()!=2 && d.ischeck()){
                    try {
                        d.wait();
                    }catch (InterruptedException e){
                        System.out.println(e);
                    }
                }
                System.out.println("Ban tui gia 10k");
                d.setIndex(1);
                d.notifyAll();
            }
        }
    }
}
