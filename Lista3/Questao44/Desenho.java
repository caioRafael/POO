public class Desenho{
    private FiguraGeometrica figura1;
    private FiguraGeometrica figura2;
    private double x, y;
  
    Desenho(FiguraGeometrica figura1, FiguraGeometrica figura2, double x, double y){
      this.figura1 = figura1;
      this.figura2 = figura2;
      this.x = x;
      this.y = y;
    }
  
    public void apresenta(){
      this.figura1.desenha();
      this.figura2.desenha();
      System.out.println("Coordenada x: "+this.x+" y: "+this.y);
    }
    
}