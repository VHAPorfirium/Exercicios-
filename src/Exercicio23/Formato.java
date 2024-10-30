package Exercicio23;

public abstract class Formato {

    private Color color;

    public Formato(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public abstract Double area();

}
