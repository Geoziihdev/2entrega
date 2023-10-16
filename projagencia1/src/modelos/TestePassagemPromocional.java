package modelos;

import java.util.Date;

public class TestePassagemPromocional {
    public static void main(String[] args) {
        // Criar um objeto Destino com null como parâmetro
        Destino destino = new Destino(1, "Origem", "Destino", null, true);

        // Criar um objeto PassagemPromocional
        PassagemPromocional passagemPromocional = new PassagemPromocional(1, 10, "João", new Date(), "Origem", destino, 90.0, new Date(), "DESC10", 10.0, null);

        // Imprimir informações da passagem promocional
        System.out.println("Detalhes da Passagem Promocional:");
        System.out.println("ID: " + passagemPromocional.getId());
        System.out.println("Número de Assento: " + passagemPromocional.getNumeroAssento());
        System.out.println("Nome do Passageiro: " + passagemPromocional.getNomePassageiro());
        System.out.println("Data e Hora: " + passagemPromocional.getDataHora());
        System.out.println("Preço: " + passagemPromocional.getPreco());

        // Imprimir informações da promoção
        System.out.println("Data de Validade da Promoção: " + passagemPromocional.getValidadeDesconto());
        System.out.println("Código de Desconto: " + passagemPromocional.getCodigoDesconto());
        System.out.println("Valor do Desconto: " + passagemPromocional.getValorDesconto());

        // Imprimir informações do destino associado
        Destino destinoDaPassagem = passagemPromocional.getDestino();
        if (destinoDaPassagem != null) {
            System.out.println("Destino - Origem: " + destinoDaPassagem.getNomeOrigem());
            System.out.println("Destino - Destino: " + destinoDaPassagem.getNomeDestino());
            System.out.println("Destino - Promoção: " + destinoDaPassagem.isEmPromocao());
        } else {
            System.out.println("Destino da passagem não foi definido.");
        }
    }
}
