public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double notaTrabalho;

    public double media(){
        double m = (
            ((this.nota1*2.5)+(this.nota2*2.5)+(notaTrabalho*2))/7
        );

        return m;        
    }

    public double provaFinal(){
        double m = media();

        if (m < 7.0){
            return 7-m;
        }

        return 0;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
