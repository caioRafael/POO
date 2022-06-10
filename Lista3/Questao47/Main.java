import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String valor1 = "(())()(())()";
        String valor2 = "((())()()(())()";

        Stack<String> pilha = new Stack<>();

        verificarBalanceamento(pilha, valor1);
        pilha.empty();
        verificarBalanceamento(pilha, valor2);
    }

    private static void verificarBalanceamento(Stack<String> pilha, String text) {
        boolean checkIsEmpty = true;

        for (int i = 0; i < text.length() && checkIsEmpty; i++) {
            String character = String.valueOf(text.charAt(i));

            if (character.equals("(")) {
                pilha.push(character);
            } else {
                if (pilha.isEmpty()) checkIsEmpty = false;
                else pilha.pop();
            }
        }

        if (checkIsEmpty && pilha.isEmpty()) {
            System.out.println("A pilha balaceada");
        } else {
            System.out.println("A pilha não está balaceada");
        }
    }
}
