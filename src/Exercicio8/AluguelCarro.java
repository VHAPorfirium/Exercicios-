/*
### Exercício 8: Aluguel de Carros OK/OK

**Descrição:**
Faça um programa para gerenciar o aluguel de carros.
Leia os dados de um carro (modelo, placa, valor diário do aluguel).
Em seguida, mostrar os dados do carro. Permitir calcular o valor total do aluguel baseado em uma quantidade de dias e mostrar novamente os dados do carro.

**UML:**
```
+-----------------------------+
|            Carro            |
+-----------------------------+
| - modelo: String            |
| - placa: String             |
| - valorDiarioAluguel: double|
+-----------------------------+
| + Carro(String, String, double) |
| + calcularValorAluguel(int): double |
| + toString(): String              |
+-----------------------------------+
```
 */
package Exercicio8;

public class AluguelCarro {

    private String Modelo;
    private String placa;
    private double valorAluguel;

    public AluguelCarro() {

    }
    public AluguelCarro(String Modelo, String placa, double valorAluguel) {
        this.Modelo = Modelo;
        this.placa = placa;
        this.valorAluguel = valorAluguel;
    }

    public AluguelCarro(String Modelo, String placa) {
        this.Modelo = Modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void calcularValorAluguel(int dias) {
        this.valorAluguel = valorAluguel * dias;
    }

    @Override
    public String toString() {
        return "Modelo: " + getModelo() + "\nPlaca: " + getPlaca() + "\nValor: R$ " + getValorAluguel() + " Reais";
    }
}
