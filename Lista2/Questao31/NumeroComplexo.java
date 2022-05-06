public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplexo(double parteReal, double parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public NumeroComplexo(double parteReal){
        this.parteReal = parteReal;
        parteImaginaria = 0;
    }

    public NumeroComplexo(){
        parteReal = 0;
        parteImaginaria = 0;
    }

    @Override
    public String toString() {
        return "Numero Complexo = [" +
                "parte Real=" + parteReal +
                ", parte Imaginaria=" + parteImaginaria +
                ']';
    }
}
