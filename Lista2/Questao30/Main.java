import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1, opcao;
        Scanner input = new Scanner(System.in);
        Contador contador = new Contador();
        Lampada lampada = new Lampada(contador);

        while (i != 0){
            System.out.println("Informe a opcao");
            System.out.println("1- acender");
            System.out.println("2- apagar");
            System.out.println("3- mostrar estado");
            System.out.println("4- está ligada?");
            System.out.println("5- quantas vezes foi acesa?");
            System.out.println("0- sair");
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    lampada.acende();
                    break;
                case 2:
                    lampada.apaga();
                    break;
                case 3:
                    lampada.mostraEstado();
                    break;
                case 4:
                    System.out.println(lampada.estaLigada() ? "sim" : "não");
                    break;
                case 5:
                    lampada.totalImpressoes();
                    break;
                default:
                    i = 0;
            }
        }
    }
}
