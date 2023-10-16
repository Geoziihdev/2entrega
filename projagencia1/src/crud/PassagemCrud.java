package crud;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import dao.PassagemDao;
import modelos.Passagem;
import modelos.PassagemComum;
import modelos.PassagemPromocional;

public class PassagemCrud {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PassagemDao passagemDao = new PassagemDao(null);

        int opcao = 0, id = 1; // Inicializa o ID com 1

        do {
            System.out.println("\n===================================== PASSAGEM ====================================================\n");
            System.out.println(" 1-CRIAR PASSAGEM COMUM 2-CRIAR PASSAGEM PROMOCIONAL 3-CONSULTAR PASSAGENS 4-CONSULTAR POR ID 5-SAIR");
            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1:     
				Passagem novaPassagemComum = null;
				// Agora você tem uma nova passagem comum
                    passagemDao.create(novaPassagemComum);

                    System.out.println("Passagem comum criada com sucesso!");

                    id++; // Incrementa o ID para a próxima passagem

                    break;
                case 2:
                    // Crie um objeto PassagemPromocional e preencha seus campos com os dados do formulário
                    PassagemPromocional novaPassagemPromocional = new PassagemPromocional(id, 124, "Maria Silva", new Date(), "São Paulo", "Rio de Janeiro", 300.0, "Classe B", true, "Detalhes da passagem promocional", null);

                    // Agora você tem uma nova passagem promocional
                    passagemDao.create(novaPassagemPromocional);

                    System.out.println("Passagem promocional criada com sucesso!");

                    id++; // Incrementa o ID para a próxima passagem

                    break;
                case 3:
                    // Seu código para consultar passagens aqui
                    List<Passagem> passagens = passagemDao.read();
                    for (Passagem passagem : passagens) {
                        System.out.println("ID: " + passagem.getId());
                        System.out.println("Número de Assento: " + passagem.getNumeroAssento());
                        System.out.println("Nome do Passageiro: " + passagem.getNomePassageiro());
                        System.out.println("Origem: " + passagem.getLocalOrigem());
                        System.out.println("Destino: " + passagem.getLocalDestino());
                        System.out.println("Preço: " + passagem.getPreco());
                        System.out.println("Classe: " + (passagem instanceof PassagemComum ? ((PassagemComum) passagem).getClassePassagem() : "Não aplicável"));
                    }
                    break;
                case 4:
                    // Seu código para consultar por ID aqui
                    System.out.println("Informe o ID da passagem: ");
                    int passagemId = s.nextInt();
                    Passagem passagem = passagemDao.readById(passagemId);
                    if (passagem != null) {
                        System.out.println("ID: " + passagem.getId());
                        System.out.println("Número de Assento: " + passagem.getNumeroAssento());
                        System.out.println("Nome do Passageiro: " + passagem.getNomePassageiro());
                        System.out.println("Origem: " + passagem.getLocalOrigem());
                        System.out.println("Destino: " + passagem.getLocalDestino());
                        System.out.println("Preço: " + passagem.getPreco());
                        System.out.println("Classe: " + (passagem instanceof PassagemComum ? ((PassagemComum) passagem).getClassePassagem() : "Não aplicável"));
                    } else {
                        System.out.println("Passagem não encontrada.");
                    }
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

