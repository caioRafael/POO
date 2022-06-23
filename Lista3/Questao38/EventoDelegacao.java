public class EventoDelegacao {
    private String evento;
    private DataHora dataHora;

    EventoDelegacao(String evento, DataHora dataHora) {
        this.evento = evento;
        this.dataHora = dataHora;
    }

    EventoDelegacao() {
        this.evento = "DELEGAÇÃO";
        this.dataHora = new DataHora();
    }

    public DataHora getDataHora() {
        return dataHora;
    }

    public void setDataHora(DataHora dataHora) {
        this.dataHora = dataHora;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        String msg = this.dataHora.toString();

        return "EVENTO " + this.evento + ": ( " + msg + " )";
    }
}
