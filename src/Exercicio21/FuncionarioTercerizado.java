package Exercicio21;

public class FuncionarioTercerizado extends Funcionario {

    private Double dispesaAdicional;

    public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHoras, Double dispesaAdicional) {
        super(nome, horas, valorPorHoras);
        this.dispesaAdicional = dispesaAdicional;
    }

    public Double getDispesaAdicional() {
        return dispesaAdicional;
    }
    public void setDispesaAdicional(Double dispesaAdicional) {
        this.dispesaAdicional = dispesaAdicional;
    }

    @Override
    public Double pagamento(){

        return getValorPorHoras() * getHoras() + (getDispesaAdicional() * 1.10);

    }

    @Override
    public String toString() {
        return getNome() +" - R$ " + pagamento();
    }
}
