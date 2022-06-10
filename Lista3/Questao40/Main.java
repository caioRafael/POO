public class Main {
    public static void main(String args[]) {
        Pessoa pessoa1 = new Pessoa("Caio", 26, "branco");
        Pessoa pessoa2 = new Pessoa("Rafael", 62, "branco");

        Prefeito prefeito = new Prefeito(pessoa1, 25, "Pau dos Ferros", "RN");
        System.out.println(prefeito);

        Governador governador = new Governador(pessoa2, 12, "RN");
        System.out.println(governador);
    }
}
