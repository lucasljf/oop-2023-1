package resolucao_lista04;

public class Comissionado extends Funcionario {
    private double valorVendas;
    private double taxaComissao;
    
    public Comissionado(String nome, String sobrenome, String cpf, double valorVendas, double taxaComissao) {
        super(nome, sobrenome, cpf);
        this.valorVendas = valorVendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double ganhos() {
        return this.valorVendas * (this.taxaComissao/100);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
}
