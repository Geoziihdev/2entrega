package modelos;

public class TesteDestino {
    public static void main(String[] args) {
        // Criar um objeto Destino
        Destino destino = new Destino(1, "Origem", "Destino", "Voo123", true);

        // Acessar e imprimir os atributos do objeto Destino
        System.out.println("ID: " + destino.getId());
        System.out.println("Nome Origem: " + destino.getNomeOrigem());
        System.out.println("Nome Destino: " + destino.getNomeDestino());
        System.out.println("Voo: " + destino.getVoo());
        System.out.println("Em Promoção: " + destino.isEmPromocao());

        // Modificar um atributo usando o setter
        destino.setNomeOrigem("Nova Origem");
        System.out.println("Novo Nome Origem: " + destino.getNomeOrigem());
    }
}
