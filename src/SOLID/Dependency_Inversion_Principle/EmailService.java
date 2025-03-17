package SOLID.Dependency_Inversion_Principle;

public class EmailService implements Notificador{
    @Override
    public void enviar(String mensagem){
        System.out.println("E-mail enviado: " + mensagem);
    }
}
