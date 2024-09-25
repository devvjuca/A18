Avaliação 2 Parcial – Cardápio – Melhoria – Cadastro de Clientes


import java.util.Scanner;

public class Cardapio {
    private static final int LIM_REG = 100;
    private static final String[][] produtos = new String[LIM_REG][4];
    private static final String[][] clientes = new String[LIM_REG][3]; // [Nome, Telefone, Email]
    private static int totalProdutos = 0;
    private static int totalClientes = 0;
    private static Scanner entradaDados = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenuPrincipal();
            opcao = entradaDados.nextInt();
            entradaDados.nextLine();

            switch (opcao) {
                case 1:
                    menuCadastroProduto();
                    break;
                case 2:
                    menuCadastroCliente(); // Novo menu para clientes
                    break;
                case 3:
                    imprimirCardapio();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\nMenu Principal:");
        System.out.println("1. Cadastro de Produtos");
        System.out.println("2. Cadastro de Clientes");
        System.out.println("3. Imprimir Cardápio");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void menuCadastroProduto() {
        System.out.println("\nCadastro de Produtos:");
        System.out.println("1. Incluir Produto");
        System.out.println("2. Alterar Produto");
        System.out.println("3. Excluir Produto");
        System.out.println("4. Consultar Produto");
        System.out.print("Escolha uma opção: ");
        int opcao = entradaDados.nextInt();
        entradaDados.nextLine();

        switch (opcao) {
            case 1:
                incluirProduto();
                break;
            case 2:
                alterarProduto();
                break;
            case 3:
                excluirProduto();
                break;
            case 4:
                consultarProduto();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void menuCadastroCliente() {
        System.out.println("\nCadastro de Clientes:");
        System.out.println("1. Incluir Cliente");
        System.out.println("2. Alterar Cliente");
        System.out.println("3. Excluir Cliente");
        System.out.println("4. Consultar Cliente");
        System.out.print("Escolha uma opção: ");
        int opcao = entradaDados.nextInt();
        entradaDados.nextLine();

        switch (opcao) {
            case 1:
                incluirCliente();
                break;
            case 2:
                alterarCliente();
                break;
            case 3:
                excluirCliente();
                break;
            case 4:
                consultarCliente();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void incluirCliente() {
        if (totalClientes >= LIM_REG) {
            System.out.println("Cadastro de clientes cheio.");
            return;
        }

        System.out.print("Nome: ");
        String nome = entradaDados.nextLine();

        System.out.print("Telefone: ");
        String telefone = entradaDados.nextLine();

        System.out.print("Email: ");
        String email = entradaDados.nextLine();

        clientes[totalClientes][0] = nome;
        clientes[totalClientes][1] = telefone;
        clientes[totalClientes][2] = email;
        totalClientes++;

        System.out.println("Cliente cadastrado com sucesso.");
    }

    private static void alterarCliente() {
        System.out.print("Digite o nome do cliente a alterar: ");
        String nome = entradaDados.nextLine();

        int indice = buscarClientePorNome(nome);
        if (indice == -1) {
            System.out.println("Cliente não existe no cadastro.");
            return;
        }

        System.out.println("Cliente atual: " + clientes[indice][0]);
        System.out.println("Telefone atual: " + clientes[indice][1]);
        System.out.println("Email atual: " + clientes[indice][2]);

        System.out.print("Novo Nome [Enter para manter o atual]: ");
        String novoNome = entradaDados.nextLine();
        if (!novoNome.isEmpty()) {
            clientes[indice][0] = novoNome;
        }

        System.out.print("Novo Telefone [Enter para manter o atual]: ");
        String novoTelefone = entradaDados.nextLine();
        if (!novoTelefone.isEmpty()) {
            clientes[indice][1] = novoTelefone;
        }

        System.out.print("Novo Email [Enter para manter o atual]: ");
        String novoEmail = entradaDados.nextLine();
        if (!novoEmail.isEmpty()) {
            clientes[indice][2] = novoEmail;
        }

        System.out.println("Cliente alterado com sucesso.");
    }

    private static void excluirCliente() {
        System.out.print("Digite o nome do cliente a excluir: ");
        String nome = entradaDados.nextLine();

        int indice = buscarClientePorNome(nome);
        if (indice == -1) {
            System.out.println("Cliente não existe no cadastro.");
            return;
        }

        for (int i = indice; i < totalClientes - 1; i++) {
            clientes[i] = clientes[i + 1];
        }
        totalClientes--;
        System.out.println("Cliente excluído com sucesso.");
    }

    private static void consultarCliente() {
        System.out.print("Digite o nome do cliente: ");
        String nome = entradaDados.nextLine();

        int indice = buscarClientePorNome(nome);
        if (indice == -1) {
            System.out.println("Cliente não existe no cadastro.");
            return;
        }

        System.out.println("Nome: " + clientes[indice][0]);
        System.out.println("Telefone: " + clientes[indice][1]);
        System.out.println("Email: " + clientes[indice][2]);
    }

    private static int buscarClientePorNome(String nome) {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i][0].equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }

    private static void incluirProduto() {
        if (totalProdutos >= LIM_REG) {
            System.out.println("Cadastro de produtos cheio.");
            return;
        }

        String codigo;
        do {
            System.out.print("Código (6 caracteres alfanuméricos): ");
            codigo = entradaDados.nextLine().toUpperCase();
            if (codigo.length() != 6) {
                System.out.println("Código inválido! Deve conter exatamente 6 caracteres.");
            }
        } while (codigo.length() != 6);

        String produto;
        do {
            System.out.print("Produto (min 3, max 60 caracteres): ");
            produto = entradaDados.nextLine().toUpperCase();
            if (produto.length() < 3 || produto.length() > 60) {
                System.out.println("Descrição do produto inválida!");
            }
        } while (produto.length() < 3 || produto.length() > 60);

        double preco;
        do {
            System.out.print("Preço (formato 0.00): ");
            preco = entradaDados.nextDouble();
            entradaDados.nextLine();

            if (preco < 0) {
                System.out.println("O preço deve ser positivo.");
            }
        } while (preco < 0);

        String ativo;
        do {
            System.out.print("Ativo (true para ativo, false para desativado): ");
            ativo = entradaDados.nextLine().toUpperCase();

            if (!ativo.equals("TRUE") && !ativo.equals("FALSE")) {
                System.out.println("Valor inválido! Informe true ou false.");
            }
        } while (!ativo.equals("TRUE") && !ativo.equals("FALSE"));

        produtos[totalProdutos][0] = codigo;
        produtos[totalProdutos][1] = produto;
        produtos[totalProdutos][2] = ativo;
        produtos[totalProdutos][3] = String.format("%.2f", preco);
        totalProdutos++;

        System.out.println("Produto cadastrado com sucesso.");
    }

    private static void alterarProduto() {
        System.out.print("Digite o código do produto a alterar: ");
        String codigo = entradaDados.nextLine().toUpperCase();

        int indice = buscarProdutoPorCodigo(codigo);
        if (indice == -1) {
            System.out.println("Produto não existe no cadastro.");
            return;
        }

        System.out.println("Código atual: " + produtos[indice][0]);
        System.out.println("Produto atual: " + produtos[indice][1]);
        System.out.println("Preço atual: " + produtos[indice][3]);
        System.out.println("Ativo atual: " + produtos[indice][
