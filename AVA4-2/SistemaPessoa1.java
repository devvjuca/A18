import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SistemaPessoa1 extends JPanel {

    private String versaoSistema = "12.1.2024";
    private String nomeUsuario = "denys.silva";
    private String dataAcesso;

    public SistemaPessoa1() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
        dataAcesso = dateFormat.format(new Date());

        JFrame principal = new JFrame("Sistema Pessoa");
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setSize(800, 800);

        JMenuBar menuPrincipal = new JMenuBar();
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuVisualizacao = new JMenu("Visualização");
        JMenu menuSair = new JMenu("Sair");

        menuSair.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent e) {
                System.exit(0);
            }
            public void menuDeselected(javax.swing.event.MenuEvent e) { }
            public void menuCanceled(javax.swing.event.MenuEvent e) { }
        });

        menuPrincipal.add(menuCadastro);
        menuPrincipal.add(menuVisualizacao);
        menuPrincipal.add(menuSair);

        JMenuItem itemMenuCadastroUsuarios = new JMenuItem("Usuários");
        JMenuItem itemMenuCadastroPessoas = new JMenuItem("Pessoas");
        menuCadastro.add(itemMenuCadastroUsuarios);
        menuCadastro.add(itemMenuCadastroPessoas);

        JMenuItem itemMenuVisualizacaoListaUsuarios = new JMenuItem("Lista de usuários");
        JMenuItem itemMenuVisualizacaoListaPessoas = new JMenuItem("Lista de pessoas");
        menuVisualizacao.add(itemMenuVisualizacaoListaUsuarios);
        menuVisualizacao.add(itemMenuVisualizacaoListaPessoas);

        JTextArea areaTrabalho = new JTextArea();
        JPanel painelRodape = new JPanel();
        JLabel labelRodape = new JLabel("Versão: " + versaoSistema + "    Usuário: " + nomeUsuario + "    Data de acesso: " + dataAcesso);
        painelRodape.add(labelRodape);

        principal.getContentPane().add(BorderLayout.NORTH, menuPrincipal);
        principal.getContentPane().add(BorderLayout.CENTER, areaTrabalho);
        principal.getContentPane().add(BorderLayout.SOUTH, painelRodape);

        itemMenuCadastroUsuarios.addActionListener(e -> new CadastroUsuarios(principal).abrirDialogo());
        itemMenuCadastroPessoas.addActionListener(e -> new CadastroPessoas(principal).abrirDialogo());
        itemMenuVisualizacaoListaUsuarios.addActionListener(e -> new ListaUsuarios(principal).abrirDialogo());
        itemMenuVisualizacaoListaPessoas.addActionListener(e -> new Listapessoas(principal).abrirDialogo());

        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }

    public static void main(String[] args) {
        new SistemaPessoa1();
    }
}