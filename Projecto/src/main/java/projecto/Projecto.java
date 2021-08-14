package projecto;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Projecto {
    private String nome;
    private String acronimo;
    private GregorianCalendar GregorianCalendarInicio;
    private int duracao;
    private GregorianCalendar GregorianCalendarFim;
    private Docente investigadorPrincipal;
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private ArrayList<Docente> listaDocentes = new ArrayList<>();
    private ArrayList<Bolseiro> listaBolseiros = new ArrayList<>();
    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();


    public Projecto() {
    }

    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

    public Projecto(String nome, String acronimo, GregorianCalendar gregorianCalendarInicio, int duracao, Docente investigadorPrincipal) {
        this.nome = nome;
        this.acronimo = acronimo;
        GregorianCalendarInicio = gregorianCalendarInicio;
        this.duracao = duracao;
        this.investigadorPrincipal = investigadorPrincipal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public void setGregorianCalendarInicio(GregorianCalendar gregorianCalendarInicio) {
        GregorianCalendarInicio = gregorianCalendarInicio;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setGregorianCalendarFim(GregorianCalendar gregorianCalendarFim) {
        GregorianCalendarFim = gregorianCalendarFim;
    }

    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public ArrayList<Docente> getListaDocentes() {
        return listaDocentes;
    }

    public void setListaDocentes(ArrayList<Docente> listaDocentes) {
        this.listaDocentes = listaDocentes;
    }

    public ArrayList<Bolseiro> getListaBolseiros() {
        return listaBolseiros;
    }

    public void setListaBolseiros(ArrayList<Bolseiro> listaBolseiros) {
        this.listaBolseiros = listaBolseiros;
    }

    public Docente getInvestigadorPrincipal() {
        return investigadorPrincipal;
    }

    public void setInvestigadorPrincipal(Docente investigadorPrincipal) {
        this.investigadorPrincipal = investigadorPrincipal;
    }

    public String getNome() {
        return nome;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public GregorianCalendar getGregorianCalendarInicio() {
        return GregorianCalendarInicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public GregorianCalendar getGregorianCalendarFim() {
        return GregorianCalendarFim;
    }
}
