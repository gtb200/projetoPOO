/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import javax.print.Doc;
import java.io.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Gustavo
 */
public class CISUC {


    public CISUC() {

    }

    private ArrayList<Docente> listaDocentes = new ArrayList<Docente>();
    private ArrayList<Bolseiro> listaBolseiros = new ArrayList<Bolseiro>();
    private ArrayList<Projecto> listaProjectos = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        File Docentes = new File("Docentes.txt");
        CISUC cisuc = new CISUC();
        GUI Gui = new GUI(cisuc);
        loadDocente(cisuc);

        GregorianCalendar inicio = new GregorianCalendar(7, 9, 2018);
        GregorianCalendar fim = new GregorianCalendar(5, 6, 2025);

        cisuc.listaBolseiros.add(new Licenciado(inicio, fim, "Gustavo Bizarro", "gtb200@hootmail.com", cisuc.listaDocentes.get(0)));
        cisuc.listaProjectos.add(new Projecto("Teste","TaT",new GregorianCalendar(),6,cisuc.listaDocentes.get(1)));

        cisuc.listaProjectos.get(0).getListaBolseiros().add(cisuc.listaBolseiros.get(0));
        cisuc.listaProjectos.get(0).getListaDocentes().add(cisuc.listaDocentes.get(1));
        Gui.paginaPrincipal();



//        Docente p2= new Docente(2018303352,"Informatica","Dario Manhanga","Dario@hotmail.com");
//        guardarPessoa(p2,"Docentes.txt");

        for(Docente i: cisuc.listaDocentes){
            System.out.println(i.getNome());
        }
//      guardarPessoa(listaBolseiros.get(0),"Bolseiros.txt");
        guardarDocente(cisuc.listaDocentes,"Docentes.txt");

    }

    public ArrayList<Docente> getListaDocentes() {
        return listaDocentes;
    }

    public ArrayList<Bolseiro> getListaBolseiros() {
        return listaBolseiros;
    }

    public ArrayList<Projecto> getListaProjectos() {
        return listaProjectos;
    }

    public void setListaDocentes(ArrayList<Docente> listaDocentes) {
        this.listaDocentes = listaDocentes;
    }

    public void setListaBolseiros(ArrayList<Bolseiro> listaBolseiros) {
        this.listaBolseiros = listaBolseiros;
    }

    public void setListaProjectos(ArrayList<Projecto> listaProjectos) {
        this.listaProjectos = listaProjectos;
    }

    public static void guardarDocente(ArrayList<Docente> pessoa, String ficheiro) {
        try {
            FileOutputStream ficheiro1 = new FileOutputStream(new File(ficheiro));
            ObjectOutputStream output = new ObjectOutputStream(ficheiro1);
            output.writeObject(pessoa);
            output.close();
            ficheiro1.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CISUC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CISUC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static void loadDocente(CISUC cisuc) throws IOException {
        FileInputStream fis = new FileInputStream("Docentes.txt");
        final ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException e) {
            return;
        }
        try (ois) {

            Object lido = ois.readObject();

            cisuc.listaDocentes = (ArrayList) lido;


        } catch (FileNotFoundException ex) {
            System.out.println("Erro a abrir ficheiro.");
        } catch (IOException ex) {




        } catch (ClassNotFoundException ex) {
            System.out.println("Erro a converter objeto.");
        }
        ois.close();
    }
}