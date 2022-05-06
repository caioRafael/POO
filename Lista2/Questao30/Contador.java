public class Contador {

    private int valor;

    public void zera(){
        this.valor = 0;
    }

    public void incrementa(){
        this.valor += 1;
    }

    public void imprimi(){
        System.out.println("Valor = "+this.valor);
    }
}
