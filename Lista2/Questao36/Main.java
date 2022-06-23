public class Main {
    public static void main(String[] args){
        Matriz matriz = new Matriz();

        matriz.preencherMatriz();

        System.out.println("Determinante "+matriz.determinanteMatriz());

        matriz.imprimirFormatadaMatriz();
    }
}
