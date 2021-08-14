package projecto;


public class Docente extends Pessoa{
    private double numeroMecanografico;
    private String areaInvestigacao;

    public Docente() {
    }

    public Docente(double numeroMecanografico, String areaInvestigacao, String nome, String email) {
        super(nome, email);
        this.numeroMecanografico = numeroMecanografico;
        this.areaInvestigacao = areaInvestigacao;
    }

    

    public double getNumeroMecanografico() {
        return numeroMecanografico;
    }

    public void setNumeroMecanografico(double numeroMecanografico) {
        this.numeroMecanografico = numeroMecanografico;
    }

    public String getAreaInvestigacao() {
        return areaInvestigacao;
    }

    public void setAreaInvestigacao(String areaInvestigacao) {
        this.areaInvestigacao = areaInvestigacao;
    }
    
    
    
}
