package bai1;

public class Thread2 extends Thread{
    private boolean running;
    public Thread2(){
        running=true;
    }

    @Override
    public void run() {
        while(running){
            System.out.println("\33[37mthoc thoc an an");
            try {
                sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
