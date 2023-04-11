package resolucao_lista04;

public class BaseComissao extends Comissionado {
    private double salarioBase;

    public BaseComissao(String nome, String sobrenome, String cpf, double valorVendas, double taxaComissao,
            double salarioBase) {
        super(nome, sobrenome, cpf, valorVendas, taxaComissao);
        this.salarioBase = salarioBase;
    }

    @Override
    public double ganhos() {
        return super.ganhos() + this.salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
