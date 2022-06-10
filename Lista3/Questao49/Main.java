import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
        
          try{
              System.out.println("digite o numero do mes: ");
              int mes = scanner.nextInt();
              System.out.println(meses[mes-1]);
          }catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Erro: " + e);
              System.out.println("Erro no Indice do Array");
          }
          catch(InputMismatchException e){
              System.out.println("Erro: " + e);
              System.out.println("Valor invalido.");
          }finally{
              scanner.close();
          }
      }
}
