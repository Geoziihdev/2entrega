package crud;

import dao.RestricoesDao;
import modelos.Restricoes;
import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class RestricoesCrud {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Substitua "suaConexao" pela instância de conexão válida com o banco de dados
        Connection suaConexao = null;
        RestricoesDao restricoesDao = new RestricoesDao(suaConexao);

        int opcao = 0;

        do {
            System.out.println("\n============== CRUD DE RESTRIÇÕES ==============\n");
            System.out.println("1 - CRIAR Restrição");
            System.out.println("2 - LISTAR Restrições");
            System.out.println("3 - ATUALIZAR Restrição");
            System.out.println("4 - DELETAR Restrição");
            System.out.println("5 - CONSULTAR Restrição Alimentar");
            System.out.println("6 - SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    criarRestricao(scanner, restricoesDao);
                    break;

                case 2:
                    listarRestricoes(restricoesDao);
                    break;

                case 3:
                    atualizarRestricao(scanner, restricoesDao);
                    break;

                case 4:
                    deletarRestricao(scanner, restricoesDao);
                    break;

                case 5:
                    consultarRestricaoPorAlimentar(scanner, restricoesDao);
                    break;

                case 6:
                    System.out.println("Encerrando o aplicativo.");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }

        } while (opcao != 6);
    }

    private static void consultarRestricaoPorAlimentar(Scanner scanner, RestricoesDao restricoesDao) {
		// TODO Auto-generated method stub
		
	}

	private static void criarRestricao(Scanner scanner, RestricoesDao dao) {
        System.out.print("Informe a Restrição Alimentar: ");
        String restricaoAlimentar = scanner.nextLine();

        System.out.print("Informe a Restrição Especial: ");
        String restricaoEspecial = scanner.nextLine();

        System.out.print("Informe as Observações: ");
        String observacoes = scanner.nextLine();

        Restricoes novaRestricao = new Restricoes(restricaoAlimentar, restricaoEspecial, observacoes);

        dao.create(novaRestricao);
        System.out.println("Restrição criada com sucesso!");
    }

    private static void listarRestricoes(RestricoesDao dao) {
        List<Restricoes> restricoes = dao.read();

        if (restricoes.isEmpty()) {
            System.out.println("Não há restrições cadastradas.");
        } else {
            for (Restricoes restricao : restricoes) {
                exibirRestricao(restricao);
            }
        }
    }

    private static void exibirRestricao(Restricoes restricao) {
        System.out.println("Restrição Alimentar: " + restricao.getRestricaoAlimentar());
        System.out.println("Restrição Especial: " + restricao.getRestricaoEspecial());
        System.out.println("Observações: " + restricao.getObservacoes());
    }

    private static void atualizarRestricao(Scanner scanner, RestricoesDao dao) {
        System.out.print("Informe a Restrição Alimentar que deseja atualizar: ");
        String restricaoAlimentar = scanner.nextLine();

        Restricoes restricaoParaAtualizar = dao.readById(restricaoAlimentar);

        if (restricaoParaAtualizar == null) {
            System.out.println("Restrição não encontrada.");
        } else {
            exibirRestricao(restricaoParaAtualizar);

            System.out.print("Informe a nova Restrição Especial: ");
            String novaRestricaoEspecial = scanner.nextLine();
            restricaoParaAtualizar.setRestricaoEspecial(novaRestricaoEspecial);

            System.out.print("Informe as novas Observações: ");
            String novasObservacoes = scanner.nextLine();
            restricaoParaAtualizar.setObservacoes(novasObservacoes);

            dao.update(restricaoParaAtualizar);
            System.out.println("Restrição atualizada com sucesso.");
        }
    }

    private static void deletarRestricao(Scanner scanner, RestricoesDao dao) {
        System.out.print("Informe a Restrição Alimentar que deseja deletar: ");
        String restricaoAlimentar = scanner.nextLine();

        Restricoes restricaoParaDeletar = dao.readById(restricaoAlimentar);

        if (restricaoParaDeletar == null) {
            System.out.println("Restrição não encontrada.");
        } else {
            exibirRestricao(restricaoParaDeletar);
            System.out.print("Tem certeza que deseja deletar esta restrição? (sim/nao): ");
            String confirmacao = scanner.nextLine();

            if (confirmacao.equalsIgnoreCase("sim")) {
                dao.delete(restricaoAlimentar);
                System.out.println("Restrição deletada com sucesso.");
            } else {
                System.out.println("Operação de exclusão cancelada.");
            }
        }
    }

    private static void consultarRestricaoPorAlimentar1(Scanner scanner, RestricoesDao dao) {
        System.out.print("Informe a Restrição Alimentar que deseja consultar: ");
        String restricaoAlimentar = scanner.nextLine();

        Restricoes restricaoConsultada = dao.readById(restricaoAlimentar);

        if (restricaoConsultada == null) {
            System.out.println("Restrição não encontrada.");
        } else {
            exibirRestricao(restricaoConsultada);
        }
    }
}
