package peca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.ConexaoPostgres;

public class PecaDAO {
    public String inserir(Peca peca) {
        String sql = "INSERT INTO pecas(id, nome, descricao) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoPostgres.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, peca.getID());
            stmt.setString(2, peca.getNome());
            stmt.setString(3, peca.getDescricao());

            stmt.executeUpdate();
            return "Peça inserida com sucesso!";

        } catch (SQLException e) {
            return "Erro ao inserir peça: " + e.getMessage();
        }
    }

    public String listar() {
        String sql = "SELECT * FROM pecas";
        try (Connection conn = ConexaoPostgres.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
        	
        	StringBuffer out = new StringBuffer();
            while (rs.next()) {
                out.append(rs.getInt("id") + " | " +
	                    rs.getString("nome") + " | " +
	                    rs.getString("descricao") + "\n");
            }
            return out.toString();

        } catch (SQLException e) {
            return "Erro ao listar peças: " + e.getMessage();
        }
    }
}
