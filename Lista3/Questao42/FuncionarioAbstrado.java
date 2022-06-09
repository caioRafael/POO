public abstract class FuncionarioAbstrado {
    protected String nome;
    protected double valorHora;
    protected double salario;

    FuncionarioAbstrado(String nome) {
        this.nome = nome;
        this.valorHora = 2;
        this.salario = 0;
    }

    FuncionarioAbstrado(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
