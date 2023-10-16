package crud;

import java.util.List;
import java.util.Scanner;
import dao.ClienteDao;
import modelos.Cliente;

public class ClienteCrud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteDao clienteDao = new ClienteDao(); // Suponha que você já tenha uma classe ClienteDao

        int opcao = 0, id = 0;

        do {
            System.out.println("\n================================ CLIENTE ==============================\n");
            System.out.println(" 1-CRIAR 2- CONSULTAR 3- ATUALIZAR 4- DELETAR 5-CONSULTAR POR ID 6-SAIR");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa a quebra de linha após a leitura do número

            switch (opcao) {
                case 1:
                    // Crie um objeto Cliente e preencha seus campos com os dados do formulário
                    Cliente novoCliente = new Cliente(id, null, null, null);

                    System.out.println("Informe o nome do cliente: ");
                    novoCliente.setNome(scanner.nextLine());

                    System.out.println("Informe o email do cliente: ");
                    novoCliente.setEmail(scanner.nextLine());

                    System.out.println("Informe o telefone do cliente: ");
                    novoCliente.setTelefone(scanner.nextLine());

                    // Agora você tem um novo cliente com as informações fornecidas pelo usuário
                    // Você pode usar seu DAO para salvar esse cliente no banco de dados
                    clienteDao.create(novoCliente);

                    System.out.println("Cliente criado com sucesso!");
                    break;
                    
                case 2:
                    // Consultar Clientes
                    List<Cliente> clientes = clienteDao.read();
                    for (Cliente cliente : clientes) {
                        System.out.println("ID: " + cliente.getId());
                        System.out.println("Nome: " + cliente.getNome());
                        System.out.println("Email: " + cliente.getEmail());
                        System.out.println("Telefone: " + cliente.getTelefone());
                        System.out.println();
                    }
                    break;
                
                case 3:
                    // Atualizar Cliente
                    System.out.println("ID do cliente que deseja atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    
                    System.out.println("Novo email: ");
                    String novoEmail = scanner.nextLine();
                    
                    System.out.println("Novo telefone: ");
                    String novoTelefone = scanner.nextLine();
                    
                    Cliente clienteAtualizado = new Cliente(idAtualizar, novoNome, novoEmail, novoTelefone);
                    clienteDao.update(clienteAtualizado);
                    System.out.println("Cliente atualizado com sucesso!");
                    break;
                    
                case 4:
                    // Deletar Cliente
                    System.out.println("ID do cliente que deseja deletar: ");
                    int idDeletar = scanner.nextInt();
                    scanner.nextLine();
                    clienteDao.delete(idDeletar);
                    System.out.println("Cliente deletado com sucesso!");
                    break; 
                    
                case 5:
                    // Consultar por ID
                    System.out.println("ID do cliente que deseja consultar: ");
                    int idConsultar = scanner.nextInt();
                    scanner.nextLine();
                    Cliente clienteConsultado = clienteDao.readById(idConsultar);
                    
                    if (clienteConsultado != null) {
                        System.out.println("ID: " + clienteConsultado.getId());
                        System.out.println("Nome: " + clienteConsultado.getNome());
                        System.out.println("Email: " + clienteConsultado.getEmail());
                        System.out.println("Telefone: " + clienteConsultado.getTelefone());
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
   
                case 6:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (opcao != 6);
    }
}






































