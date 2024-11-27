import java.awt.*;
import javax.swing.*;
import java.awt.*;

public class CadastroPessoas extends JFrame {
    private JTextField txtNome, txtEndereco, txtCidade, txtUF, txtEmail, txtTelefone;
    private JComboBox<String> cbSexo;
    private JButton btnIncluir, btnAlterar, btnExcluir, btnConsultar, btnCancelar, btnSair;
    public CadastroPessoas() {
        setTitle("Sistema de Pessoa - Cadastro de Pessoas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 5, 5)); // Layout de grade para os campos
        // Adicionando campos e rótulos ao painel
        panel.add(new JLabel("Nome:"));
        txtNome = new JTextField();
        panel.add(txtNome);
        panel.add(new JLabel("Endereço:"));
        txtEndereco = new JTextField();
        panel.add(txtEndereco);
        panel.add(new JLabel("Cidade:"));
        txtCidade = new JTextField();
        panel.add(txtCidade);
        panel.add(new JLabel("UF:"));
        txtUF = new JTextField(2); // Limita o campo para um estado de 2 caracteres
        panel.add(txtUF);
        panel.add(new JLabel("Email:"));
        txtEmail = new JTextField();
        panel.add(txtEmail);
        panel.add(new JLabel("Telefone:"));
        txtTelefone = new JTextField();
        panel.add(txtTelefone);
        panel.add(new JLabel("Sexo:"));
        cbSexo = new JComboBox<>(new String[] { "Masculino", "Feminino", "Outro" });
        panel.add(cbSexo);
        // Painel de botões
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
        // Adicionando eventos
        btnSair.addActionListener(e -> System.exit(0)); // Fecha o programa ao clicar em Sair
public class CadastroPessoas extends CadastroVisualizacao {

        // Adicionando os painéis à janela principal
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    public CadastroPessoas(JFrame principal) {
        super(principal);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroPessoas().setVisible(true));
    @Override
    public void exibir() {
        JDialog dialog = new JDialog(principal, "Cadastro de Pessoas", true);
        dialog.setSize(600, 300);
        dialog.setLayout(new BorderLayout());
        JLabel titulo = new JLabel("Cadastro de Pessoas", SwingConstants.CENTER);
        dialog.add(titulo, BorderLayout.NORTH);
        JPanel painelCampos = new JPanel(new GridLayout(7, 2, 5, 5));
        painelCampos.add(new JLabel("Nome:"));
        painelCampos.add(new JTextField(40));
        painelCampos.add(new JLabel("Endereço:"));
        painelCampos.add(new JTextField(60));
        painelCampos.add(new JLabel("Cidade:"));
        painelCampos.add(new JTextField(40));
        painelCampos.add(new JLabel("UF:"));
        painelCampos.add(new JTextField(2));
        painelCampos.add(new JLabel("Email:"));
        painelCampos.add(new JTextField(30));
        painelCampos.add(new JLabel("Telefone:"));
        painelCampos.add(new JTextField(20));
        painelCampos.add(new JLabel("Sexo:"));
        painelCampos.add(new JComboBox<>(new String[]{"Masculino", "Feminino"}));
        dialog.add(painelCampos, BorderLayout.CENTER);
        dialog.add(new BotoesCadastro(dialog).criar(), BorderLayout.SOUTH);
        dialog.setLocationRelativeTo(principal);
        dialog.setVisible(true);
    }
}