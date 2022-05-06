public class Lampada {

    private boolean estadoDaLampada;

    private Contador contador;

    public Lampada(Contador contador) {
        this.contador = contador;
    }

    public void acende() {
        contador.incrementa();
        this.estadoDaLampada = true;
    }

    public void apaga() {
        this.estadoDaLampada = false;
    }

    public void mostraEstado(){
        if (estadoDaLampada){
            System.out.println("A lampada está acesa");
        }else{
            System.out.println("A lampada está apagada");
        }
    }

    public boolean estaLigada(){
        return estadoDaLampada;
    }

    public void totalImpressoes(){
        contador.imprimi();
    }
}
