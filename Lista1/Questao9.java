import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args){
        int x1,y1,x2,y2;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe as coordenadas do pronto 1");
        System.out.println("X1");
        x1 = input.nextInt();
        System.out.println("Y1");
        y1 = input.nextInt();

        System.out.println("Informe as coordenadas do pronto 2");
        System.out.println("X2");
        x2 = input.nextInt();
        System.out.println("Y2");
        y2 = input.nextInt();

        if(x2 == 0 && y2 == 0){
            System.out.println("O ponto 2 esta no 0");
        }else if(x2 > 0){
            if(y2 > 0){
                System.out.println("O ponto 2 esta acima do Eixo X e a direita do Eixo Y");
            }else if(y2 < 0){
                System.out.println("O ponto 2 esta abaixo do Eixo X e a direita do Eixo Y");
            }else if(y2 == 0){
                System.out.println("O ponto 2 esta no Eixo X e a direita do Eixo Y");
            }
        }else{
            if(y2 > 0){
                System.out.println("O ponto 2 esta acima do Eixo X e a esquerda do Eixo Y");
            }else if(y2 < 0){
                System.out.println("O ponto 2 esta abaixo do Eixo X e a esquerda do Eixo Y");
            }else if(y2 == 0){
                System.out.println("O ponto 2 esta no Eixo X e a esquerda do Eixo Y");
            }
        }
    }
}
