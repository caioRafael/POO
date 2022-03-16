import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        System.out.println("ola mundo");

        Scanner input = new Scanner(System.in);

        double angle, radian, sin, cos, tg;

        System.out.println("informe um angulo em graus:");
        angle = input.nextDouble();
        radian = Math.toRadians(angle);
        sin = Math.sin(angle);
        cos = Math.cos(angle);
        tg = Math.tan(angle);

        System.out.println(radian+" radiano");
        System.out.println(sin+" senno");
        System.out.println(cos+" cosseno");
        System.out.println(tg+" tangente");

    }
}
