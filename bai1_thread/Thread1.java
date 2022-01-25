package bai1;

public class Thread1 extends Thread{
    private boolean running;
    public Thread1(){
        running=true;
    }
    @Override
    public void run() {
        while (running){
            System.out.println("\33[33mVANG");
            System.out.println("\33[31mDO");
            try {
                sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
