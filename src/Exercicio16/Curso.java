package Exercicio16;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private String coordenador;

    private ArrayList<Professor> professors = new ArrayList<>();

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String nome, String coordenador) {
        this.nome = nome;
        this.coordenador = coordenador;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCoordenador() {
        return coordenador;
    }
    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void adicionarProfessor(Professor professor) {
        professors.add(professor);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();

        retorno.append("Professores:\n");
        for (Professor professor : professors) {
            retorno.append(professor.toString()).append("\n");
        }

        retorno.append("\nAlunos:\n");
        for (Aluno aluno : alunos) {
            retorno.append(aluno.toString()).append("\n\n");
        }

        return "Curso: "  + nome + "\nCoordenador: " + coordenador + "\n\n" +  retorno.toString();
    }


}
