public class EventoHeranca extends DataHora {
    private String evento;

    EventoHeranca() {
        super();
        this.evento = "HERANÇA";
    }

    EventoHeranca(DataHora dataHora, String evento) {
        super(dataHora.getHorario(), dataHora.getData());
        this.evento = evento;
    }

    public String getEvento() {
        return this.evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "EVENTO " + this.evento + ": ( " + this.getData() + ", " + this.getHorario() + " )";
    }
}
