package projecto;

import java.util.GregorianCalendar;

public class Licenciado extends Bolseiro {
    protected int custoMensal=800;
    private Docente orientador;


    public Licenciado(GregorianCalendar inicio, GregorianCalendar fim, String nome, String email, Docente orientador) {
        super(inicio, fim, nome, email);
        this.custoMensal = custoMensal;
        this.orientador = orientador;
    }


}
