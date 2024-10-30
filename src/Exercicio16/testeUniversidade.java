package Exercicio16;

public class testeUniversidade {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Victor hugo", "0515785784", 22, 2024587524);
        Aluno aluno2 = new Aluno("Josu", "5222151", 18, 2024055484);

        Professor professor1 = new Professor("Elias", "056269595", 40,"Java - POO");

        Curso curso1 = new Curso("ADS", "Cleba");


        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso1.adicionarProfessor(professor1);

        Universidade universidade1 = new Universidade("Puc-GO");

        universidade1.addCurso(curso1);

        System.out.println(universidade1);



    }
}
