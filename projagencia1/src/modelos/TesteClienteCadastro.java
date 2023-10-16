package modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteClienteCadastro {
    public static void main(String[] args) {
        // Crie uma instância de Date para representar a data de nascimento do cliente
        Date dataNascimento = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            dataNascimento = sdf.parse("1990-01-15");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Crie uma instância de Cliente e Cadastro
        Cliente cliente = new Cliente(1, "João da Silva", dataNascimento, "123.456.789-01");
        Cadastro cadastro = new Cadastro(1, "João", "123456789", "joao@email.com", "Rua A");

        // Associe o cliente ao cadastro
        cadastro.adicionarCliente(cliente);

        // Acesse os atributos do cliente e do cadastro e imprima-os
        System.out.println("Dados do Cliente:");
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Data de Nascimento: " + cliente.getNascimento());
        System.out.println("CPF: " + cliente.getCpf());

        System.out.println("\nDados do Cadastro:");
        System.out.println("ID: " + cadastro.getId());
        System.out.println("Nome: " + cadastro.getNome());
        System.out.println("Telefone: " + cadastro.getTelefone());
        System.out.println("Email: " + cadastro.getEmail());
        System.out.println("Endereço: " + cadastro.getEndereco());

        // Acesse a lista de clientes associada ao cadastro e imprima
        System.out.println("\nClientes no Cadastro:");
        for (Cliente c : cadastro.getClientes()) {
            System.out.println("Cliente: " + c.getNome());
        }
    }
}
