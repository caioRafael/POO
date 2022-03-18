import java.util.Scanner;

public class Questao16 {
    
    public static void main(String[] args) {
        int number;
        int finalValue;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        number = input.nextInt();

        finalValue = Factorial( number);

        System.out.println(finalValue);
    }

    public static int Factorial(int number){
        if(number <= 1){
            return 1;
        }

        int localVariable = Factorial( number - 1) * number;
        System.out.println("Numero:"+ number +"\n\tCalculo: "+ localVariable);

        return localVariable;
    }
}
