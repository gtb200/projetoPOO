package projecto;

import java.util.GregorianCalendar;

public abstract class Tarefa{
    private GregorianCalendar inicio;
    private double duracao;
    private double taxaExecucao;
    private GregorianCalendar fim;
    private Pessoa pessoaResponsavel;

    public Tarefa() {
    }
    

    public Tarefa(GregorianCalendar inicio, double duracao, Pessoa pessoaResponsavel) {
        this.inicio = inicio;
        this.duracao = duracao;

        this.pessoaResponsavel = pessoaResponsavel;
    }


 }
