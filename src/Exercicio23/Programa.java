package Exercicio23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Formato> formatos = new ArrayList<Formato>();

        System.out.println("Digite o numero de formatos: ");
        int numerosFormatos = sc.nextInt();

        for (int i=1; i<= numerosFormatos; i++) {
            System.out.println("Formato #" + i + ":");
            System.out.print("Retangulo ou Circulo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Cor (Preto/Azul/Vermelho): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r' || ch == 'R') {
                System.out.print("Largura: ");
                double Largura = sc.nextDouble();
                System.out.print("Altura: ");
                double Altura = sc.nextDouble();
                formatos.add(new Retangulo(color, Largura, Altura));
            }
            else {
                System.out.print("Raio: ");
                double Raio = sc.nextDouble();
                formatos.add(new Circulo(color, Raio));
            }
        }

        System.out.println();
        System.out.println("Formatos:");
        for (Formato formato : formatos) {
            System.out.println(String.format("%.2f", formato.area()));
        }

        sc.close();

    }
}
