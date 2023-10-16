package crud;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import dao.PassagemComumDao;
import modelos.Destino;
import modelos.PassagemComum;

public class PassagemComumCrud {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PassagemComumDao passagemComumDao = new PassagemComumDao(null);

        int opcao = 0, id = 0;

        do {
            System.out.println("\n================================ PASSAGEM COMUM ==============================\n");
            System.out.println(" 1-CRIAR 2- CONSULTAR 3- ATUALIZAR 4- DELETAR 5-CONSULTAR POR ID 6-SAIR");
            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1:
				Destino destino = null;
				// Crie um objeto PassagemComum e preencha seus campos com os dados do formulário
                    PassagemComum novaPassagem = new PassagemComum(id, 123, "João da Silva", new Date(id), "Salvador", destino, 500.0, "Classe A", true, "Detalhes da passagem", null);

                    // Agora você tem uma nova passagem com as informações fornecidas
                    passagemComumDao.create(novaPassagem);

                    System.out.println("Passagem comum criada com sucesso!");
                    break;
                case 2:
                    // Seu código para consultar passagens comuns aqui
                    List<PassagemComum> passagens = passagemComumDao.read();
                    for (PassagemComum passagem : passagens) {
                        System.out.println("ID: " + passagem.getId());
                        System.out.println("Número de Assento: " + passagem.getNumeroAssento());
                        System.out.println("Nome do Passageiro: " + passagem.getNomePassageiro());
                        System.out.println("Origem: " + passagem.getLocalOrigem());
                        System.out.println("Preço: " + passagem.getPreco());
                        System.out.println("Classe: " + passagem.getClassePassagem());
                        System.out.println("Refeições: " + passagem.isRefeicoes());
                        System.out.println("Detalhes: " + passagem.getDetalhes());
                    }
                    break;
                case 3:
                    // Seu código para atualizar uma passagem comum aqui
                    break;
                case 4:
                    // Seu código para deletar uma passagem comum aqui
                    break;
                case 5:
                    // Seu código para consultar por ID aqui
                    System.out.println("Informe o ID da passagem comum: ");
                    int passagemId = s.nextInt();
                    PassagemComum passagem = passagemComumDao.readById(passagemId);
                    if (passagem != null) {
                        System.out.println("ID: " + passagem.getId());
                        System.out.println("Número de Assento: " + passagem.getNumeroAssento());
                        System.out.println("Nome do Passageiro: " + passagem.getNomePassageiro());
                        System.out.println("Origem: " + passagem.getLocalOrigem());
                        System.out.println("Preço: " + passagem.getPreco());
                        System.out.println("Classe: " + passagem.getClassePassagem());
                        System.out.println("Refeições: " + passagem.isRefeicoes());
                        System.out.println("Detalhes: " + passagem.getDetalhes());
                    } else {
                        System.out.println("Passagem comum não encontrada.");
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
