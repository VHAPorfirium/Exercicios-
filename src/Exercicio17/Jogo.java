package Exercicio17;

public class Jogo extends Item {

    private int numeroJogadores;
    private String plataformas;

    public Jogo(String titulo, int ano, int tempoDuracao, String comentarios, int numeroJogadores, String plataformas) {
        super(titulo, ano, tempoDuracao, comentarios);
        this.numeroJogadores = numeroJogadores;
        this.plataformas = plataformas;
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }
    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public String getPlataformas() {
        return plataformas;
    }
    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public String plataformaJogo() {
        return plataformas;
    }

    public String toString() {
        return super.toString() + "\nDados especificos do jogo: " + "\nNumero de jogadore: " + numeroJogadores + "Plataforma: " + plataformaJogo();
    }
}
