package Exercicio2;

import java.util.Scanner;

public class testeCarroConsumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CarroConsumo cc = new CarroConsumo();

        System.out.println("Modelo: ");
        cc.setModelo(sc.nextLine());

        System.out.println("Capacidade tanque: ");
        cc.setCapacidadeTanque(sc.nextInt());

        System.out.println("Consumo por km: ");
        cc.setConsumoPorKm(sc.nextInt());

        cc = new CarroConsumo(cc.getModelo(), cc.getCapacidadeTanque(), cc.getConsumoPorKm());

        System.out.println(cc);

        System.out.println("Novo consumo: ");
        int novoConsumo = sc.nextInt();
        cc.atualizarConsumo(novoConsumo);

        System.out.println(cc);

        sc.close();

    }
}
