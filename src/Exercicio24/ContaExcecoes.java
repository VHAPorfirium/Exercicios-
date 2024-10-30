package Exercicio24;

public class ContaExcecoes extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ContaExcecoes(String msg) {
        super(msg);
    }

}
