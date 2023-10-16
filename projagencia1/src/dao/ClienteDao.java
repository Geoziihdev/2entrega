package dao;

import java.util.ArrayList;
import java.util.List;

import modelos.Cliente;

public class ClienteDao {

    // Create
    public void create(Cliente cliente) {
        System.out.println("*** CREATE ***");
        String sql = "INSERT INTO Clientes (nome, email, telefone) VALUES (Gerson,Gerson@hotmail,71-988776009)";
    }

    // Read
    public List<Cliente> read() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        System.out.println("*** READ ***");
        return clientes;
    }

    // Update
    public void update(Cliente cliente) {
        System.out.println("*** UPDATE ***");
    }

    // Delete
    public void delete(int id) {
        System.out.println("*** DELETE ***");
    }

    // Read By ID
    public Cliente readById(int id) {
        System.out.println("*** READ BY ID ***");
        return null; // Deve ser implementada a lógica para buscar o cliente pelo ID no banco de dados
    }
}
