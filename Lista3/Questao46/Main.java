import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]) {
        String texto = "HELLO THERE";
        HashMap<Character, Integer> mapa = new HashMap<>();
        String[] palavras = texto.split(" ");

        for (String palavra : palavras) {

            for (int i = 0; i < palavra.length(); i++) {
                palavra = palavra.toLowerCase();
                Character caixaBaixa = palavra.charAt(i);

                if (mapa.containsKey(caixaBaixa)) {
                    int num = mapa.get(caixaBaixa);
                    mapa.put(caixaBaixa, num + 1);
                } else {
                    mapa.put(caixaBaixa, 1);
                }
            }
        }

        TreeSet<Character> palavrasOrdenadas = new TreeSet<>(mapa.keySet());
        for (Character palavra : palavrasOrdenadas) {
            System.out.println(palavra+" = "+mapa.get(palavra));
        }

        System.out.println(mapa);
    }
}
