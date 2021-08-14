package projecto;

import java.io.Serializable;
import java.util.GregorianCalendar;

public abstract class Bolseiro extends Pessoa implements Serializable {
    private GregorianCalendar inicio;
    private GregorianCalendar fim;
    private Projecto projectoAssociado;

    public Bolseiro(GregorianCalendar inicio, GregorianCalendar fim, String nome, String email) {
        super(nome, email);
        this.inicio = inicio;
        this.fim = fim;
    }

    public Bolseiro() {

    }

    public void setProjectoAssociado(Projecto projectoAssociado) {
        this.projectoAssociado = projectoAssociado;
    }

    public Projecto getProjectoAssociado() {
        return projectoAssociado;
    }

    public GregorianCalendar getInicio() {
        return inicio;
    }

    public void setInicio(GregorianCalendar inicio) {
        this.inicio = inicio;
    }

    public GregorianCalendar getFim() {
        return fim;
    }

    public void setFim(GregorianCalendar fim) {
        this.fim = fim;
    }
    
    
    
    
}
