package SOLID.Single_Responsibility_Principle;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNome("Anderson");
        usuario.setEmail("Ander@gmail.com");

        UsuarioValidador validator = new UsuarioValidador();
        if(validator.validar(usuario)){
            UsuarioRepository repository = new UsuarioRepository();
            repository.salvar(usuario);

            EmailService emailService = new EmailService();
            emailService.enviarEmail(usuario.getEmail());
        }
    }
}
