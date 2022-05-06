public class Main {
    public static void main(String[] args) {
        RegistroAcademico student1 = new RegistroAcademico();
        RegistroAcademico student2 = new RegistroAcademico();
        RegistroAcademico student3 = new RegistroAcademico();

        System.out.println("Atributo estático: "+ RegistroAcademico.getNumeroRegistros());
        student1.inicializar("Caio", 503, 150.0);
        System.out.println("A mensalidade de "+  student1.getNome() + " é "+ student1.calcularPagamento());
        System.out.println("Atributo estático: "+ RegistroAcademico.getNumeroRegistros());
        student2.inicializar("Rafael", 200, 189.0);
        System.out.println("A mensalidade de "+  student2.getNome() + " é "+ student2.calcularPagamento());
        System.out.println("Atributo estático: "+ RegistroAcademico.getNumeroRegistros());
        student3.inicializar("Rocha", 437, 120.0);
        System.out.println("A mensalidade de "+  student3.getNome() + " é "+ student3.calcularPagamento());
    }
}
