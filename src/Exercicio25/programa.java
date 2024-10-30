package Exercicio25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Produto> Lista = new ArrayList<>();

        System.out.println("Digite o caminho: ");
        String caminho = sc.nextLine();

        File arquivo = new File(caminho);
        String aquivoPasta = arquivo.getParent();

        boolean success = new File(aquivoPasta + "\\out").mkdir();

        String arquivoObjetivo = aquivoPasta + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);

                Lista.add(new Produto(nome, preco, quantidade));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoObjetivo))) {

                for (Produto item : Lista) {
                    bw.write(item.getNome() + "," + String.format("%.2f", item.valorTotal()));
                    bw.newLine();
                }

                System.out.println(arquivoObjetivo + " Criado com sucesso!");

            } catch (IOException e) {
                System.out.println("Erro na escrita do arquivo: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error na leitura do arquivo: " + e.getMessage());
        }

        sc.close();
    }
}


