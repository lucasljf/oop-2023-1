package resolucao_lista05;

public class Gerente extends Funcionario {
    private AuxiliarAdm[] auxiliares = new AuxiliarAdm[3];
    private double salario;
    private double horasExtras;
    private double valorHoraExtra = 10;

    public Gerente(String nome, String matricula, double salario, double horasExtras) {
        super(nome, matricula);
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public void setAuxiliares(AuxiliarAdm[] auxiliares) {
        this.auxiliares = auxiliares;
    }

    @Override
    public double getValorAPagar() {
        double vencimentos = this.salario + this.horasExtras * this.valorHoraExtra;
        for (AuxiliarAdm auxiliar : this.auxiliares) {
            vencimentos *= 1.02;
        }
        return vencimentos;
    }

    @Override
    public String getDescricao() {
        String texto;
        texto = "Gerente\n";
        texto += this.getFicha() + "\n";
        texto += "Salário: " + this.salario + "\n";
        texto += "Horas extras: " + this.horasExtras + "\n";
        texto += "Valor da hora extra: " + this.valorHoraExtra + "\n";
        return texto;
    }
}
