package SOLID.Sistema_de_Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        biblioteca.adicionarLivro(new Livro("O Hobbit", "J.R.R Tolkien", true));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", true));
        biblioteca.adicionarUsuario(new Usuario("Anderson"));
        biblioteca.adicionarUsuario(new Usuario("Pedro"));

        while (true) {
            System.out.println("1. Alugar livro");
            System.out.println("2. Devolver livro");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do usuario: ");
                String nomeUsuario = scanner.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);

                if (usuario != null) {
                    System.out.println("Digite o titulo do livro: ");
                    String tituloLivro = scanner.nextLine();
                    Livro livro = biblioteca.buscarLivro(tituloLivro);

                    if (livro != null) {
                        usuario.alugarLivro(livro);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                } else {
                    System.out.println("Usuário não encontrado.");
                }

            } else if (opcao == 2) {
                System.out.println("Digite o nome do usuario: ");
                String nomeUsuario = scanner.nextLine(); // Corrigido nome da variável
                Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);

                if (usuario != null) {
                    usuario.devolverLivro();
                } else {
                    System.out.println("Usuário não encontrado.");
                }

            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida."); // Agora funciona corretamente
            }
        }
        scanner.close();
    }
}
