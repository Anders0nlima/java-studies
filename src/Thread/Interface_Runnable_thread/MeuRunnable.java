package Thread.Interface_Runnable_thread;

public class MeuRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable em execução: " + i);
            try {
                Thread.sleep(1000); // Pausa a thread por 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Runnable interrompido!");
            }
        }
    }
}
