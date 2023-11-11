public class Livro {

    // ATRIBUTOS----------------------------------------------------------------------------
    private String titulo;
    private String autor;
    private String localizacao;

    // MÉTODOS------------------------------------------------------------------------------

    public void consultarLivro() {
        System.out.println("Livro: " + getTitulo() + ", autor: " + getAutor() + ", localizado: " + getLocalizacao());
    }

    public void emprestarLivro(String localizacao) {
        this.localizacao = localizacao;
    }

    public void devolverLivro() {
        this.localizacao = "Biblioteca";
    }

    // MÉTODO
    // CONSTRUTOR--------------------------------------------------------------------
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.localizacao = "Biblioteca";
    }

    // GETTERS AND
    // SETTERS------------------------------------------------------------------
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    // ToSTRING---------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Livro{" + "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", localizacao='" + localizacao + '\'' +
                '}';
    }
}