public class Governador extends Politico{
    private String estado;
  
    public Governador(String nome, int idade, String cor, int numero, String estado){
      super(nome, idade, cor, numero);
      this.estado = estado;
    }
  
    public Governador(Pessoa pessoa, int numero, String estado){
      super(pessoa, numero);
      this.estado = estado;
    }
  
  
    public String getEstado() {
      return estado;
    }
  
    public void setEstado(String estado) {
      this.estado = estado;
    }
  
    @Override
    public String toString() {
      String result = super.toString();
      result += ", Estado: " + this.estado + ", Cargo: Governador";
  
      return result;
    }
}
