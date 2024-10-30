package Exercicio17;

public class Filme extends Item{

    private String director;

    public Filme(String titulo, int ano, int tempoDuracao, String comentarios, String director) {
        super(titulo, ano, tempoDuracao, comentarios);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public String toString() {
        return super.toString() + "\nDados especificos do filme: " + "\nDiretor: " + director;
    }
}
