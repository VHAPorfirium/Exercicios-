package Exercicio12;

import java.util.Scanner;

public class testeCarroMotor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Potência: ");
        int potencia = sc.nextInt();

        sc.nextLine();

        System.out.print("Combustivel: ");
        String combustivel = sc.nextLine();

        Carro carro = new Carro(modelo, new Motor(potencia, combustivel));

        System.out.println(carro);

        sc.close();
    }
}
