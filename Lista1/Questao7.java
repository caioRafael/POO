import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        int number, naipe;
        String cardText, naipeText;

        Scanner input = new Scanner(System.in);

        System.out.println("informe o numero da carta:");
        System.out.println("Use: \n 1: AS \n 2-10: numeros correspondentes\n 11: Valete\n 12: Rainha\n 13: Rei");
        number = input.nextInt();

        System.out.println("infrome o naipe:");
        System.out.println("use:\n 1: ouros\n 2: paus\n 3: copas \n 4: espadas");
        naipe = input.nextInt();

        
        if((naipe > 0 && naipe <= 4) && (number > 0 && number <= 13)){
            cardText = numberCard(number);
            naipeText = naipeCard(naipe);
            System.out.println(cardText+" de "+naipeText);
        }else{
            System.out.println("Algum dos valores está incorreto");
        }


    }

    //Preferi utilizar o switch pois os valores são bem definidos
    public static String numberCard(int number){
        String card;
        switch (number) {
            case 1:
                card = "AS";
                break;
            case 11:
                card = "Valete";
                break;
            case 12: 
                card = "Rainha";
                break;
            case 13:
                card = "Rei";
                break;
            default:
                card = number+"";
                break;
        }
        return card;
    }

    public static String naipeCard(int number){
        String naipe;

        switch (number) {
            case 1:
                naipe = "ouros";
                break;
            case 2:
                naipe = "paus";
                break;
            case 3:
                naipe = "copas";
                break;
            case 4:
                naipe = "espadas";
                break;
            default:
                naipe = "";
                break;
        }
        return naipe;
    }
}