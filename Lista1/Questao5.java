import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        int num, c, d, u, numInv;


        Scanner input = new Scanner(System.in);

        System.out.println("Entre com um número de 3 digitos:");
        num = input.nextInt();
        c = num/100;
        d = num % 100/10;
        u = num %10;
        numInv = u*100 + d*10 + c;
        
        System.out.println ("numero:" + num);
        System.out.println ("invertido:" + numInv);
    }
}
