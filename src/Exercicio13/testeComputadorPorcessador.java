package Exercicio13;

import java.util.Scanner;

public class testeComputadorPorcessador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Frequencia: ");
        double frequencia = sc.nextDouble();

        Computador computador = new Computador(marca, new Processador(modelo, frequencia));

        System.out.println();

        System.out.println(computador);

        sc.close();
    }
}
