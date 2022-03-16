import java.util.Scanner;

public class Questao1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float side;

        System.out.println("Informe a medida do lado do quadrado:");
        side = input.nextFloat();

        float area = side*side; 

        System.out.println("A area do quadrado e: "+ area +" metros quadrados");
    }
}