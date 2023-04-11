package resolucao_lista04;

public class Horista extends Funcionario {
    private double valorHora;
    private double horasTrabalhadas;

    public Horista(String nome, String sobrenome, String cpf, double valorHora, double horasTrabalhadas) {
        super(nome, sobrenome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double ganhos() {
        if (horasTrabalhadas <= 40) {
            return valorHora * horasTrabalhadas;
        }
        else {
            double horasExtras = this.horasTrabalhadas - 40;
            double ganhosExtras = horasExtras * (this.valorHora * 1.5);
            double ganhosNormais = valorHora * 40;

            return ganhosExtras + ganhosNormais;
        }
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
