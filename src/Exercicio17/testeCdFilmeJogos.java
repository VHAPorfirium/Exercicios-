package Exercicio17;

import java.util.Scanner;

public class testeCdFilmeJogos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos itens quer cadastrar: ");
        int quantidadeItens = sc.nextInt();

        // SuperClasse Item:
        String[] titulo = new String[quantidadeItens];
        int[] ano = new int[quantidadeItens];
        int[] tempoDuracao = new int[quantidadeItens];
        String[] comentarios = new String[quantidadeItens];

        // SubClasse CD:
        String[] artista = new String[quantidadeItens];
        int[] quantidadeFaixas = new int[quantidadeItens];
        CD[] cds = new CD[quantidadeItens];

        // Subclasse Filme:
        String[] diretor = new String[quantidadeItens];
        Filme[] filmes = new Filme[quantidadeItens];

        // SubClasse Jogo:
        int[] numeroJogadores = new int[quantidadeItens];
        String[] plataforma = new String[quantidadeItens];
        Jogo[] jogos = new Jogo[quantidadeItens];

        sc.nextLine(); //Limpar buffer

        System.out.print("Deseja começar a cadastrar? (sim/não) ");
        String resposta = sc.nextLine();

        int totalCds = 0;
        int totalFilmes = 0;
        int totalJogos = 0;

        while (resposta.equalsIgnoreCase("sim")) {
            System.out.println();
            System.out.println("Deseja cadastrar qual primeiro: ");
            System.out.println("1- CD");
            System.out.println("2- Filme");
            System.out.println("3- Jogos");
            int resposta1 = sc.nextInt();

            if (resposta1 == 1 && totalCds < quantidadeItens) {
                sc.nextLine();
                System.out.println("CD " + (totalCds + 1) + ":");
                System.out.print("Título: ");
                titulo[totalCds] = sc.nextLine();
                System.out.print("Ano do CD: ");
                ano[totalCds] = sc.nextInt();
                System.out.print("Tempo de duração do CD (em minutos): ");
                tempoDuracao[totalCds] = sc.nextInt();
                sc.nextLine();  // Limpar buffer
                System.out.print("Comentário: ");
                comentarios[totalCds] = sc.nextLine();
                System.out.print("Artista: ");
                artista[totalCds] = sc.nextLine();
                System.out.print("Quantidade de faixas: ");
                quantidadeFaixas[totalCds] = sc.nextInt();

                cds[totalCds] = new CD(titulo[totalCds], ano[totalCds], tempoDuracao[totalCds], comentarios[totalCds], artista[totalCds], quantidadeFaixas[totalCds]);
                totalCds++;
            } else if (resposta1 == 2 && totalFilmes < quantidadeItens) {
                sc.nextLine();
                System.out.println("Filme " + (totalFilmes + 1) + ":");
                System.out.print("Título: ");
                titulo[totalFilmes] = sc.nextLine();
                System.out.print("Ano do Filme: ");
                ano[totalFilmes] = sc.nextInt();
                System.out.print("Tempo de duração do Filme (em minutos): ");
                tempoDuracao[totalFilmes] = sc.nextInt();
                sc.nextLine();  // Limpar buffer
                System.out.print("Comentário: ");
                comentarios[totalFilmes] = sc.nextLine();
                System.out.print("Diretor: ");
                diretor[totalFilmes] = sc.nextLine();

                filmes[totalFilmes] = new Filme(titulo[totalFilmes], ano[totalFilmes], tempoDuracao[totalFilmes], comentarios[totalFilmes], diretor[totalFilmes]);
                totalFilmes++;
            } else if (resposta1 == 3 && totalJogos < quantidadeItens) {
                sc.nextLine();
                System.out.println("Jogo " + (totalJogos + 1) + ":");
                System.out.print("Título: ");
                titulo[totalJogos] = sc.nextLine();
                System.out.print("Ano do jogo: ");
                ano[totalJogos] = sc.nextInt();
                System.out.print("Tempo de duração do jogo (em minutos): ");
                tempoDuracao[totalJogos] = sc.nextInt();
                sc.nextLine();  // Limpar buffer
                System.out.print("Comentário: ");
                comentarios[totalJogos] = sc.nextLine();
                System.out.print("Número de jogadores: ");
                numeroJogadores[totalJogos] = sc.nextInt();
                sc.nextLine();  // Limpar buffer
                System.out.print("Plataforma: ");
                plataforma[totalJogos] = sc.nextLine();

                jogos[totalJogos] = new Jogo(titulo[totalJogos], ano[totalJogos], tempoDuracao[totalJogos], comentarios[totalJogos], numeroJogadores[totalJogos], plataforma[totalJogos]);
                totalJogos++;
            } else {
                System.out.println("Opção inválida ou quantidade máxima de itens cadastrados atingida.");
            }

            sc.nextLine();
            System.out.print("Deseja cadastrar outro item? (sim/não) ");
            resposta = sc.nextLine();
        }

        System.out.println();

        if (totalCds > 0) {
            System.out.println("CDs cadastrados: " + totalCds);
            for (int j = 0; j < totalCds; j++) {
                System.out.println(cds[j]);
            }
        } else {
            System.out.println("Nenhum CD cadastrado!");
        }

        System.out.println();

        if (totalFilmes > 0) {
            System.out.println("Filmes cadastrados: " + totalFilmes);
            for (int j = 0; j < totalFilmes; j++) {
                System.out.println(filmes[j]);
            }
        } else {
            System.out.println("Nenhum filme cadastrado!");
        }

        System.out.println();

        if (totalJogos > 0) {
            System.out.println("Jogos cadastrados: " + totalJogos);
            for (int j = 0; j < totalJogos; j++) {
                System.out.println(jogos[j]);
            }
        } else {
            System.out.println("Nenhum jogo cadastrado!");
        }

        sc.close();
    }
}