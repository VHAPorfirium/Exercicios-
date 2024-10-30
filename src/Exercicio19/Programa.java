package Exercicio19;

public class Programa {
    public static void main(String[] args) {
        Livro livro = new Livro("A volta dos que nao foram", 25269, new Pessoa("Victor Hugo", "Porfiro", "Aguiar"), "Não sei", "Quinta edição", 2024, "Goiania", "Masculino");

        System.out.println(livro.toString());
    }
}
