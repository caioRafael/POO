public class Main {
    public static void main(String args[]) {
        Time time = new Time("Flamengo", 97, 30, 90, 3, 4);
        time.mostrarTime();

        time.newVitoria();
        time.mostrarTime();

        time.newDerrota();
        time.mostrarTime();

        time.newEmpate();
        time.mostrarTime();

        time.newVitoria();
        time.mostrarTime();
        
    }
}
