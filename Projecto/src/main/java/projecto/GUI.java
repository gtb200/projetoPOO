/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.print.Doc;
import javax.swing.*;

public class GUI {
    CISUC cisuc;

    public GUI(CISUC cisuc) {
        this.cisuc = cisuc;
    }



    JFrame framePrincipal = new JFrame();
    /////////////
    JButton botaoListaBolseiros = new JButton("Listar Bolseiros");
    JButton botaoListaProjetos = new JButton("Listar Projetos");
    JButton botaoListaDocentes = new JButton("Listar Docentes");
    JButton botaoSaveExit = new JButton("Save and exit");
    ///////////////
    JButton botaoVerBolseiro = new JButton("Ver informações do perfil");
    JButton botaoCriarBolseiro = new JButton("Adicionar perfil");
    JButton botaoCriarDocente = new JButton("Adicionar Docente");
    JButton botaoVerDocente = new JButton("Ver informaçoes");
    JButton botaoVoltarPrincipal1 = new JButton("Voltar");
    JButton botaoVoltarPrincipal2 = new JButton("Voltar");
    JButton botaoCheckDataBolseiro = new JButton("Check/set");
    ////////////////
    JButton botaoVoltarVerInformacaoDocente = new JButton("Voltar");
    JButton botaoVoltarListaDocentes = new JButton("Voltar");
    JButton botaoVoltarListaBolseiros = new JButton("Voltar");
    JButton botaoVoltarListaProjectos = new JButton("Voltar");
    JButton botaoMakeDocente = new JButton("Criar");
    JButton botaoMakeBolseiro = new JButton("Criar");
    JButton botaoMakeProjecto = new JButton("Criar");
    JButton botaoEditarNomeDocente = new JButton("Editar nome");
    JButton botaoEditarEmailDocente = new JButton("Editar email");
    JButton botaoEditarNumeroDocente = new JButton("Editar numero");
    JButton botaoEditarAreaDocente = new JButton("Editar Area");
    ////////////////
    JButton botaoVerInformacaoProjecto = new JButton("Ver Projeto");
    JButton botaoCriarProjecto = new JButton("Criar projecto");
    JButton botaoVoltarPrincipal3 = new JButton("Voltar");
    ////////////////
    DefaultListModel listaBolseiroObjetos = new DefaultListModel();
    JList ListaJBolseiros = new JList(listaBolseiroObjetos);
    JScrollPane scrollerBolseiros = new JScrollPane(ListaJBolseiros);

    DefaultListModel listaDocenteObjetos = new DefaultListModel();
    JList docenteLista = new JList(listaDocenteObjetos);
    JScrollPane scrollerDocentes = new JScrollPane(docenteLista);

    DefaultListModel listaProjectosObjetos = new DefaultListModel();
    JList listaJProjectos = new JList(listaProjectosObjetos);
    JScrollPane scrollerProjectos = new JScrollPane(listaJProjectos);

    ////////////////
    JTextField caixaNome = new JTextField(40);
    JTextField caixaEmail = new JTextField(40);
    JTextField caixaMeca = new JTextField(40);
    JTextField caixaArea = new JTextField(40);

    JTextField caixaNomeCriarBolseiro = new JTextField(40);
    JTextField caixaEmailCriarBolseiro = new JTextField(40);

    JTextField caixaNomeProjecto = new JTextField(40);
    JTextField caixaAcronimo = new JTextField(40);
    JTextField caixaDuracaoEstimada = new JTextField(20);

    ////////////////
    JLabel labelVariavel1 = new JLabel();
    JLabel labelVariavel2 = new JLabel();
    JLabel labelVariavel3 = new JLabel();
    JLabel labelVariavel4 = new JLabel();
    JLabel labelVariavelProjecto = new JLabel();
    JLabel labelNomeDocente = new JLabel("Nome:");
    JLabel labelEmailDocente = new JLabel("Email:");
    JLabel labelMecaDocente = new JLabel("Numero mecanográfico:");
    JLabel labelAreaDocente = new JLabel("Área de investigação:");
    JLabel labelCriarDocenteTitulo = new JLabel("Criar Docente:");
    JLabel labelNomeBolseiro = new JLabel("Nome:");
    JLabel labelEmailBolseiro = new JLabel("Email:");
    JLabel labelDataInicioBolseiro = new JLabel("Data Inicio:");
    JLabel labelDataFinalBolseiro = new JLabel("Data Final:");
    JLabel labelCriarBolseiro = new JLabel("Criar Bolseiro:");
    JLabel labelNomeProjecto = new JLabel("Nome:");
    JLabel labelAcronimoProjecto = new JLabel("Acronimo:");
    JLabel labelDuracaoEstimadaProjecto = new JLabel("Duraçao estimada:");
    JLabel labelInvestigadorPrincipalProjecto = new JLabel("Selecione um Investigador principal:");
    JLabel labelCriarProjectoTitulo = new JLabel("Criar projecto:");

    JLabel labelCriarTarefa = new JLabel("Criar Tarefa");
    JLabel labelDuracaoEstimadaTarefa = new JLabel("Duração estimada:");
    JLabel labelSelecionarPessoa = new JLabel("Selecione uma pessoa responsável");

    JTextField caixaDuracaoEstimadaTarefa = new JTextField();

    String[] tiposTarefas = {"Design","Desenvolvimento","Documentação"};
    JComboBox comboBoxTipoTarefa = new JComboBox(tiposTarefas);


    ////////////////
    JLabel labelVariavelP1 = new JLabel();
    JLabel labelVariavelP2 = new JLabel();
    JLabel labelVariavelP3 = new JLabel();
    JLabel labelVariavelP4 = new JLabel();
    JLabel labelVariavelP5 = new JLabel();
    JLabel labelInvestigadorPrincipal = new JLabel("Investigador principal:");
    JLabel labelInicioProjecto = new JLabel("Iniciou:");
    JLabel labelDuracaoEstimada = new JLabel("Duração estimada:");

    JButton botaoInvestigador = new JButton("Investigadores");
    JButton botaoBolseiros = new JButton("Bolseiros");
    JButton botaoTarefas = new JButton("Tarefas");
    JButton botaoCustoEstimado = new JButton("Custo estimado");
    JButton botaoTarefasAtrasadas = new JButton("Tarefas atrasadas");
    JButton botaoTarefasConcluidas = new JButton("Tarefas concluidas");
    JButton botaoFinalizarTarefa = new JButton("Adicionar Tarefa");
    JButton botaoAdicionarTarefa = new JButton("Adicionar Tarefa");
    JButton botaoAdicionarInvestigador = new JButton("Selecionar");
    JButton botaoAdicionarDocente = new JButton("Adicionar Investigador");
    JButton botaoVoltarListaProjectos2 = new JButton("Voltar");
    JButton botaoSelecionarProjecto = new JButton("Selecionar Projecto");


    DefaultListModel listaTodosEnvolvidosObjetos = new DefaultListModel();
    JList listaJTodosEnvolvidos = new JList(listaTodosEnvolvidosObjetos);
    JScrollPane scrollerTodosEnvolvidos = new JScrollPane(listaJTodosEnvolvidos);


    DefaultListModel listaInvestigadoresEnvolvidosObjetos = new DefaultListModel();
    JList listaJInvestigadoresEnvolvidos = new JList(listaInvestigadoresEnvolvidosObjetos);
    JScrollPane scrollerInvestigadoresEnvolvidos = new JScrollPane(listaJInvestigadoresEnvolvidos);

    DefaultListModel listaBolseirosEnvolvidosObjetos;
    JList listaJBolseirosEnvolvidos;
    JScrollPane scrollerBolseirosEnvolvidos;

    DefaultListModel listaTarefasObjetos =new DefaultListModel();
    JList listaJTarefas = new JList(listaTarefasObjetos);
    JScrollPane scrollerTarefas = new JScrollPane(listaJTarefas);

    DefaultListModel listaDocentesRestantes;
    JList listaJDocentesRestantes;
    JScrollPane scrollerDocentesRestantes;

    ////////////////
    JPanel panelPrincipal = new JPanel();
    ////////////////
    JPanel painelCriarTarefa = new JPanel(null);
    JPanel painelAbsolutoPrincipal = new JPanel(null);
    JPanel painelPerfilInformacao = new JPanel(null);
    JPanel painelDocentes = new JPanel(null);
    JPanel painelcriarDocente = new JPanel(null);
    JPanel painelEditarDocente = new JPanel(null);
    JPanel painelCriarBolseiro = new JPanel(null);
    JPanel painelListarProjectos = new JPanel(null);
    JPanel painelCriarProjectos = new JPanel(null);
    JPanel painelVerProjecto = new JPanel(null);

    String[] dayStrings = getDias();
    String[] monthStrings = getMonth(); //get month names
    String[] yearStrings = getYear();
    SpinnerListModel dayModel = new SpinnerListModel(dayStrings);
    JSpinner spinnerDay = new JSpinner(dayModel);
    SpinnerListModel monthModel = new SpinnerListModel(monthStrings);
    JSpinner spinnerMonth = new JSpinner(monthModel);
    SpinnerListModel yearModel = new SpinnerListModel(yearStrings);
    JSpinner spinnerYear = new JSpinner(yearModel);

    GregorianCalendar dataSelecionada = new GregorianCalendar();
    GregorianCalendar dataAtual = new GregorianCalendar();

    String[] types = {"Licenciado", "Mestre", "Doutorado"};
    JComboBox jComboBoxBolseiro = new JComboBox(types);

    Docente docenteSelecionado;
    int firstUseCriarTarefa=0;
    int firstUseListaBolseiros=0;
    int firstUseListaDocentes=0;
    int firstUseCriarDocente=0;
    int firstUsePaginaPrincipal=0;
    int firstUseCriarBolseiro=0;
    int firstUseListarProjectos=0;
    int firstUseCriarProjecto=0;
    int firstUseVerProjecto=0;

    UIDefaults defaults = UIManager.getLookAndFeelDefaults();
    Font font = defaults.getFont("Label.font");

    private Projecto projectoSelecionado;
    private ArrayList<Docente> docentesRestantes;



    public void menuCriarTarefa(){
        listaTodosEnvolvidosObjetos.removeAllElements();

        for(Pessoa i : projectoSelecionado.getListaDocentes()){
            listaTodosEnvolvidosObjetos.addElement(i.getNome());
            projectoSelecionado.getListaPessoas().add(i);
        }
        for(Pessoa i : projectoSelecionado.getListaBolseiros()){
            listaTodosEnvolvidosObjetos.addElement(i.getNome());
            projectoSelecionado.getListaPessoas().add(i);
        }
        if(firstUseCriarTarefa<1){
            labelCriarTarefa.setFont(new Font("Arial",1,40));

            labelCriarTarefa.setBounds(50,25,300,50);
            labelDuracaoEstimadaTarefa.setBounds(50,100,150,25);
            labelSelecionarPessoa.setBounds(50,150,200,25);

            caixaDuracaoEstimadaTarefa.setBounds(175,100,50,25);

            scrollerTodosEnvolvidos.setBounds(50,175,300,500);

            comboBoxTipoTarefa.setBounds(800,50,100,25);

            botaoFinalizarTarefa.setBounds(400,175,200,50);

            botaoFinalizarTarefa.addActionListener(new listenerfinalizarTarefa());

            painelCriarTarefa.add(botaoFinalizarTarefa);
            painelCriarTarefa.add(labelCriarTarefa);
            painelCriarTarefa.add(labelDuracaoEstimadaTarefa);
            painelCriarTarefa.add(labelSelecionarPessoa);
            painelCriarTarefa.add(caixaDuracaoEstimadaTarefa);
            painelCriarTarefa.add(scrollerTodosEnvolvidos);
            painelCriarTarefa.add(comboBoxTipoTarefa);
            firstUseCriarTarefa++;
        }
        panelPrincipal.removeAll();
        panelPrincipal.add(painelCriarTarefa);
        panelPrincipal.updateUI();


    }

    public void menuVerProjecto(Projecto projecto){
        this.projectoSelecionado=projecto;
        labelVariavelP1.setText(projecto.getNome());
        labelVariavelP2.setText(projecto.getAcronimo());
        labelVariavelP3.setText(String.format("%d/%d/%d",projecto.getGregorianCalendarInicio().get(0),projecto.getGregorianCalendarInicio().get(2),projecto.getGregorianCalendarInicio().get(1)));
        labelVariavelP4.setText(String.format("%d meses",projecto.getDuracao()));
        labelVariavelP5.setText(projecto.getInvestigadorPrincipal().getNome());


        listaBolseirosEnvolvidosObjetos = new DefaultListModel();
        listaJBolseirosEnvolvidos = new JList(listaBolseirosEnvolvidosObjetos);
        scrollerBolseirosEnvolvidos = new JScrollPane(listaJBolseirosEnvolvidos);

        for (Docente i : projecto.getListaDocentes()){
            listaInvestigadoresEnvolvidosObjetos.addElement(i.getNome());
        }
        for(Bolseiro i : projecto.getListaBolseiros()){
            listaBolseirosEnvolvidosObjetos.addElement(i.getNome());
        }

        if(firstUseVerProjecto<1){
            labelVariavelP1.setFont(new Font("Arial",1,40));
            labelVariavelP2.setFont(new Font("Arial",1,20));

            labelVariavelP1.setBounds(50,25,600,50);
            labelVariavelP2.setBounds(50,75,50,50);
            labelVariavelP3.setBounds(175,125,120,25);
            labelVariavelP4.setBounds(175,175,120,25);
            labelVariavelP5.setBounds(950,25,150,25);

            labelInicioProjecto.setBounds(50,125,70,25);
            labelDuracaoEstimada.setBounds(50,175,150,25);
            labelInvestigadorPrincipal.setBounds(800,25,150,25);

            botaoInvestigador.setBounds(50,225,200,50);
            botaoBolseiros.setBounds(50,275,200,50);
            botaoTarefas.setBounds(50,325,200,50);
            botaoCustoEstimado.setBounds(925,225,200,50);
            botaoTarefasAtrasadas.setBounds(925,275,200,50);
            botaoTarefasConcluidas.setBounds(925,325,200,50);
            botaoAdicionarDocente.setBounds(925,600,200,50);
            botaoVoltarListaProjectos2.setBounds(925,400,200,50);


            botaoInvestigador.addActionListener(new listenerVerInvestigadoresEnvolvidos());
            botaoBolseiros.addActionListener(new listenerVerBolseirosEnvolvidos());
            botaoAdicionarDocente.addActionListener(new listenerAdicionarDocente());
            botaoAdicionarInvestigador.addActionListener(new listenerSelecionarInvestigador());
            botaoVoltarListaProjectos2.addActionListener(new listenerListarProjectos());
            botaoTarefas.addActionListener(new listenerVerTarefasProjecto());
            botaoAdicionarTarefa.addActionListener(new listenerAdicionarTarefa());

            painelVerProjecto.add(botaoInvestigador);
            painelVerProjecto.add(botaoBolseiros);
            painelVerProjecto.add(botaoTarefas);
            painelVerProjecto.add(botaoCustoEstimado);
            painelVerProjecto.add(botaoTarefasAtrasadas);
            painelVerProjecto.add(botaoTarefasConcluidas);
            painelVerProjecto.add(botaoVoltarListaProjectos2);

            painelVerProjecto.add(labelVariavelP1);
            painelVerProjecto.add(labelVariavelP2);
            painelVerProjecto.add(labelVariavelP3);
            painelVerProjecto.add(labelVariavelP4);
            painelVerProjecto.add(labelVariavelP5);

            painelVerProjecto.add(labelInicioProjecto);
            painelVerProjecto.add(labelDuracaoEstimada);
            painelVerProjecto.add(labelInvestigadorPrincipal);
            firstUseCriarProjecto++;
        }
        panelPrincipal.removeAll();
        panelPrincipal.add(painelVerProjecto,BorderLayout.CENTER);
        panelPrincipal.updateUI();

    }


    public void menuCriarProjecto(){
        if(firstUseCriarProjecto<1){
            labelCriarProjectoTitulo.setFont(new Font("Arial", 0, 40));

            labelCriarProjectoTitulo.setBounds(400,50,400,50);
            labelNomeProjecto.setBounds(50,125,100,25);
            labelAcronimoProjecto.setBounds(50,175,100,25);
            labelDuracaoEstimadaProjecto.setBounds(50,225,150,25);
            labelInvestigadorPrincipalProjecto.setBounds(700,125,300,25);

            botaoVoltarListaProjectos.setBounds(50,275,100,50);
            botaoMakeProjecto.setBounds(200,275,100,50);

            caixaNomeProjecto.setBounds(200,125,225,25);
            caixaAcronimo.setBounds(200,175,225,25);
            caixaDuracaoEstimada.setBounds(200,225,225,25);


            botaoVoltarListaProjectos.addActionListener(new listenerListarProjectos());
            botaoMakeProjecto.addActionListener(new listenerConfirmarProjecto());

            painelCriarProjectos.add(botaoVoltarListaProjectos);
            painelCriarProjectos.add(botaoMakeProjecto);


            painelCriarProjectos.add(caixaNomeProjecto);
            painelCriarProjectos.add(caixaAcronimo);
            painelCriarProjectos.add(caixaDuracaoEstimada);

            painelCriarProjectos.add(labelCriarProjectoTitulo);
            painelCriarProjectos.add(labelNomeProjecto);
            painelCriarProjectos.add(labelAcronimoProjecto);
            painelCriarProjectos.add(labelDuracaoEstimadaProjecto);
            painelCriarProjectos.add(labelInvestigadorPrincipalProjecto);
            firstUseCriarProjecto++;
        }
        scrollerDocentes.setBounds(700,150,300,500);
        painelCriarProjectos.add(scrollerDocentes);

        panelPrincipal.removeAll();
        panelPrincipal.add(painelCriarProjectos,BorderLayout.CENTER);
        panelPrincipal.updateUI();
    }



    public void paginaPrincipal() {

        if(firstUsePaginaPrincipal<1) {
            panelPrincipal.setLayout(new BorderLayout());

            for (Docente i : cisuc.getListaDocentes()
            ) {
                listaDocenteObjetos.addElement(i.getNome());

            }
            for (Bolseiro i: cisuc.getListaBolseiros()) {
                listaBolseiroObjetos.addElement(i.getNome());
            }
            for (Projecto i: cisuc.getListaProjectos()) {
                listaProjectosObjetos.addElement(i.getNome());
            }

            listaDocentesRestantes = new DefaultListModel();
            listaJDocentesRestantes = new JList(listaDocentesRestantes);
            scrollerDocentesRestantes = new JScrollPane(listaJDocentesRestantes);


            framePrincipal.setTitle("CISUC");
            framePrincipal.setSize(1200, 900);
            framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            botaoListaBolseiros.setBounds(400, 150, 400, 75);
            botaoListaDocentes.setBounds(400, 275, 400, 75);
            botaoListaProjetos.setBounds(400, 400, 400, 75);
            botaoSaveExit.setBounds(400, 675, 400, 75);

            botaoListaBolseiros.addActionListener(new listenerVerBolseiros());
            botaoListaDocentes.addActionListener(new listenerDocenteInformacao());
            botaoListaProjetos.addActionListener(new listenerListarProjectos());

            painelAbsolutoPrincipal.add(botaoListaBolseiros);
            painelAbsolutoPrincipal.add(botaoListaDocentes);
            painelAbsolutoPrincipal.add(botaoListaProjetos);
            painelAbsolutoPrincipal.add(botaoSaveExit);

            firstUsePaginaPrincipal++;
        }
        panelPrincipal.removeAll();
        panelPrincipal.add(painelAbsolutoPrincipal, BorderLayout.CENTER);
        framePrincipal.add(panelPrincipal);
        framePrincipal.setVisible(true);
        panelPrincipal.updateUI();
    }

    public void menuListarBolseiros() {
        if(firstUseListaBolseiros<1) {




            botaoVerBolseiro.setBounds(400, 600, 400, 75);
            botaoCriarBolseiro.setBounds(400, 675, 400, 75);
            botaoVoltarPrincipal1.setBounds(400, 750, 400, 75);

            botaoVoltarPrincipal1.addActionListener(new listenerVoltar());
            botaoCriarBolseiro.addActionListener(new listenerCriarBolseiro());






            painelPerfilInformacao.add(botaoVoltarPrincipal1);
            painelPerfilInformacao.add(botaoVerBolseiro);
            painelPerfilInformacao.add(botaoCriarBolseiro);
            painelPerfilInformacao.add(scrollerBolseiros);
            firstUseListaBolseiros++;
        }
        scrollerBolseiros.setBounds(400, 150, 400, 450);
        panelPrincipal.removeAll();
        panelPrincipal.add(painelPerfilInformacao, BorderLayout.CENTER);
        panelPrincipal.updateUI();
    }

    public void menuListarProjectos() {
        scrollerProjectos.setBounds(400, 150, 400, 450);
        if(firstUseListarProjectos<1) {



            botaoVerInformacaoProjecto.setBounds(400, 600, 400, 75);
            botaoCriarProjecto.setBounds(400, 675, 400, 75);
            botaoVoltarPrincipal3.setBounds(400, 750, 400, 75);

            botaoVoltarPrincipal3.addActionListener(new listenerVoltar());
            botaoCriarProjecto.addActionListener(new listenerCriarProjecto());
            botaoVerInformacaoProjecto.addActionListener(new listenerEditarProjecto());







            scrollerProjectos.setBounds(400, 150, 400, 450);

            painelListarProjectos.add(botaoVoltarPrincipal3);
            painelListarProjectos.add(botaoVerInformacaoProjecto);
            painelListarProjectos.add(botaoCriarProjecto);
            firstUseListarProjectos++;
        }
        painelListarProjectos.add(scrollerProjectos);
        panelPrincipal.removeAll();
        panelPrincipal.add(painelListarProjectos, BorderLayout.CENTER);
        panelPrincipal.updateUI();
    }
    public void menuListarDocentes() {
        if(firstUseListaDocentes<1) {
            botaoVoltarPrincipal2.setBounds(400, 750, 400, 75);
            botaoVerDocente.setBounds(400, 600, 400, 75);
            botaoCriarDocente.setBounds(400, 675, 400, 75);

            botaoVoltarPrincipal2.addActionListener(new listenerVoltar());
            botaoCriarDocente.addActionListener(new listenerCriarDocente());
            botaoVerDocente.addActionListener(new listenerEditarDocente());



            painelDocentes.add(botaoVoltarPrincipal2);
            painelDocentes.add(botaoCriarDocente);
            painelDocentes.add(botaoVerDocente);
            firstUseListaDocentes++;
        }
        scrollerDocentes.setBounds(400, 150, 400, 450);
        painelDocentes.add(scrollerDocentes);

        panelPrincipal.removeAll();
        panelPrincipal.add(painelDocentes,BorderLayout.CENTER);
        painelDocentes.updateUI();
        panelPrincipal.updateUI();


    }

    public void menuCriarDocente() {
        if(firstUseCriarDocente<1) {
            labelCriarDocenteTitulo.setFont(new Font("Arial", 0, 20));

            labelEmailDocente.setFont(font);
            labelMecaDocente.setFont(font);
            labelAreaDocente.setFont(font);


            labelCriarDocenteTitulo.setBounds(50, 50, 300, 50);
            labelNomeDocente.setBounds(50, 125, 50, 25);
            labelEmailDocente.setBounds(50, 175, 50, 25);
            labelMecaDocente.setBounds(50, 225, 150, 25);
            labelAreaDocente.setBounds(50, 275, 150, 25);

            caixaNome.setBounds(200, 125, 225, 25);
            caixaEmail.setBounds(200, 175, 225, 25);
            caixaMeca.setBounds(200, 225, 225, 25);
            caixaArea.setBounds(200, 275, 225, 25);


            botaoVoltarListaDocentes.setBounds(50, 350, 150, 50);
            botaoMakeDocente.setBounds(250, 350, 150, 50);

            botaoVoltarListaDocentes.addActionListener(new listenerDocenteInformacao());
            botaoMakeDocente.addActionListener(new listenerConfirmarDocente());


            painelcriarDocente.add(labelCriarDocenteTitulo);
            painelcriarDocente.add(labelNomeDocente);
            painelcriarDocente.add(labelEmailDocente);
            painelcriarDocente.add(labelMecaDocente);
            painelcriarDocente.add(labelAreaDocente);

            painelcriarDocente.add(caixaNome);
            painelcriarDocente.add(caixaEmail);
            painelcriarDocente.add(caixaMeca);
            painelcriarDocente.add(caixaArea);


            painelcriarDocente.add(botaoVoltarListaDocentes);
            painelcriarDocente.add(botaoMakeDocente);
            firstUseCriarDocente++;
        }
        panelPrincipal.removeAll();
        panelPrincipal.add(painelcriarDocente);
        panelPrincipal.updateUI();

    }

    private void menuEditarDocente(Docente docente){
        labelVariavel1.setText(docente.getNome());
        labelVariavel2.setText(docente.getEmail());
        labelVariavel3.setText(new BigDecimal(docente.getNumeroMecanografico()).toPlainString());
        labelVariavel4.setText(docente.getAreaInvestigacao());

        labelVariavel1.setFont(new Font("Aral",0,40));
        labelVariavel2.setFont(new Font("Aral",0,20));
        labelVariavel3.setFont(new Font("Aral",0,20));
        labelVariavel4.setFont(new Font("Aral",0,20));
        labelEmailDocente.setFont(new Font("Aral",0,20));
        labelMecaDocente.setFont(new Font("Aral",0,20));
        labelAreaDocente.setFont(new Font("Aral",0,20));

        labelVariavel1.setBounds(100,25,600,45);
        labelVariavel2.setBounds(320,100,600,30);
        labelVariavel3.setBounds(320,150,600,30);
        labelVariavel4.setBounds(320,200,600,30);
        labelEmailDocente.setBounds(100,100,200,30);
        labelMecaDocente.setBounds(100,150,230,30);
        labelAreaDocente.setBounds(100,200,200,30);

        painelEditarDocente.add(labelVariavel1);
        painelEditarDocente.add(labelVariavel2);
        painelEditarDocente.add(labelVariavel3);
        painelEditarDocente.add(labelVariavel4);

        botaoVoltarVerInformacaoDocente.setBounds(75,300,200,100);
        botaoEditarNomeDocente.setBounds(700,35,225,25);
        botaoEditarEmailDocente.setBounds(700,100,225,25);
        botaoEditarNumeroDocente.setBounds(700,150,225,25);
        botaoEditarAreaDocente.setBounds(700,200,225,25);


        botaoVoltarVerInformacaoDocente.addActionListener(new listenerDocenteInformacao());
        botaoEditarNomeDocente.addActionListener(new listenerEditarNomeDocente());
        botaoEditarEmailDocente.addActionListener(new listenerEditarEmailDocente());
        botaoEditarNumeroDocente.addActionListener(new listenerEditarNumeroDocente());
        botaoEditarAreaDocente.addActionListener(new listenerEditarAreaDocente());

        painelEditarDocente.add(labelEmailDocente);
        painelEditarDocente.add(labelMecaDocente);
        painelEditarDocente.add(labelAreaDocente);

        painelEditarDocente.add(botaoVoltarVerInformacaoDocente);
        painelEditarDocente.add(botaoEditarNomeDocente);
        painelEditarDocente.add(botaoEditarEmailDocente);
        painelEditarDocente.add(botaoEditarNumeroDocente);
        painelEditarDocente.add(botaoEditarAreaDocente);

        panelPrincipal.removeAll();
        panelPrincipal.add(painelEditarDocente);
        panelPrincipal.updateUI();

    }

    private void menuCriarBolseiro(){
        if(firstUseCriarBolseiro<1){

            labelCriarBolseiro.setFont(new Font("Arial", 0, 40));
            botaoCheckDataBolseiro.setFont(new Font("Arial",1,10));





            labelCriarBolseiro.setBounds(450, 50, 300, 50);
            labelNomeBolseiro.setBounds(50, 125, 50, 25);
            labelEmailBolseiro.setBounds(50, 175, 50, 25);
            labelDataFinalBolseiro.setBounds(50, 225, 150, 25);

            botaoCheckDataBolseiro.setBounds(290,225,85,20);
            botaoVoltarListaBolseiros.setBounds(50,350,150,50);
            botaoMakeBolseiro.setBounds(225,350,150,50);

            jComboBoxBolseiro.setBounds(50,275,150,25);

            jComboBoxBolseiro.addActionListener(new listenerComboBolseiros());

            botaoCheckDataBolseiro.addActionListener(new listenerCheckDataDocente());
            botaoVoltarListaBolseiros.addActionListener(new listenerVerBolseiros());
            botaoMakeBolseiro.addActionListener(new listenerConfirmarBolseiro());
            botaoSelecionarProjecto.addActionListener(new listenerSelecionarProjecto());

            caixaNomeCriarBolseiro.setBounds(150, 125, 225, 25);
            caixaEmailCriarBolseiro.setBounds(150, 175, 225, 25);

            spinnerDay.setBounds(150,225,35,20);
            spinnerMonth.setBounds(190,225,35,20);
            spinnerYear.setBounds(230,225,50,20);

            painelCriarBolseiro.add(botaoCheckDataBolseiro);
            painelCriarBolseiro.add(botaoVoltarListaBolseiros);
            painelCriarBolseiro.add(botaoMakeBolseiro);

            painelCriarBolseiro.add(jComboBoxBolseiro);

            painelCriarBolseiro.add(labelCriarBolseiro);
            painelCriarBolseiro.add(labelNomeBolseiro);
            painelCriarBolseiro.add(labelEmailBolseiro);
            painelCriarBolseiro.add(labelDataInicioBolseiro);
            painelCriarBolseiro.add(labelDataFinalBolseiro);

            painelCriarBolseiro.add(caixaNomeCriarBolseiro);
            painelCriarBolseiro.add(caixaEmailCriarBolseiro);

            painelCriarBolseiro.add(spinnerDay);
            painelCriarBolseiro.add(spinnerMonth);
            painelCriarBolseiro.add(spinnerYear);
            firstUseCriarBolseiro++;

        }
        panelPrincipal.removeAll();
        panelPrincipal.add(painelCriarBolseiro,BorderLayout.CENTER);
        panelPrincipal.updateUI();
    }

    private String[] getDias(){
        ArrayList<String> diasArray = new ArrayList<>();
        for(int i=1;i<32;i++){
            diasArray.add(Integer.toString(i));
        }
        String[] dias = new String[diasArray.size()];
        dias = diasArray.toArray(dias);
        return dias;

    }
    private String[] getMonth(){
        ArrayList<String> mesesArray = new ArrayList<>();
        for(int i=1;i<13;i++){
            mesesArray.add(Integer.toString(i));
        }
        String[] meses = new String[mesesArray.size()];
        meses = mesesArray.toArray(meses);
        return meses;

    }
    private String[] getYear(){
        ArrayList<String> anosArray = new ArrayList<>();
        for(int i=Calendar.getInstance().get(Calendar.YEAR);i<3000;i++){
            anosArray.add(Integer.toString(i));
        }
        String[] anos = new String[anosArray.size()];
        anos = anosArray.toArray(anos);
        return anos;

    }

    private void finalizarProjecto(){
        String nome = caixaNomeProjecto.getText();
        String acronimo = caixaAcronimo.getText();
        int duracao = Integer.parseInt(caixaDuracaoEstimada.getText());
        GregorianCalendar dataInicio = dataAtual;
        Docente investigador = cisuc.getListaDocentes().get(docenteLista.getSelectedIndex());

        Projecto novo = new Projecto(nome,acronimo,dataInicio,duracao,investigador);
        cisuc.getListaProjectos().add(novo);
        this.listaProjectosObjetos.addElement(novo.getNome());

    }

    private void finalizarBolseiro(){
        String nome=caixaNomeCriarBolseiro.getText();
        String email=caixaEmailCriarBolseiro.getText();
        GregorianCalendar dataInicio = dataAtual;
        GregorianCalendar dataFinal = dataSelecionada;
        Docente orientador = cisuc.getListaDocentes().get(listaJInvestigadoresEnvolvidos.getSelectedIndex());
        String selecionado= (String) jComboBoxBolseiro.getSelectedItem();

        if(selecionado.equals("Licenciado") ){
            Licenciado novo = new Licenciado(dataInicio,dataFinal,nome,email,orientador);
            novo.setProjectoAssociado(projectoSelecionado);
            cisuc.getListaBolseiros().add(novo);
            projectoSelecionado.getListaBolseiros().add(novo);
            this.listaBolseiroObjetos.addElement(novo.getNome());
        }else if(selecionado.equals("Mestre")){
            Mestre novo = new Mestre(dataInicio,dataFinal,nome,email,orientador);
            novo.setProjectoAssociado(projectoSelecionado);
            cisuc.getListaBolseiros().add(novo);
            projectoSelecionado.getListaBolseiros().add(novo);
            this.listaBolseiroObjetos.addElement(novo.getNome());
        }
        else if(selecionado.equals("Doutorado")){
            Doutorado novo = new Doutorado(dataInicio,dataFinal,nome,email);
            novo.setProjectoAssociado(projectoSelecionado);
            cisuc.getListaBolseiros().add(novo);
            projectoSelecionado.getListaBolseiros().add(novo);
            this.listaBolseiroObjetos.addElement(novo.getNome());
        }


    }

    private void finalizarTarefa(){
        String tipoTarefa= (String) comboBoxTipoTarefa.getSelectedItem();
        Double duracao = Double.parseDouble(caixaDuracaoEstimadaTarefa.getText());
        Pessoa responsavel = projectoSelecionado.getListaPessoas().get(listaJTodosEnvolvidos.getSelectedIndex());
        if(tipoTarefa.equals("Design")) {
            Design nova = new Design(dataAtual, duracao, responsavel);
            projectoSelecionado.getListaTarefas().add(nova);
            listaTarefasObjetos.addElement(tipoTarefa);
        }
        if(tipoTarefa.equals("Documentação")) {
            Documentacao nova = new Documentacao(dataAtual, duracao, responsavel);
            projectoSelecionado.getListaTarefas().add(nova);
            listaTarefasObjetos.addElement(tipoTarefa);
        }
        if(tipoTarefa.equals("Desenvolvimento")) {
            Desenvolvimento nova = new Desenvolvimento(dataAtual, duracao, responsavel);
            projectoSelecionado.getListaTarefas().add(nova);
            listaTarefasObjetos.addElement(tipoTarefa);
        }

    }

    private void finalizarDocente(){

        cisuc.getListaDocentes().add(new Docente(Integer.parseInt(caixaMeca.getText()),caixaArea.getText(),caixaNome.getText(),caixaEmail.getText()));
        this.listaDocenteObjetos.addElement(cisuc.getListaDocentes().get(cisuc.getListaDocentes().size()-1).getNome());
        System.out.println(cisuc.getListaDocentes().get(0).getNome());
    }



    private class listenerCheckDataDocente implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            int dia=Integer.parseInt(spinnerDay.getValue().toString());
            int mes=Integer.parseInt(spinnerMonth.getValue().toString());
            int ano=Integer.parseInt(spinnerYear.getValue().toString());

            dataSelecionada.set(ano,mes,dia);
            labelVariavel4.setText(String.format("%d/%d/%d",dataSelecionada.get(0),dataSelecionada.get(2),dataSelecionada.get(1)));
            labelVariavel4.setBounds(240,275,50,25);
            painelCriarBolseiro.add(labelVariavel4);
            painelCriarBolseiro.updateUI();
        }
    }

    private class listenerComboBolseiros implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JComboBox comboBox = (JComboBox) e.getSource();
            String selecionado= (String) comboBox.getSelectedItem();
            scrollerProjectos.setBounds(600,125,200,500);
            botaoSelecionarProjecto.setBounds(600,675,200,50);
//            if(selecionado.equals("Licenciado") || selecionado.equals("Mestre")){
//                painelCriarBolseiro.add(scrollerDocentes);
//            }else if(selecionado.equals("Doutorado")){
//                painelCriarBolseiro.remove(scrollerDocentes);
//            }
            painelCriarBolseiro.add(scrollerProjectos);
            painelCriarBolseiro.add(botaoSelecionarProjecto);
            panelPrincipal.updateUI();
        }
    }


    private class listenerEditarNomeDocente implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nomeNovo = JOptionPane.showInputDialog(null,"Nome novo:","Alterar nome",JOptionPane.QUESTION_MESSAGE);
            if(nomeNovo!= null && nomeNovo.length()>0) {
                cisuc.getListaDocentes().get(docenteLista.getSelectedIndex()).setNome(nomeNovo);
                listaDocenteObjetos.set(docenteLista.getSelectedIndex(), cisuc.getListaDocentes().get(docenteLista.getSelectedIndex()).getNome());
                labelVariavel1.setText(cisuc.getListaDocentes().get(docenteLista.getSelectedIndex()).getNome());
            }
            painelEditarDocente.updateUI();

        }
    }
    private class listenerEditarEmailDocente implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String emailNovo = JOptionPane.showInputDialog(null,"Email novo:","Alterar email",JOptionPane.QUESTION_MESSAGE);
            if(emailNovo!= null && emailNovo.length()>0) {
                cisuc.getListaDocentes().get(docenteLista.getSelectedIndex()).setEmail(emailNovo);;
                labelVariavel2.setText(cisuc.getListaDocentes().get(docenteLista.getSelectedIndex()).getEmail());
            }
            painelEditarDocente.updateUI();

        }
    }
    private class listenerEditarNumeroDocente implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String NumeroNovo = JOptionPane.showInputDialog(null,"Numero novo:","Alterar Numero",JOptionPane.QUESTION_MESSAGE);
            if(NumeroNovo!= null && NumeroNovo.length()>0) {
                cisuc.getListaDocentes().get(docenteLista.getSelectedIndex()).setNumeroMecanografico(Double.parseDouble(NumeroNovo));
                labelVariavel3.setText(new BigDecimal(cisuc.getListaDocentes().get(docenteLista.getSelectedIndex()).getNumeroMecanografico()).toString());
            }
            painelEditarDocente.updateUI();

        }
    }
    private class listenerEditarAreaDocente implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String AreaNovo = JOptionPane.showInputDialog(null,"Area novo:","Alterar area",JOptionPane.QUESTION_MESSAGE);
            if(AreaNovo!= null && AreaNovo.length()>0) {
                cisuc.getListaDocentes().get(docenteLista.getSelectedIndex()).setAreaInvestigacao(AreaNovo);
                labelVariavel4.setText(cisuc.getListaDocentes().get(docenteLista.getSelectedIndex()).getAreaInvestigacao());
            }
            painelEditarDocente.updateUI();

        }
    }

    private class listenerVerBolseiros implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            menuListarBolseiros();
        }
    }

    private class listenerDocenteInformacao implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            menuListarDocentes();
        }
    }

    private class listenerVoltar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            paginaPrincipal();
        }
    }

    private class listenerCriarDocente implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            menuCriarDocente();
        }
    }
    private class listenerCriarBolseiro implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            menuCriarBolseiro();
        }
    }
    private class listenerCriarProjecto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            menuCriarProjecto();
        }
    }
    private class listenerVerInvestigadoresEnvolvidos implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            scrollerInvestigadoresEnvolvidos.setBounds(400,200,400,600);
            painelVerProjecto.remove(scrollerBolseirosEnvolvidos);
            painelVerProjecto.remove(scrollerProjectos);
            painelVerProjecto.remove(scrollerTarefas);
            painelVerProjecto.remove(botaoAdicionarTarefa);

            painelVerProjecto.add(botaoAdicionarDocente);
            painelVerProjecto.add(scrollerInvestigadoresEnvolvidos);
            panelPrincipal.updateUI();
        }
    }
    private class listenerVerBolseirosEnvolvidos implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            scrollerBolseirosEnvolvidos.setBounds(400,200,400,600);
            painelVerProjecto.remove(scrollerInvestigadoresEnvolvidos);
            painelVerProjecto.remove(scrollerProjectos);
            painelVerProjecto.remove(botaoAdicionarDocente);
            painelVerProjecto.remove(scrollerDocentesRestantes);
            painelVerProjecto.remove(botaoAdicionarDocente);
            painelVerProjecto.remove(scrollerTarefas);
            painelVerProjecto.remove(botaoAdicionarTarefa);

            painelVerProjecto.add(scrollerBolseirosEnvolvidos);

            panelPrincipal.updateUI();
        }
    }
    private class listenerVerTarefasProjecto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            scrollerTarefas.setBounds(400,200,400,600);
            botaoAdicionarTarefa.setBounds(50,600,200,50);
            painelVerProjecto.remove(scrollerInvestigadoresEnvolvidos);
            painelVerProjecto.remove(scrollerProjectos);
            painelVerProjecto.remove(botaoAdicionarDocente);
            painelVerProjecto.remove(scrollerDocentesRestantes);
            painelVerProjecto.remove(botaoAdicionarDocente);

            painelVerProjecto.add(botaoAdicionarTarefa);
            painelVerProjecto.add(scrollerTarefas);
            panelPrincipal.updateUI();
        }
    }
    private class listenerConfirmarDocente implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            finalizarDocente();
            menuListarDocentes();
        }
    }
    private class listenerConfirmarBolseiro implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            finalizarBolseiro();
            menuListarBolseiros();
        }
    }
    private class listenerConfirmarProjecto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            finalizarProjecto();
            menuListarProjectos();
        }
    }

    private class listenerEditarDocente implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            menuEditarDocente(cisuc.getListaDocentes().get(docenteLista.getSelectedIndex()));
        }
    }
    private class listenerfinalizarTarefa implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            finalizarTarefa();
            menuVerProjecto(projectoSelecionado);
        }
    }
    private class listenerEditarProjecto implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            menuVerProjecto(cisuc.getListaProjectos().get(listaJProjectos.getSelectedIndex()));
        }
    }
    private class listenerListarProjectos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            menuListarProjectos();
        }
    }
    private class listenerAdicionarTarefa implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            menuCriarTarefa();
        }
    }
    private class listenerAdicionarDocente implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            docentesRestantes=new ArrayList<>();

            listaDocentesRestantes.removeAllElements();
            botaoAdicionarInvestigador.setBounds(925,700,200,50);
            int aux=0;
            for(Docente i : cisuc.getListaDocentes()){
                aux=0;
                for(Docente j : projectoSelecionado.getListaDocentes()){
                    if(i==j){
                        aux=1;
                    }

                }
                if(aux!=1){
                    listaDocentesRestantes.addElement(i.getNome());
                    docentesRestantes.add(i);
                }
            }
            scrollerDocentesRestantes.setBounds(50,400,200,400);
            painelVerProjecto.add(botaoAdicionarInvestigador);
            painelVerProjecto.add(scrollerDocentesRestantes);
            panelPrincipal.updateUI();

        }
    }


    private class listenerSelecionarInvestigador implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            int index=listaJDocentesRestantes.getSelectedIndex();
            if(index!=-1) {
                projectoSelecionado.getListaDocentes().add(docentesRestantes.get(index));
                listaInvestigadoresEnvolvidosObjetos.addElement(docentesRestantes.get(index).getNome());
                listaJDocentesRestantes.remove(index);
                docentesRestantes.remove(index);

                listaDocentesRestantes.remove(index);


                scrollerDocentesRestantes.updateUI();
                panelPrincipal.updateUI();
            }
        }
    }
    private class listenerSelecionarProjecto implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            projectoSelecionado = cisuc.getListaProjectos().get(listaJProjectos.getSelectedIndex());
            listaInvestigadoresEnvolvidosObjetos.removeAllElements();
            for(Docente i:projectoSelecionado.getListaDocentes()){
                listaInvestigadoresEnvolvidosObjetos.addElement(i.getNome());
            }
            labelVariavelProjecto.setText(projectoSelecionado.getNome());
            labelVariavelProjecto.setBounds(600,100,200,25);
            scrollerInvestigadoresEnvolvidos.setBounds(600,125,200,500);
            painelCriarBolseiro.remove(scrollerProjectos);
            painelCriarBolseiro.remove(botaoSelecionarProjecto);
            painelCriarBolseiro.add(labelVariavelProjecto);
            painelCriarBolseiro.add(scrollerInvestigadoresEnvolvidos);
            panelPrincipal.updateUI();
        }
    }


}










