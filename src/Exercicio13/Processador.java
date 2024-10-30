package Exercicio13;

public class Processador {

    private String modelo;
    private double frequencia;

    public Processador(String modelo, double frequencia) {
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public String toString(){
        return "Modelo: " +getModelo() + "\nFrequencia: " + getFrequencia() + "hz";
    }
}
