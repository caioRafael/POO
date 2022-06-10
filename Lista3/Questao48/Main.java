import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (true) {
            try {
                System.out.println("Digite o primeiro valor: ");
                int num1 = calculadora.obterIntValido(scanner.next());
                System.out.println("Digite o segundo valor: ");
                int num2 = calculadora.obterIntValido(scanner.next());

                System.out.println("Resultado: " + calculadora.sum(num1, num2));
                return;
            } catch (NumberFormatException exception) {
                System.out.println("Valor inválido. Erro: " + exception.getMessage());
            }
        }
    }
}
