package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Cadastro;

public class CadastroDao {
    private Connection conexao;

    public CadastroDao(Connection conexao) {
        this.conexao = conexao;
    }

    // Método para consultar todos os cadastros
    public List<Cadastro> consultarTodosCadastros() {
        List<Cadastro> cadastros = new ArrayList<>();
        String sql = "SELECT * FROM cadastros";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String telefone = result.getString("telefone");
                String email = result.getString("email");
                String endereco = result.getString("endereco");

                // Crie um objeto de Cadastro com os dados do banco
                Cadastro cadastro = new Cadastro(id, nome, telefone, email, endereco);
                cadastros.add(cadastro);
            }

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cadastros;
    }

	public void update(Cadastro cadastroAtualizado) {
		
	}

	public void delete(int idDeletar) {
		
		
	}

	public void create(Cadastro novoCadastro) {
	
		
	}

    // Outros métodos para consultar cadastro por ID, atualizar, deletar, etc., podem ser adicionados aqui
}
