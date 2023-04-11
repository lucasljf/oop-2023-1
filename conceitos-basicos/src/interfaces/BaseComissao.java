package interfaces;

public class BaseComissao extends Comissionado {
    private double salarioBase;

    public BaseComissao(String nome, String sobrenome, String cpf, double valorVendas, double taxaComissao,
            double salarioBase) {
        super(nome, sobrenome, cpf, valorVendas, taxaComissao);
        this.salarioBase = salarioBase;
    }

    @Override
    public final double calcularValorPagamento() {
        return super.calcularValorPagamento() + this.salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
