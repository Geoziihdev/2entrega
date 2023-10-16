package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Restricoes;

public class RestricoesDao {
    private Connection conexao;

    public RestricoesDao(Connection conexao) {
        this.conexao = conexao;
    }

    public void create(Restricoes restricoes) {
        String sql = "INSERT INTO Restricoes (restricaoAlimentar, restricaoEspecial, observacoes) VALUES (?, ?, ?)";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, restricoes.getRestricaoAlimentar());
            stmt.setString(2, restricoes.getRestricaoEspecial());
            stmt.setString(3, restricoes.getObservacoes());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Restricoes> read() {
        List<Restricoes> restricoes = new ArrayList<>();
        String sql = "SELECT * FROM Restricoes";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                String restricaoAlimentar = result.getString("restricaoAlimentar");
                String restricaoEspecial = result.getString("restricaoEspecial");
                String observacoes = result.getString("observacoes");

                Restricoes restricao = new Restricoes(restricaoAlimentar, restricaoEspecial, observacoes);
                restricoes.add(restricao);
            }

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return restricoes;
    }

    public void update(Restricoes restricoes) {
        String sql = "UPDATE Restricoes SET restricaoAlimentar = ?, restricaoEspecial = ?, observacoes = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, restricoes.getRestricaoAlimentar());
            stmt.setString(2, restricoes.getRestricaoEspecial());
            stmt.setString(3, restricoes.getObservacoes());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(String restricaoAlimentar) {
        String sql = "DELETE FROM Restricoes WHERE restricaoAlimentar = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, restricaoAlimentar);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Restricoes readById(String restricaoAlimentar) {
        Restricoes restricoes = null;
        String sql = "SELECT * FROM Restricoes WHERE restricaoAlimentar = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, restricaoAlimentar);
            ResultSet result = stmt.executeQuery();

            if (result.next()) {
                String restricaoEspecial = result.getString("restricaoEspecial");
                String observacoes = result.getString("observacoes");

                restricoes = new Restricoes(restricaoAlimentar, restricaoEspecial, observacoes);
            }

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return restricoes;
    }
}
