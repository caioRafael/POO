import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int contador = 1;
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um id negativo para encerrar o programa");
        while (true){
            int id, idade;
            String nome, telefone;
            System.out.println("Id "+contador+": ");
            id = input.nextInt();
            if (id < 0){
                break;
            }
            System.out.println("Nome "+contador+": ");
            nome = input.next();
            System.out.println("Idade "+contador+": ");
            idade = input.nextInt();
            System.out.println("Telefone "+contador+": ");
            telefone = input.next();

            Cliente cliente = new Cliente(id, nome, idade, telefone);
            clientes.add(cliente);
            contador += 1;
        }

        for (Cliente cliente: clientes) {
            System.out.println("Id: "+cliente.getId());
            System.out.println("Nome: "+cliente.getNome());
            System.out.println("Idade: "+cliente.getIdade());
            System.out.println("Telefone: "+cliente.getTelefone());
            System.out.println("--------------------");
        }
    }
}
