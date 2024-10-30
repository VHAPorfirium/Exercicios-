/*
### Exercício 2: Carro e Consumo OK/OK

**Descrição:**
Faça um programa para ler os dados de um carro (modelo, capacidade do tanque e consumo por km).
Em seguida, calcular e mostrar quantos km o carro pode percorrer com um tanque cheio.
Permitir atualizar o consumo do carro e recalcular a autonomia.

**UML:**
```
+---------------------------+
|           Carro           |
+---------------------------+
| - modelo: String          |
| - capacidadeTanque: double|
| - consumoPorKm: double    |
+---------------------------+
| + Carro(String, double, double) |
| + calcularAutonomia(): double    |
| + atualizarConsumo(double): void |
| + toString(): String             |
+----------------------------------+

*/
package Exercicio2;

public class CarroConsumo {

    private String modelo;
    private double capacidadeTanque;
    private double consumoPorKm;

    CarroConsumo() {

    }

    CarroConsumo(String modelo, double capacidade, double consumoPorKm) {
        this.modelo = modelo;
        this.capacidadeTanque = capacidade;
        this.consumoPorKm = consumoPorKm;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getConsumoPorKm() {
        return consumoPorKm;
    }
    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }

    public double calculoAutonomia(){
        return getCapacidadeTanque() * getConsumoPorKm();
    }

    public void atualizarConsumo(double novoConsumo){
       this.consumoPorKm = novoConsumo;
    }

    public String toString() {
        return "Modelo: " + this.modelo + "\nAutonomia: " + calculoAutonomia() + " km";
    }

}
