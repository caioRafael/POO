import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        int base;
        int expoent;
        int finalValue;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a base:");
        base = input.nextInt();

        System.out.println("Informe o expoente:");
        expoent = input.nextInt();

        finalValue = Potency(base, expoent);

        System.out.println("Potencia("+ base + "," +expoent+") = " + finalValue);
    }

    public static int Potency(int base, int expoent){
        if(expoent == 0){
            return 1;
        }

        return base * Potency(base, expoent - 1);
    }
}
