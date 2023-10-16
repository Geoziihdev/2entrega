package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    // URL de conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/cadastro";
    // Nome de usuário e senha para acessar o banco de dados
    private static final String USUARIO = "root";
    private static final String SENHA = "3240";

    // Método para obter uma conexão com o banco de dados
    public static Connection conectar() {
        Connection conexao = null;
        try {
            // Carrega o driver JDBC do MySQL (certifique-se de que o conector esteja no classpath)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Obtém uma conexão com o banco de dados
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Driver JDBC do MySQL não encontrado.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar ao banco de dados.");
        }
        return conexao;
    }
}
