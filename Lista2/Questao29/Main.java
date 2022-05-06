import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int opcao;
        Scanner input = new Scanner(System.in);
        Contador contador = new Contador();

        while (i != 0){
            System.out.println("Escolha uma opcao");
            System.out.println("1- Adicionar");
            System.out.println("2- zerar");
            System.out.println("3- Mostrar");
            System.out.println("0- Encerrar");
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    contador.incrementa();
                    break;
                case 2:
                    contador.zera();
                    break;
                case 3:
                    contador.imprimi();
                    break;
                default:
                    contador.zera();
                    i = 0;
                    break;
            }
        }
    }
}
