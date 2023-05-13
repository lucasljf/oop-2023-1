package resolucao_lista05;

public abstract class Funcionario implements IPagavel {
    private String nome;
    private String matricula;

    public Funcionario(String nome, String matricula) {
        this.setNome(nome);
        this.setMatricula(matricula);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFicha() {
        return "Nome: " + this.nome + "\nMatrícula: " + this.matricula;
    }
}
