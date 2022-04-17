import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int id;
        String description;
        int amount;
        float unitPrice;
        
        System.out.println("informe o numero de identificaçao:");
        id = input.nextInt();

        System.out.println("Descriçao:");
        description = input.next();

        System.out.println("informe a quantidade:");
        amount = input.nextInt();

        System.out.println("informe o valor unitario:");
        unitPrice = input.nextFloat();


        Fatura fatura = new Fatura(id, description, amount, unitPrice);

        System.out.println(fatura.calculaTotal());
    }
}