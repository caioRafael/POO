public class Main {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario("Caio");
        funcionario1.calculaSalario(160);

        System.out.println(funcionario1);

        Funcionario funcinario2 = new Funcionario("Rafael", 15.0);
        funcinario2.calculaSalario(160);
        
        System.out.println(funcinario2);
    }
}
