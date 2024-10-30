package Exercicio8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class testeAluguelCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AluguelCarro aluguelCarro = new AluguelCarro();

        System.out.print("Modelo: ");
        aluguelCarro.setModelo(sc.nextLine());

        System.out.print("Placa: ");
        aluguelCarro.setPlaca(sc.nextLine());

        AluguelCarro aluguelCarro2 = new AluguelCarro(aluguelCarro.getModelo(), aluguelCarro.getPlaca());

        System.out.print("Valor do aluguel: ");
        aluguelCarro.setValorAluguel(sc.nextDouble());

        System.out.println(aluguelCarro2);

        System.out.println();

        System.out.println("Digite quantos dias vai ficar com o carro: ");
        int diasVaiFicar = sc.nextInt();
        aluguelCarro.calcularValorAluguel(diasVaiFicar);

        System.out.println();

        System.out.println("Valor: ");
        System.out.println(aluguelCarro);

        sc.close();
    }
}
