package crud;

import java.util.List;
import java.util.Scanner;
import dao.CadastroDao;
import modelos.Cadastro;

public class CadastroCrud {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroDao cadastroDao = new CadastroDao(null); // Suponha que você já tenha uma classe CadastroDao

        int opcao = 0;

        do {
            System.out.println("\n================================ CADASTRO ==============================\n");
            System.out.println(" 1-CRIAR 2- CONSULTAR 3- ATUALIZAR 4- DELETAR 5-SAIR");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Criar um novo cadastro
                    System.out.println("Informe o nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Informe o telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.println("Informe o email: ");
                    String email = scanner.nextLine();
                    System.out.println("Informe o endereço: ");
                    String endereco = scanner.nextLine();

                    Cadastro novoCadastro = new Cadastro(0, nome, telefone, email, endereco);
                    cadastroDao.create(novoCadastro);
                    System.out.println("Cadastro criado com sucesso!");
                    break;

                case 2:
                    // Consultar todos os cadastros
                    List<Cadastro> cadastros = cadastroDao.consultarTodosCadastros();
                    for (Cadastro cadastro : cadastros) {
                        System.out.println("ID: " + cadastro.getId());
                        System.out.println("Nome: " + cadastro.getNome());
                        System.out.println("Telefone: " + cadastro.getTelefone());
                        System.out.println("Email: " + cadastro.getEmail());
                        System.out.println("Endereço: " + cadastro.getEndereco());
                        System.out.println();
                    }
                    break;

                case 3:
                    // Atualizar um cadastro
                    System.out.println("Informe o ID do cadastro que deseja atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    System.out.println("Informe o novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.println("Informe o novo telefone: ");
                    String novoTelefone = scanner.nextLine();
                    System.out.println("Informe o novo email: ");
                    String novoEmail = scanner.nextLine();
                    System.out.println("Informe o novo endereço: ");
                    String novoEndereco = scanner.nextLine();

                    Cadastro cadastroAtualizado = new Cadastro(idAtualizar, novoNome, novoTelefone, novoEmail, novoEndereco);
                    cadastroDao.update(cadastroAtualizado);
                    System.out.println("Cadastro atualizado com sucesso!");
                    break;

                case 4:
                    // Deletar um cadastro
                    System.out.println("Informe o ID do cadastro que deseja deletar: ");
                    int idDeletar = scanner.nextInt();
                    cadastroDao.delete(idDeletar);
                    System.out.println("Cadastro deletado com sucesso!");
                    break;

                case 5:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }

        } while (opcao != 5);
    }
}
