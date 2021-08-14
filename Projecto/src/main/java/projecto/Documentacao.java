package projecto;

import java.util.GregorianCalendar;

public class Documentacao extends Tarefa{
    protected double taxaEsforco;

    public Documentacao() {
    }

    public Documentacao(GregorianCalendar inicio, double duracao, Pessoa pessoaResponsavel) {
        super(inicio, duracao, pessoaResponsavel);
    }
}
