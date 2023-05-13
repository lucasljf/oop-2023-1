package resolucao_lista05;

public class Conta implements IPagavel {
    private int diaVencimento;
    private int diaPagamento;
    private double valor;

    public Conta(int diaVencimento, int diaPagamento, double valor) {
        this.diaVencimento = diaVencimento;
        this.diaPagamento = diaPagamento;
        this.valor = valor;
    }

    @Override
    public double getValorAPagar() {
        if (this.diaPagamento > this.diaVencimento) {
            int diferencaDias = this.diaPagamento - this.diaVencimento;
            double novoValor = this.valor * 1.05;
            for (int i = 0; i < diferencaDias; i++) {
                novoValor *= 1.005;
            }
            return novoValor;
        } else {
            return this.valor;
        }
    }

    @Override
    public String getDescricao() {
        String texto;
        texto = "Conta\n";
        texto += "Dia de vencimento: " + this.diaVencimento + "\n";
        texto += "Dia de pagamento: " + this.diaPagamento + "\n";
        texto += "Valor: " + this.valor + "\n";
        return texto;
    }
}
