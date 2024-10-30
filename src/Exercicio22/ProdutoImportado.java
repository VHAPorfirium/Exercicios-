package Exercicio22;

public class ProdutoImportado extends Produto {

    private Double taxaAlfandegaria;

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandegaria) {
        super(nome, preco);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public Double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }
    public void setTaxaAlfandegaria(Double preco) {
        taxaAlfandegaria = preco;
    }

    public Double precoTotal() {

        return getPreco() + taxaAlfandegaria;

    }

    @Override
    public String etiquetaPreco() {

        return getNome() + " $ " + String.format("%.2f", precoTotal()) + " Taxa alfandegaria: " + String.format("%.2f", taxaAlfandegaria);

    }


}
