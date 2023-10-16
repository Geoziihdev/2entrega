







import java.util.Date;
Scanner scanner = new Scanner(System.in);


import modelos.Agencia;
import modelos.Cliente;
import modelos.Cadastro;
import modelos.Passagem;
import modelos.PassagemComum;
import modelos.PassagemPromocional;
import modelos.Restricoes;
import modelos.Destino;

public class Main {
    public static void main(String[] args) {
        // Exemplo de criação de uma Agência
        Agencia agencia1 = new Agencia(1, "Agência ABC", "agencia@email.com", "1234567890");

        // Exemplo de criação de um Cliente
        Cliente cliente1 = new Cliente(1, "João", "joao@email.com", "1234567890", "Rua ABC, 123");

        // Exemplo de criação de um Cadastro
        Cadastro cadastro1 = new Cadastro(1, "José", "9876543210", "jose@email.com", "Rua XYZ, 456");

        // Exemplo de criação de uma Passagem
        Passagem passagem1 = new Passagem(1, 10, "Maria", new Date(), "OrigemA", "DestinoB", 100.0);

        // Exemplo de criação de uma PassagemComum
        PassagemComum passagemComum1 = new PassagemComum(1, "Classe Econômica", true, "Detalhes da passagem comum");

        // Exemplo de criação de uma PassagemPromocional
        PassagemPromocional passagemPromo1 = new PassagemPromocional(1, new Date(), "PROMO123", 20.0);

        // Exemplo de criação de Restrições
        Restricoes restricoes1 = new Restricoes(1, "Restrição 1", "Tipo 1");

        // Exemplo de criação de Destino
        Destino destino1 = new Destino(1, "Destino A", "Voo 123", passagemPromo1, passagemComum1, "Outras informações sobre o destino");

        // Exibindo informações dos objetos criados
        System.out.println("Informações da Agência:");
        System.out.println("ID: " + agencia1.getId());
        System.out.println("Nome: " + agencia1.getNome());
        System.out.println("Email: " + agencia1.getEmail());
        System.out.println("Telefone: " + agencia1.getTelefone());

        System.out.println("\nInformações do Cliente:");
        System.out.println("ID: " + cliente1.getId());
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Telefone: " + cliente1.getTelefone());
        System.out.println("Endereço: " + cliente1.getEndereco());

        System.out.println("\nInformações do Cadastro:");
        System.out.println("ID: " + cadastro1.getId());
        System.out.println("Nome: " + cadastro1.getNome());
        System.out.println("Telefone: " + cadastro1.getTelefone());
        System.out.println("Email: " + cadastro1.getEmail());
        System.out.println("Endereço: " + cadastro1.getEndereco());

        System.out.println("\nInformações da Passagem:");
        System.out.println("ID: " + passagem1.getId());
        System.out.println("Número de Assento: " + passagem1.getNumeroAssento());
        System.out.println("Nome do Passageiro: " + passagem1.getNomePassageiro());
        System.out.println("Data e Hora: " + passagem1.getDataHora());
        System.out.println("Origem: " + passagem1.getOrigem());
        System.out.println("Destino: " + passagem1.getDestino());
        System.out.println("Preço: " + passagem1.getPreco());

        System.out.println("\nInformações da Passagem Comum:");
        System.out.println("ID: " + passagemComum1.getId());
        System.out.println("Classe da Passagem: " + passagemComum1.getClassePassagem());
        System.out.println("Refeições: " + passagemComum1.isRefeicoes());
        System.out.println("Detalhes: " + passagemComum1.getDetalhes());

        System.out.println("\nInformações da Passagem Promocional:");
        System.out.println("ID: " + passagemPromo1.getId());
        System.out.println("Validade do
