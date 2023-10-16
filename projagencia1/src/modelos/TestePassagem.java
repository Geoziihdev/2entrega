package modelos;

import java.util.Date;

public class TestePassagem {
    public static void main(String[] args) {
        // Criar um objeto Restricoes
        Restricoes restricoes = new Restricoes("Sem restrição alimentar", "Nenhuma", "Nenhuma observação");

        // Criar um objeto Passagem
        Passagem passagem = new Passagem(1, 10, "João", new Date(), "Origem", "Destino", 100.0, restricoes);

        // Imprimir informações da passagem
        System.out.println("Detalhes da Passagem:");
        System.out.println("ID: " + passagem.getId());
        System.out.println("Número de Assento: " + passagem.getNumeroAssento());
        System.out.println("Nome do Passageiro: " + passagem.getNomePassageiro());
        System.out.println("Data e Hora: " + passagem.getDataHora());
        System.out.println("Local de Origem: " + passagem.getLocalOrigem());
        System.out.println("Local de Destino: " + passagem.getLocalDestino());
        System.out.println("Preço: " + passagem.getPreco());
        
        // Imprimir informações das restrições
        Restricoes restricoesDaPassagem = passagem.getRestricoes();
        System.out.println("Restrição Alimentar: " + restricoesDaPassagem.getRestricaoAlimentar());
        System.out.println("Restrição Especial: " + restricoesDaPassagem.getRestricaoEspecial());
        System.out.println("Observações: " + restricoesDaPassagem.getObservacoes());
    }
}
