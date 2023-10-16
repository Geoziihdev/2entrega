package modelos;

public class TesteRestricoes {
    public static void main(String[] args) {
        // Criar um objeto Restricoes com informações
        Restricoes restricoes = new Restricoes("Sem glúten", "Nenhuma", "Nenhuma observação");

        // Imprimir as informações das restrições
        System.out.println("Restrições do Passageiro:");
        System.out.println("Restrição Alimentar: " + restricoes.getRestricaoAlimentar());
        System.out.println("Restrição Especial: " + restricoes.getRestricaoEspecial());
        System.out.println("Observações: " + restricoes.getObservacoes());

        // Criar outro objeto Restricoes com descrição
        Restricoes restricoes2 = new Restricoes("Passageiro com alergia a frutos do mar");

        // Imprimir a descrição das restrições
        System.out.println("\nDescrição das Restrições:");
        System.out.println("Descrição: " + restricoes2.getDescricao());
    }
}
