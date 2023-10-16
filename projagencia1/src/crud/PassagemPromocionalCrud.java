package crud;

import java.util.Scanner;

import dao.PassagemPromocionalDao;

public class PassagemPromocionalCrud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PassagemPromocionalDao passagemPromocionalDao = new PassagemPromocionalDao();

        int opcao = 0;

        do {
            System.out.println("\n============== CRUD DE PASSAGENS PROMOCIONAIS ==============\n");
            System.out.println("1 - CRIAR Passagem Promocional");
            System.out.println("2 - LISTAR Passagens Promocionais");
            System.out.println("3 - ATUALIZAR Passagem Promocional");
            System.out.println("4 - DELETAR Passagem Promocional");
            System.out.println("5 - CONSULTAR Passagem Promocional por ID");
            System.out.println("6 - SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    criarPassagemPromocional(scanner, passagemPromocionalDao);
                    break;

                case 2:
                    listarPassagensPromocionais(passagemPromocionalDao);
                    break;

                case 3:
                    atualizarPassagemPromocional(scanner, passagemPromocionalDao);
                    break;

                case 4:
                    deletarPassagemPromocional(scanner, passagemPromocionalDao);
                    break;

                case 5:
                    consultarPassagemPromocionalPorId(scanner, passagemPromocionalDao);
                    break;

                case 6:
                    System.out.println("Encerrando o aplicativo.");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }

        } while (opcao != 6);
    }

    // Implemente os métodos criarPassagemPromocional, listarPassagensPromocionais, atualizarPassagemPromocional, deletarPassagemPromocional e consultarPassagemPromocionalPorId aqui.

    private static void criarPassagemPromocional(Scanner scanner, PassagemPromocionalDao dao) {
        // Implemente a lógica para criar uma passagem promocional
    }

    private static void listarPassagensPromocionais(PassagemPromocionalDao dao) {
        // Implemente a lógica para listar todas as passagens promocionais
    }

    private static void atualizarPassagemPromocional(Scanner scanner, PassagemPromocionalDao dao) {
        // Implemente a lógica para atualizar uma passagem promocional
    }

    private static void deletarPassagemPromocional(Scanner scanner, PassagemPromocionalDao dao) {
        // Implemente a lógica para deletar uma passagem promocional
    }

    private static void consultarPassagemPromocionalPorId(Scanner scanner, PassagemPromocionalDao dao) {
        // Implemente a lógica para consultar uma passagem promocional por ID
    }
}

