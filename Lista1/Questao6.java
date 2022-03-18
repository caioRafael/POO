import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        int minutsInput, days, hours, minuts;

        Scanner input = new Scanner(System.in);

        System.out.println("insira os minutos:");
        minutsInput = input.nextInt();

        //um dia tem 1440 minutos,então para calcular os dias basta dividir os minutos por 1440
        days = minutsInput/1440;

        //para as horas calcula-se quantos minutos sobraram do dia e dividir por 60, pois uma hora tem 60 minutos
        hours = (minutsInput%1440)/60;

        // para calcular os minutos é o mesmo procedimento das horas, mas em vez de dividir por 60, calcula-se o resto
        minuts = (minutsInput%1440)%60;

        System.out.println(minutsInput+" minutos = "+days+ " dias "
        + hours + " horas e "+minuts+" minutos");
    }
}
