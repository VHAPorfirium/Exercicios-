package Exercicio23;

public class Circulo extends Formato {

    private Double raio;

    public Circulo(Color color, Double raio) {
        super(color);
        this.raio = raio;

    }

    public Double getRaio() {
        return raio;
    }
    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area(){
        return Math.PI * Math.pow(raio, 2);
    }
}
