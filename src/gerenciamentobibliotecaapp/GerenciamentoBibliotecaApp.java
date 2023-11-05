
package gerenciamentobibliotecaapp;


public class GerenciamentoBibliotecaApp {

    
    public static void main(String[] args) {
       Biblioteca biblioteca = new Biblioteca();
       
       Livro livro1 = new Livro("Java 101", "John Smith", "123456789");
       Livro livro2 = new Livro("Python Fundamentals", "Joe Doe", "987654321");
       
       biblioteca.adicionarLivro(livro1);
       biblioteca.adicionarLivro(livro2);
       
        System.out.println("Lista de Livros na Biblioteca: ");
        biblioteca.listarLivros();
        
        // Emprestimo de Livro
        Livro livroEmprestado = biblioteca.buscarLivro("123456789");
        if (livroEmprestado != null) {
            livroEmprestado.emprestar();
            System.out.println("Livro emprestado.");
        }
        
        // Devolução de Livro
        Livro livroDevolvido = biblioteca.buscarLivro("123456789");
        if (livroDevolvido != null) {
            livroDevolvido.devolver();
            System.out.println("Livro devolvido.");
        }
        
        System.out.println("Lista de Livros na Biblioteca após empréstimo e devolução:");
        biblioteca.listarLivros();
    }
    
}
