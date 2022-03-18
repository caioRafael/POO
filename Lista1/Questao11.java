import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args){
        int number;
        
        Scanner input = new Scanner(System.in);

        System.out.println("informe um numero:");
        number = input.nextInt();

        if(number < 0){
            do {
                System.out.println("o numero não pode ser menor que 0");
                System.out.println("informe um numero:");
                number = input.nextInt();
            } while (number < 0);
        }
        
        int[] feb = new int[number];
        feb[0] = 0;
        feb[1] = 1;
        for(int i=2; i < number; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }

        for(int i=0; i< number; i++){
                System.out.print(feb[i] + " ");
        }
    }
}
