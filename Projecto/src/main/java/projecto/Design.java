package projecto;

import java.util.GregorianCalendar;

public class Design extends Tarefa{
    protected double taxaEsforco;

    public Design(double taxaEsforco) {
        this.taxaEsforco = taxaEsforco;
    }

    public Design(GregorianCalendar inicio, double duracao, Pessoa pessoaResponsavel) {
        super(inicio, duracao, pessoaResponsavel);
    }
}
