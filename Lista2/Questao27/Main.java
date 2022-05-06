import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int matricula;
        String nome;
        double nota1, nota2, notaTrabalho;

        Scanner input = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Informe os dados do aluno:");
        System.out.println("Matricula:");
        matricula = input.nextInt();
        System.out.println("Nome:");
        nome = input.next();
        System.out.println("Nota 1:");
        nota1 = input.nextDouble();
        System.out.println("Nota 2:");
        nota2 = input.nextDouble();
        System.out.println("Nota do Trabalho:");
        notaTrabalho = input.nextDouble();


        aluno.setMatricula(matricula);
        aluno.setNome(nome);
        aluno.setNota1(nota1);
        aluno.setNota2(nota2);
        aluno.setNotaTrabalho(notaTrabalho);

        double media = aluno.media();
        double provaFinal = aluno.provaFinal();

        System.out.println("Matricula: "+aluno.getMatricula());
        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Media: "+media);
        if(provaFinal != 0){
            System.out.println("Nota almejada na prova final: "+ provaFinal);
        }else{
            System.out.println("Nao necessitou realizar a prova final");
        }

    }
}
