
package gerenciamentobibliotecaapp;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<String, Livro> livros;
    
    public Biblioteca() {
        livros = new HashMap<>();
    }
    public boolean adicionarLivro(Livro livro) {
        if (!livros.containsKey(livro.getIsbn())) {
            livros.put(livro.getIsbn(), livro);
            return true;
        }
        return false;
    }
    public Livro buscarLivro(String isbn) {
        return livros.get(isbn);
    }
    public void listarLivros() {
        for (Livro livro : livros.values()) {
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("ISBN: " + livro.getIsbn());
            System.out.println("Disponível: " + livro.isDisponivel());
            System.out.println();
        }
    }
    
}
