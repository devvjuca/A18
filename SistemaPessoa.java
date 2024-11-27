import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SistemaPessoa {
    public static void main(String[] args) {
        String nomeUsuario = "denys.silva";
        String versaoSistema = "12.1.2024";
        
        // Cria a janela principal do sistema
        new SistemaPessoa().iniciarSistema(nomeUsuario, versaoSistema);
    }

    public void iniciarSistema(String nomeUsuario, String versaoSistema) {
        JFrame principal = new JFrame("Sistema Pessoa");
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setSize(800, 800);
        
        // Cria instâncias das outras classes para adicionar os componentes à janela
        Menu menu = new Menu(principal);
        Rodape rodape = new Rodape(versaoSistema, nomeUsuario);
        
        // Área de trabalho (central)
        JTextArea areaTrabalho = new JTextArea();
        
        // Adiciona componentes ao frame principal
        principal.getContentPane().add(BorderLayout.NORTH, menu.getMenuPrincipal());
        principal.getContentPane().add(BorderLayout.CENTER, areaTrabalho);
        principal.getContentPane().add(BorderLayout.SOUTH, rodape.getPainelRodape());

        principal.setLocationRelativeTo(null); // Centraliza a janela
        principal.setVisible(true); // Torna a janela visível
    }
}

// Classe Menu
class Menu {
    private JMenuBar menuPrincipal;

    public Menu(JFrame principal) {
        menuPrincipal = new JMenuBar(); // Não declarar novamente

        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuVisualizacao = new JMenu("Visualização");
        JMenu menuSair = new JMenu("Sair");

        // Adicionar itens aos menus...
    }

    public JMenuBar getMenuPrincipal() {
        return menuPrincipal;
    }
}

// Classe Rodape
class Rodape {
    private JPanel painelRodape;
    private JLabel labelRodape;

    public Rodape(String versaoSistema, String nomeUsuario) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
        String dataAcesso = dateFormat.format(new Date());

        painelRodape = new JPanel();
        labelRodape = new JLabel("Versão: " + versaoSistema + " Usuário: " + nomeUsuario + "           Data de acesso: " + dataAcesso);
        painelRodape.add(labelRodape);
    }

    public JPanel getPainelRodape() {
        return painelRodape;
    }
}