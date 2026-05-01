import java.util.Objects;

public class Livro extends Item<String> implements Exibivel, Emprestavel{
    String autor;
    String titulo;
    int anoPublicado;
    boolean disponibilidade = true;
    final int isbn;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }


    public Livro(String autor,String titulo, int anoPublicado, int isbn) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicado = anoPublicado;
        this.isbn = isbn;
    }


    public void exibir(){
        System.out.println("Exibindo conteudo de "+nome +"autor "+autor);    };

    public void emprestar() {
        if (disponibilidade) {
        System.out.println("emprestado!");
        }else {
            System.out.println("Livro já com outro usuario no momento, aguarde até dia ....");
        }
        disponibilidade = false;
    };

    public void devolver(){
        System.out.println("Obrigado por devolver este livro!");
    };
    
    public boolean isEmprestado() {
        return disponibilidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return getIsbn() == livro.getIsbn();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getIsbn());
    }
}
