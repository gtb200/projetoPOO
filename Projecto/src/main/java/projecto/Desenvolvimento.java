package projecto;

import java.util.GregorianCalendar;

public class Desenvolvimento extends Tarefa {
    protected double taxaEsforco;

    public Desenvolvimento(double taxaEsforco) {
        this.taxaEsforco = taxaEsforco;
    }

    public Desenvolvimento(GregorianCalendar inicio, double duracao, Pessoa pessoaResponsavel) {
        super(inicio, duracao, pessoaResponsavel);
    }
}
