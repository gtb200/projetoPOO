package projecto;

import java.util.GregorianCalendar;

public class Mestre extends Bolseiro{

    protected int custoMensal=1000;
    private Docente orientador;


    public Mestre(GregorianCalendar inicio, GregorianCalendar fim, String nome, String email, Docente orientador) {
        super(inicio, fim, nome, email);

        this.orientador = orientador;
    }
}
