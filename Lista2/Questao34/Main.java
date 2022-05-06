import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcao = 1;
        Scanner input = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (opcao != 0){
            System.out.println("Escolha uma opção operação");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("0 - sair");
            opcao = input.nextInt();

            System.out.println("Informe um numero: ");
            int numero1 = input.nextInt();
            System.out.println("Informe outro numero: ");
            int numero2 = input.nextInt();
            switch (opcao){
                case 1:
                    System.out.println(calculadora.soma(numero1, numero2));
                    break;
                case 2:
                    System.out.println(calculadora.subtracao(numero1, numero2));
                    break;
                case 3:
                    System.out.println(calculadora.multiplicacao(numero1, numero2));
                    break;
                case 4:
                    System.out.println(calculadora.divisao(numero1, numero2));
                    break;
                default:
                    opcao = 0;
            }
        }
    }
}
