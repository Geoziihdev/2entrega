package dao;
import java.util.ArrayList;
import java.util.List;

import modelos.Destino;

public class DestinoDao {

    // Create
    public void create(Destino destino) {
    	
        System.out.println("*** CREATE ***");
        
    }

    // Read
    public List<Destino> read() {
        List<Destino> destino = new ArrayList<Destino>();
        System.out.println("*** READ ***");
        return destino;
    }

    // Update
    public void update(Destino destino) {
        System.out.println("*** UPDATE ***");
    }

    // Delete
    public void delete(int id) {
        System.out.println("*** DELETE ***");
    }

    // Read By ID
    public Destino readById(int id) {
        System.out.println("*** READ BY ID ***");
        return null; // Deve ser implementada a lógica para buscar o cliente pelo ID no banco de dados
    }
}
