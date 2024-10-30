package Exercicio9;

import java.util.Scanner;

public class testePedidoVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PedidoVendas pv = new PedidoVendas();

        System.out.print("Numero do pedido: ");
        pv.setNumeroPedido(sc.nextInt());

        sc.nextLine();

        System.out.print("Data: ");
        pv.setData(sc.nextLine());

        System.out.print("Valor total: ");
        pv.setValorTotal(sc.nextDouble());

        System.out.println();

        PedidoVendas pv1 = new PedidoVendas(pv.getNumeroPedido(), pv.getData(), pv.getValorTotal());

        System.out.println(pv1);

        System.out.println();
        sc.nextLine();

        System.out.println("Pagamento no credito ou no debito? ");
        String op = sc.nextLine();

        if (op.equalsIgnoreCase("Debito")) {
            System.out.println();
            System.out.println("Ganhou 10% de desconto no pedido ");
            System.out.println("Valor atualizado: ");
            pv1.aplicarDesconto();
            System.out.println();

            System.out.println(pv1);
        }
        else {
            System.out.println();
            System.out.println("Valor nao alterado.");
            System.out.println(pv1);
        }

        sc.close();

    }
}
