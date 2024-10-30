package Exercicio16;

import java.util.ArrayList;

public class Universidade {

    private String universidade;

    private ArrayList<Curso> cursos = new ArrayList<>();

    public Universidade(String universidade) {
        this.universidade = universidade;
    }
    public String getUniversidade() {
        return universidade;
    }
    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    public void addCurso(Curso c) {
        cursos.add(c);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Universidade: ").append(universidade).append("\n\n");

        for (Curso c : cursos) {
            retorno.append(c).append("\n");
        }

        return retorno.toString();
    }

}
