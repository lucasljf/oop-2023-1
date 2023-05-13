package resolucao_lista05;

public class AuxiliarAdm extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora = 10;

    public AuxiliarAdm(String nome, String matricula, double horasTrabalhadas) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getValorAPagar() {
        return this.horasTrabalhadas * this.valorHora;
    }

    @Override
    public String getDescricao() {
        String texto;
        texto = "Auxiliar administrativo\n";
        texto += this.getFicha() + "\n";
        texto += "Horas trabalhadas: " + this.horasTrabalhadas + "\n";
        texto += "Valor da hora: " + this.valorHora + "\n";
        return texto;
    }
}
