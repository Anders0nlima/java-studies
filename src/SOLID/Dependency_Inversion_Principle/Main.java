package SOLID.Dependency_Inversion_Principle;

public class Main {
    public static void main(String[] args) {
        Notificador emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);

        notificationService.enviarNotificacao("Olá, mundo!");
    }
}
