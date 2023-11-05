
package gerenciamentobibliotecaapp;



public class Livro {
   private String titulo;
   private String autor;
   private String isbn;
   private boolean disponivel;

public Livro(String titulo, String autor, String isbn ) {
    this.titulo = titulo;
    this.autor = autor;
    this.isbn =isbn;
    this.disponivel = true;
} 
public void emprestar() {
    if (disponivel) {
        disponivel = false;
    } else {
        System.out.println("Livro já emprestado.");
    }
}
public void devolver() {
    if (!disponivel) {
        disponivel = true;
    } else {
        System.out.println("Livro já disponível.");
    }
}
public void editar(String novoTitulo, String novoAutor, String novoIsbn) {
    titulo = novoTitulo;
    autor = novoAutor;
    isbn = novoIsbn;
}
public String getTitulo() {
    return titulo;
}
public String getAutor() {
    return autor;
}
public String getIsbn() {
    return isbn;
}
public boolean isDisponivel() {
    return disponivel;
}
}
