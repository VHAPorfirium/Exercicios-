package Exercicio24;

import java.io.Serial;

public class ContaExcecoes extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ContaExcecoes(String msg) {
        super(msg);
    }

}
