import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Usuario usuario1 = new Usuario("Maria Silva", "12345678900","maria@gmail.com" );

        Usuario usuario2 = new Usuario("João Souza","98765432100","joao@gmail.com");

        Usuario usuario3 = new Usuario("João","98765432800","joaobosco@gmail.com");

        Livro livro1 = new Livro();
        livro1.setTitulo("Scar Tissue");
        livro1.setAutor("Antony Kiedis");
        livro1.setEdicao("1ª");
        livro1.setAno(2004);

        Livro livro2 = new Livro();
        livro2.setTitulo("1984");
        livro2.setAutor("George Orwell");
        livro2.setEdicao("2ª");
        livro2.setAno(1949);

        Livro livro3 = new Livro();
        livro3.setTitulo("Dom Casmurro");
        livro3.setAutor("Machado de Assis");
        livro3.setEdicao("3ª");
        livro3.setAno(1899);


        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);
        biblioteca.cadastrarLivro(livro3);

        biblioteca.listarLivros();


        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n - Menu Biblioteca - ");
            System.out.println("1. Listar todos os livros");
            System.out.println("2. Listar livros emprestados e disponíveis");
            System.out.println("3. Pegar livro emprestado");
            System.out.println("4. Devolver livro");
            System.out.println("5. Listar histórico de empréstimos do usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    biblioteca.listarLivros();
                    break;
                case 2:
                    biblioteca.listarLivrosEmprestadosEDisponiveis();
                    break;
                case 3:
                    System.out.println("Informe o título do livro para emprestar:");
                    scanner.nextLine();
                    String tituloEmprestar = scanner.nextLine();
                    if (tituloEmprestar.equalsIgnoreCase(livro1.getTitulo())) {
                        biblioteca.pegarLivroEmprestado(usuario1, livro1);
                    } else if (tituloEmprestar.equalsIgnoreCase(livro2.getTitulo())) {
                        biblioteca.pegarLivroEmprestado(usuario2, livro2);
                    } else if (tituloEmprestar.equalsIgnoreCase(livro3.getTitulo())) {
                        biblioteca.pegarLivroEmprestado(usuario3, livro3);
                    }
                    else {
                        System.out.println("Esse livro não foi encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Informe o título do livro para devolver:");
                    scanner.nextLine();
                    String tituloDevolver = scanner.nextLine();
                    if (tituloDevolver.equalsIgnoreCase(livro1.getTitulo())) {
                        biblioteca.devolverLivro(livro1);
                    } else if (tituloDevolver.equalsIgnoreCase(livro2.getTitulo())) {
                        biblioteca.devolverLivro(livro2);
                    } else if (tituloDevolver.equalsIgnoreCase(livro3.getTitulo())) {
                        biblioteca.devolverLivro(livro3);
                    }
                    else {
                        System.out.println("Livro não encontrado!");
                    }
                    break;
                case 5:
                    System.out.println("Informe o CPF do usuário:");
                    scanner.nextLine();
                    String cpf = scanner.nextLine();
                    if (cpf.equals(usuario1.getCpf())) {
                        biblioteca.listarHistoricoEmprestimos(usuario1);
                    } else if (cpf.equals(usuario2.getCpf())) {
                        biblioteca.listarHistoricoEmprestimos(usuario2);
                    } else {
                        System.out.println("Usuário não encontrado!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistemaa, bye...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
