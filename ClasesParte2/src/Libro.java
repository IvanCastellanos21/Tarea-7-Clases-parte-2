public class Libro {
    private int NumeroPaginas;
    private String titulo;
    private String lenguaje;

    public Libro(int numeroPaginas, String titulo, String lenguaje) {
        NumeroPaginas = numeroPaginas;
        this.titulo = titulo;
        this.lenguaje = lenguaje;
    }

    public Libro(int numeroPaginas, String titulo) {
        NumeroPaginas = numeroPaginas;
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        NumeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "NumeroPaginas=" + NumeroPaginas +
                ", titulo='" + titulo + '\'' +
                ", lenguaje='" + lenguaje + '\'' +
                '}';
    }

    public void abrir(){
        System.out.println("Ha abierto el libro");
    }
    public void cerrar(){
        System.out.println("Ha cerrado el libro");
    }
}
