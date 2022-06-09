public class Funcionario extends FuncionarioAbstrado {

    Funcionario(String nome) {
        super(nome);
    }

    Funcionario(String nome, double valorHora){
        super(nome, valorHora);
    }
    
    public void calculaSalario(int horasTrabalhadas){
        this.setSalario(this.getValorHora() * horasTrabalhadas);
    }

    @Override
    public String toString() {
        return "Funcionario: \n"+
        "\tNome: "+ this.nome + "\n"+
        "\tValor por hora: "+ this.valorHora + "\n"+
        "\tSalario: "+ this.salario;
    }
}
