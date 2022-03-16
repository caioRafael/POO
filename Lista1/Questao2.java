import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        float number1, number2, number3;

        float sum, media;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe 3 numeros:");
        number1 = input.nextFloat();
        number2 = input.nextFloat();
        number3 = input.nextFloat();

        sum = number1+number2+number3;

        media = sum/3;

        System.out.println("Soma: "+sum);
        System.out.println("Media: "+ media);

    }
}
