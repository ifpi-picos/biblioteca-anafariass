import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso: " + livro.getTitulo());
    }

    public void listarLivros() {
        System.out.println("Lista de Livros:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void listarLivrosEmprestadosEDisponiveis() {
        System.out.println("Livros Emprestados:");
        for (Livro livro : livros) {
            if (livro.isEmprestado()) {
                System.out.println(livro);
            }
        }
        System.out.println("\nLivros Disponíveis:");
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                System.out.println(livro);
            }
        }
    }

    public void listarHistoricoEmprestimos(Usuario usuario) {
        System.out.println("Histórico de Empréstimos para o usuário: " + usuario.getNome());
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getUsuario() != null && emprestimo.getUsuario().equals(usuario)) {
                System.out.println(emprestimo);
            }
        }
    }


    public void pegarLivroEmprestado(Usuario usuario, Livro livro) {
        if (!livro.isEmprestado()) {
            livro.setEmprestado(true);
            Emprestimo emprestimo = new Emprestimo(usuario, livro, LocalDate.now(), LocalDate.now().plusDays(14));
            emprestimos.add(emprestimo);
            System.out.println("Livro emprestado com sucesso: " + livro.getTitulo());
        } else {
            System.out.println("O livro já está emprestado: " + livro.getTitulo());
        }
    }
    public void devolverLivro(Livro livro) {
        if (livro.isEmprestado()) {
            livro.setEmprestado(false);
            System.out.println("Livro devolvido com sucesso: " + livro.getTitulo());
        } else {
            System.out.println("Este livro não está emprestado.");

        }}
}
