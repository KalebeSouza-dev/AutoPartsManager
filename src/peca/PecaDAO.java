package peca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utils.ConexaoPostgres;

public class PecaDAO {
    public void inserirPeca(Peca peca)  throws SQLException{
        String sql = "INSERT INTO pecas(id, nome, descricao) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoPostgres.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, peca.getID());
            stmt.setString(2, peca.getNome());
            stmt.setString(3, peca.getDescricao());

            stmt.executeUpdate();
        }
    }
    public void removerPeca(int ID) throws SQLException{
    	String sql = "DELETE FROM pecas WHERE id = ?";
    	try (Connection conn = ConexaoPostgres.conectar();
    		 PreparedStatement stmt = conn.prepareStatement(sql)){
    		
    		stmt.setInt(1, ID);
    		stmt.executeUpdate();
    	}
    }

    public List<Peca> listarTodos() throws SQLException {
        String sql = "SELECT * FROM pecas";
        List<Peca> pecas = new ArrayList<>();

        try (Connection conn = ConexaoPostgres.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                pecas.add(new Peca(rs.getInt("id"), rs.getString("nome"), rs.getString("descricao")));
            }
        }

        return pecas;
    }
}
