public class Questao12 {
    public static void main(String args[]) {
        System.out.println("4 primeiros números perfeitos");

        int number;

        for (int i=1; i<=10000; i++) {
            number = 0;

            for (int x=1; x<=(i/2); x++) {
                if ((i % x) == 0) {
                    number += x;
                }
            }

            if (i == number) {
                System.out.println(i);
            }
        }

    }

}
