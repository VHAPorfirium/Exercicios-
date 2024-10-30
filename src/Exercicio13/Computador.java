package Exercicio13;

public class Computador {

    private String marca;
    private Processador processador;

    public Computador(String marca, Processador processador) {
        this.marca = marca;
        this.processador = processador;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Processador getProcessador() {
        return processador;
    }
    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public String toString(){
        return "Marca: " + getMarca() + "\nProcessador: " + processador.toString();
    }
}
