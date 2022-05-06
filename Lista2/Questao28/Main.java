import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int quantidadeAndares, andarAtual = 0, quantidadePessoas = 0, capacidadePessoas;
        boolean elevadorFuncionando = true;

        Scanner input = new Scanner(System.in);
        
        Elevador elevador = new Elevador();

        elevador.setAndarAtual(andarAtual);
        elevador.setQuantidadePessoas(quantidadePessoas);

        System.out.println("informe a quantudade de andares do predio:");
        quantidadeAndares = input.nextInt();

        System.out.println("informe a capacidade do elevaodr:");
        capacidadePessoas = input.nextInt();

        elevador.setQuantidadeAndares(quantidadeAndares);
        elevador.setCapacidadePessoas(capacidadePessoas);

        while (elevadorFuncionando == true) {
            int fluxo, direcao, encerrarOperacao, andar;
            System.out.println("informe o fluxo da pessoa");
            System.out.println("1- entra");
            System.out.println("2- sai");
            fluxo = input.nextInt();

            if(fluxo == 1){
                elevador.entra();
                System.out.println("a "+elevador.getQuantidadePessoas()+" pessoas no elevador");
            }else if(fluxo == 2){
                elevador.sai();
                System.out.println("a "+elevador.getQuantidadePessoas()+" pessoas no elevador");
            }

            System.out.println("informe o a direcao");
            System.out.println("1- subir");
            System.out.println("2- descer");
            direcao = input.nextInt();
            System.out.println("inform o andar");
            andar = input.nextInt();

            if(direcao == 1){
                elevador.sobe(andar);
                System.out.println("O elevador esta no "+elevador.getAndarAtual()+" andar");
            }else if(direcao == 2){
                elevador.desce(andar);
                System.out.println("O elevador esta no "+elevador.getAndarAtual()+" andar");
            }

            System.out.println("deseja continuar");
            System.out.println("1- sim");
            System.out.println("2- nao");
            encerrarOperacao = input.nextInt();

            if(encerrarOperacao == 1){
                elevadorFuncionando = true;
            }else if(encerrarOperacao == 2){
                elevadorFuncionando = false;
            }
        }
    }
}
