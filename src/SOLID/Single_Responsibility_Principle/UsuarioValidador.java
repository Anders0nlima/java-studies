package SOLID.Single_Responsibility_Principle;

public class UsuarioValidador {
    public boolean validar(Usuario usuario) {
        return usuario.getNome() != null && usuario.getEmail() != null;
    }
}
