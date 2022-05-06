public class RegistroAcademico {
    public static int numeroRegistros = 0;
    private String nome;
    private int registration;
    private int codigoCurso;
    private double porcentagem;

    public void inicializar(String nome, int codigoCurso, double porcentagem){
        numeroRegistros++;
        this.nome = nome;
        this.registration = numeroRegistros;
        this.codigoCurso = codigoCurso;
        this.porcentagem = porcentagem;
    }

    public double calcularPagamento(){
        return 100*codigoCurso*porcentagem;
    }

    public static void setNumeroRegistros(int value){
        numeroRegistros = value;
    }

    public static  int getNumeroRegistros(){
        return numeroRegistros;
    }

    public String getNome(){
        return nome;
    }
}
