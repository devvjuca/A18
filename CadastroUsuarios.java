import java.awt.*;
import javax.swing.*;

public class CadastroUsuarios extends JFrame {
    private JTextField txtUsuario, txtSenha, txtEmail;
    private JRadioButton rbAtivo;
    private JButton btnIncluir, btnAlterar, btnExcluir, btnConsultar, btnCancelar, btnSair;

    public CadastroUsuarios() {
        setTitle("Sistema de Pessoa - Cadastro de Usuários");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 5, 5));

        // Campos de texto e rótulos
        panel.add(new JLabel("Usuário:"));
        txtUsuario = new JTextField();
        panel.add(txtUsuario);

        panel.add(new JLabel("Senha:"));
        txtSenha = new JTextField();
        panel.add(txtSenha);

        panel.add(new JLabel("Email:"));
        txtEmail = new JTextField();
        panel.add(txtEmail);

        // RadioButton Ativo
        panel.add(new JLabel("Ativo:"));
        rbAtivo = new JRadioButton();
        panel.add(rbAtivo);

        // Botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        btnIncluir = new JButton("Incluir");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnConsultar = new JButton("Consultar");
        btnCancelar = new JButton("Cancelar");
        btnSair = new JButton("Sair");

        buttonPanel.add(btnIncluir);
        buttonPanel.add(btnAlterar);
        buttonPanel.add(btnExcluir);
        buttonPanel.add(btnConsultar);
        buttonPanel.add(btnCancelar);
        buttonPanel.add(btnSair);

        // Adicionando listeners para os botões
        btnSair.addActionListener(e -> System.exit(0));

        // Layout principal
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CadastroUsuarios().setVisible(true);
        });
    }
}