package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelos.Passagem;
import modelos.Restricoes;

public class PassagemDao {
    private Connection conexao;

    public PassagemDao(Connection conexao) {
        this.conexao = conexao;
    }

    public void create(Passagem passagem) {
        String sql = "INSERT INTO Passagem (id, numeroAssento, nomePassageiro, dataHora, localOrigem, localDestino, preco) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, passagem.getId());
            stmt.setInt(2, passagem.getNumeroAssento());
            stmt.setString(3, passagem.getNomePassageiro());
            stmt.setDate(4, new java.sql.Date(passagem.getDataHora().getTime()));
            stmt.setString(5, passagem.getLocalOrigem());
            stmt.setString(6, passagem.getLocalDestino());
            stmt.setDouble(7, passagem.getPreco());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Passagem> read() {
        List<Passagem> passagens = new ArrayList<>();
        String sql = "SELECT * FROM Passagem";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                int numeroAssento = result.getInt("numeroAssento");
                String nomePassageiro = result.getString("nomePassageiro");
                Date dataHora = result.getDate("dataHora");
                String localOrigem = result.getString("localOrigem");
                String localDestino = result.getString("localDestino");
                double preco = result.getDouble("preco");

                Passagem passagem = new Passagem(id, numeroAssento, nomePassageiro, dataHora, localOrigem, localDestino, preco, null);
                passagens.add(passagem);
            }

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passagens;
    }

    public void update(Passagem passagem) {
        String sql = "UPDATE Passagem SET numeroAssento = ?, nomePassageiro = ?, dataHora = ?, localOrigem = ?, localDestino = ?, preco = ? WHERE id = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, passagem.getNumeroAssento());
            stmt.setString(2, passagem.getNomePassageiro());
            stmt.setDate(3, new java.sql.Date(passagem.getDataHora().getTime()));
            stmt.setString(4, passagem.getLocalOrigem());
            stmt.setString(5, passagem.getLocalDestino());
            stmt.setDouble(6, passagem.getPreco());
            stmt.setInt(7, passagem.getId());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM Passagem WHERE id = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Passagem readById(int id) {
        Passagem passagem = null;
        String sql = "SELECT * FROM Passagem WHERE id = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();

            if (result.next()) {
                int numeroAssento = result.getInt("numeroAssento");
                String nomePassageiro = result.getString("nomePassageiro");
                Date dataHora = result.getDate("dataHora");
                String localOrigem = result.getString("localOrigem");
                String localDestino = result.getString("localDestino");
                double preco = result.getDouble("preco");

                passagem = new Passagem(id, numeroAssento, nomePassageiro, dataHora, localOrigem, localDestino, preco, null);
            }

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passagem;
    }
}
