public class Elevador {
    private int andarAtual;
    private int quantidadeAndares;
    private int quantidadePessoas;
    private int capacidadePessoas;
    
    public int getAndarAtual() {
        return andarAtual;
    }
    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }
    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }
    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
    public int getQuantidadeAndares() {
        return quantidadeAndares;
    }
    public void setQuantidadeAndares(int quantidadeAndares) {
        this.quantidadeAndares = quantidadeAndares;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }


    public void inicializa(int capacidade, int qtdAndares){
        this.capacidadePessoas = capacidade;
        this.quantidadeAndares = qtdAndares;
    }

    public void entra(){
        //coloquei >= para garantir que nao entre no elevador mais do que sua capacidade
        if(quantidadePessoas >= capacidadePessoas){
            System.out.println("Nao a mais espaco no elevador");
        }else{
            this.quantidadePessoas += 1;
        }
    }

    public void sai(){
        if(quantidadePessoas <= 0){
            System.out.println("Nao a pessoas no elevador");
        }else{
            this.quantidadePessoas -= 1;
        }
    }

    public void sobe(int andar){
        if(andar > quantidadeAndares){
            System.out.println("Andar inesistente");
        }else if(andar < andarAtual){
            System.out.println("O elevador tem que subir");
        }else{
            this.andarAtual = andar;
        }
    }

    public void desce(int andar){
        if(andar < 0){
            System.out.println("Andar inesistente");
        }else if(andar > andarAtual){
            System.out.println("O elevador tem que descer");
        }else{
            this.andarAtual = andar;
        }
    }
}
