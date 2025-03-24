package Thread.excecoes;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            throw new RuntimeException("Erro na thread!");
        });

        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("Exceção capturada na thread " + t.getName() + ": " + e.getMessage());
        });

        thread.start();
    }
}
