package modelos;

import java.util.Date;

public class TestePassagemComum {
    public static void main(String[] args) {
        // Criar um objeto Destino
        Destino destino = new Destino(1, "Origem", "Destino", "Voo123", true);

        // Criar um objeto Restricoes
        Restricoes restricoes = new Restricoes("Restrições de Bagagem");

        // Criar um objeto PassagemComum
        PassagemComum passagemComum = new PassagemComum(1, 10, "João", new Date(), "Origem", destino, 100.0, "Classe Econômica", true, "Detalhes da passagem", restricoes);

        // Imprimir informações da passagem comum
        System.out.println("Detalhes da Passagem Comum:");
        System.out.println("ID: " + passagemComum.getId());
        System.out.println("Número de Assento: " + passagemComum.getNumeroAssento());
        System.out.println("Nome do Passageiro: " + passagemComum.getNomePassageiro());
        System.out.println("Data e Hora: " + passagemComum.getDataHora());
        System.out.println("Local de Origem: " + passagemComum.getLocalOrigem());
        System.out.println("Preço: " + passagemComum.getPreco());
        System.out.println("Classe de Passagem: " + passagemComum.getClassePassagem());
        System.out.println("Refeições Incluídas: " + passagemComum.isRefeicoes());
        System.out.println("Detalhes: " + passagemComum.getDetalhes());

        // Imprimir informações do destino associado
        Destino destinoDaPassagem = passagemComum.getDestino();
        System.out.println("Destino - Origem: " + destinoDaPassagem.getNomeOrigem());
        System.out.println("Destino - Destino: " + destinoDaPassagem.getNomeDestino());
        System.out.println("Destino - Voo: " + destinoDaPassagem.getVoo());
        System.out.println("Destino - Promoção: " + destinoDaPassagem.isEmPromocao());

        // Imprimir informações das restrições
        Restricoes restricoesDaPassagem = passagemComum.getRestricoes();
        System.out.println("Restrições: " + restricoesDaPassagem.getDescricao());
    }
}
