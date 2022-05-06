import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int parteReal, parteImaginaria;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número real:");
        parteReal = input.nextInt();
        System.out.println("Digite um número imaginário:");
        parteImaginaria = input.nextInt();

        NumeroComplexo numero1 = new NumeroComplexo(parteReal, parteImaginaria);
        NumeroComplexo numero2 = new NumeroComplexo(parteReal);
        NumeroComplexo numero3 = new NumeroComplexo();

        System.out.println("numero 1:"+numero1);
        System.out.println("numero 2:"+numero2);
        System.out.println("numero 3:"+numero3);
    }
}
