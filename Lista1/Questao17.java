import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        double numberM;
        double numberN;
        double finalValue;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor de M:");
        numberM = input.nextDouble();

        System.out.println("Informe o valor de N");
        numberN = input.nextDouble();

        finalValue = mdc(numberM, numberN);

        System.out.println(finalValue);
    }

    public static double mdc(double numberM, double numberN){
        if ((numberM % numberN == 0)) {
            return numberN;
        } else {
            return mdc(numberN, (numberM % numberN));
        }
    }
}
