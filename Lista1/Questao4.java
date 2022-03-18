import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        float graus, fahrenheit;

        Scanner input = new Scanner(System.in);

        //ºF = (gruas * (9/5)) + 32

        System.out.println("Informe os gruas ºC:");
        graus = input.nextFloat();

        fahrenheit = (graus * (9/5)) + 32;

        System.out.println(fahrenheit+"ºF");
    }    
}
