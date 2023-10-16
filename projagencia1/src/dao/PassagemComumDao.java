package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.PassagemComum;

public class PassagemComumDao {
    private Connection conexao;

    public PassagemComumDao(Connection conexao) {
        this.conexao = conexao;
    }

    public void create(PassagemComum passagemComum) {
        String sql = "INSERT INTO PassagemComum (id, numeroAssento, nomePassageiro, dataHora, localOrigem, destino, preco, classePassagem, refeicoes, detalhes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, passagemComum.getId());
            stmt.setInt(2, passagemComum.getNumeroAssento());
            stmt.setString(3, passagemComum.getNomePassageiro());
            stmt.setDate(4, new java.sql.Date(passagemComum.getDataHora().getTime()));
            stmt.setString(5, passagemComum.getLocalOrigem());
            stmt.setString(6, passagemComum.getDestino().getNomeDestino());
            stmt.setDouble(7, passagemComum.getPreco());
            stmt.setString(8, passagemComum.getClassePassagem());
            stmt.setBoolean(9, passagemComum.isRefeicoes());
            stmt.setString(10, passagemComum.getDetalhes());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<PassagemComum> read() {
        List<PassagemComum> passagensComuns = new ArrayList<>();
        String sql = "SELECT * FROM PassagemComum";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                PassagemComum passagemComum = new PassagemComum(0, 0, sql, null, sql, null, 0, sql, false, sql, null);
                passagemComum.setId(result.getInt("id"));
                passagemComum.setNumeroAssento(result.getInt("numeroAssento"));
                passagemComum.setNomePassageiro(result.getString("nomePassageiro"));
                passagemComum.setDataHora(result.getDate("dataHora"));
                passagemComum.setLocalOrigem(result.getString("localOrigem"));
                passagemComum.setPreco(result.getDouble("preco"));
                passagemComum.setClassePassagem(result.getString("classePassagem"));
                passagemComum.setRefeicoes(result.getBoolean("refeicoes"));
                passagemComum.setDetalhes(result.getString("detalhes"));
                passagensComuns.add(passagemComum);
            }

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passagensComuns;
    }

    public void update(PassagemComum passagemComum) {
        String sql = "UPDATE PassagemComum SET numeroAssento = ?, nomePassageiro = ?, dataHora = ?, localOrigem = ?, destino = ?, preco = ?, classePassagem = ?, refeicoes = ?, detalhes = ? WHERE id = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, passagemComum.getNumeroAssento());
            stmt.setString(2, passagemComum.getNomePassageiro());
            stmt.setDate(3, new java.sql.Date(passagemComum.getDataHora().getTime()));
            stmt.setString(4, passagemComum.getLocalOrigem());
            stmt.setString(5, passagemComum.getDestino().getNomeDestino());
            stmt.setDouble(6, passagemComum.getPreco());
            stmt.setString(7, passagemComum.getClassePassagem());
            stmt.setBoolean(8, passagemComum.isRefeicoes());
            stmt.setString(9, passagemComum.getDetalhes());
            stmt.setInt(10, passagemComum.getId());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM PassagemComum WHERE id = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PassagemComum readById(int id) {
        PassagemComum passagemComum = null;
        String sql = "SELECT * FROM PassagemComum WHERE id = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();

            if (result.next()) {
                passagemComum = new PassagemComum(0, 0, sql, null, sql, null, 0, sql, false, sql, null);
                passagemComum.setId(result.getInt("id"));
                passagemComum.setNumeroAssento(result.getInt("numeroAssento"));
                passagemComum.setNomePassageiro(result.getString("nomePassageiro"));
                passagemComum.setDataHora(result.getDate("dataHora"));
                passagemComum.setLocalOrigem(result.getString("localOrigem"));
                passagemComum.setPreco(result.getDouble("preco"));
                passagemComum.setClassePassagem(result.getString("classePassagem"));
                passagemComum.setRefeicoes(result.getBoolean("refeicoes"));
                passagemComum.setDetalhes(result.getString("detalhes"));
            }

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passagemComum;
    }
}
