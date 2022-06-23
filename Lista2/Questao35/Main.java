public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addDiaAgenda(22, 5, 2022, 17, "teste de sofware");
        agenda.addDiaAgenda(20, 6, 2022, 18, "teste de Requisitos");
        agenda.addDiaAgenda(21, 6, 2022, 19, "teste de Application");
        agenda.addDiaAgenda(21, 6, 2022, 17, "Estudo faculdade");
        agenda.addDiaAgenda(22, 6, 2022, 18, "Estudo programacao");

        agenda.imprimirAgenda();

        agenda.listaDia(11, 2, 2022);
        
    }
}
