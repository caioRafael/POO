public class Politico extends Pessoa {
    private int numero;

    public Politico(Pessoa pessoa, int numero) {
        super(pessoa);
        this.numero = numero;
    }

    public Politico(String nome, int idade, String cor, int numero) {
        super(nome, idade, cor);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += ", numero: " + this.numero;

        return result;
    }
}