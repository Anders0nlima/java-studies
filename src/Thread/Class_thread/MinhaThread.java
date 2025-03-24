package Thread.Class_thread;

public class MinhaThread extends Thread{
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Thread em execução " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Thread interrompida!");
            }
        }
    }
}
