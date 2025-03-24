package Thread.Interface_Runnable_thread;

public class Main {
    public static void main(String[] args) {
       MeuRunnable meuRunnable = new MeuRunnable();
       Thread thread = new Thread(meuRunnable);

       thread.start();
    }
}
