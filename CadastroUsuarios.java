import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CadastroUsuarios().setVisible(true);
        });
    @Override
    public void exibir() {
        JDialog dialog = new JDialog(principal, "Cadastro de Usuários", true);
        dialog.setSize(600, 300);
        dialog.setLayout(new BorderLayout());
        JLabel titulo = new JLabel("Cadastro de Usuários", SwingConstants.CENTER);
        dialog.add(titulo, BorderLayout.NORTH);
        JPanel painelCampos = new JPanel(new GridLayout(4, 2, 5, 5));
        painelCampos.add(new JLabel("Usuário:"));
        painelCampos.add(new JTextField(25));
        painelCampos.add(new JLabel("Senha:"));
        painelCampos.add(new JPasswordField(15));
        painelCampos.add(new JLabel("Email:"));
        painelCampos.add(new JTextField(30));
        painelCampos.add(new JLabel("Ativo:"));
        painelCampos.add(new JRadioButton());
        dialog.add(painelCampos, BorderLayout.CENTER);
        dialog.add(new BotoesCadastro(dialog).criar(), BorderLayout.SOUTH);
        dialog.setLocationRelativeTo(principal);
        dialog.setVisible(true);
    }
}