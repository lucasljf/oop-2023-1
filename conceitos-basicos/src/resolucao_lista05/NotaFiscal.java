package resolucao_lista05;

public class NotaFiscal implements IPagavel {
    private Fornecedor fornecedor;
    private double valor;
    private double valorFrete;

    public NotaFiscal(Fornecedor fornecedor, double valor, double valorFrete) {
        this.fornecedor = fornecedor;
        this.valor = valor;
        this.valorFrete = valorFrete;
    }

    @Override
    public double getValorAPagar() {
        return this.valor + this.valorFrete;
    }

    @Override
    public String getDescricao() {
        String texto;
        texto = "Nota fiscal\n";
        texto += "Fornecedor: " + this.fornecedor.getNome() + "\n";
        texto += "Valor: " + this.valor + "\n";
        texto += "Valor do frete: " + this.valorFrete + "\n";
        return texto;
    }
}
