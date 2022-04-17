public class Time{
    private String nome;
    private int pontos;
    private int vitorias;
    private int saldoDeGols;
    private int empates;
    private int derrotas;

    Time(String nome,
     int pontos, 
     int vitorias, 
     int saldoDeGols, 
     int empates, 
     int derrotas){
         this.nome = nome;
         this.pontos = pontos;
         this.vitorias = vitorias;
         this.saldoDeGols = saldoDeGols;
         this.derrotas = derrotas;
         this.empates = empates;
     }

     public void mostrarTime(){
         System.out.println("Nome: "+this.nome);
         System.out.println("Pontos: "+this.pontos);
         System.out.println("Saldo de gols: "+this.saldoDeGols);
         System.out.println("Vitorias: "+this.vitorias);
         System.out.println("Empates: "+this.empates);
         System.out.println("Derrotas: "+this.derrotas);
     }

     public void newVitoria(){
         this.vitorias += 1;
         this.pontos += 3;
     }

     public void newEmpate(){
         this.empates += 1;
         this.pontos += 1;
     }

     public void newDerrota(){
         this.derrotas += 1;
     }
}