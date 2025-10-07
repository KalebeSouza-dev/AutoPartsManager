package produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import peca.Peca;
import peca.PecaController;
import utils.ConexaoPostgres;

public class ProdutoDAO {
	private PecaController CPeca;
	  
	public List<Produto> listarTodos() throws SQLException {
        String sql = "SELECT * FROM produto";
        List<Produto> produtos = new ArrayList<>();

        try (Connection conn = ConexaoPostgres.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                int idPeca = rs.getInt("id_peca");
                String marca = rs.getString("marca");
                double precoCompra = rs.getDouble("preco_compra");
                double precoVenda = rs.getDouble("preco_venda");

                Peca peca = CPeca.getPeca(idPeca);

                produtos.add(new Produto(peca, marca, codigo, precoCompra, precoVenda));
            }
        }

        return produtos;
    }
	public void adicionarProduto(Produto produto) throws SQLException {
        String sql = "INSERT INTO produto (codigo, id_peca, marca, preco_compra, preco_venda) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoPostgres.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, produto.getCodigo());
            stmt.setInt(2, produto.getPeca().getID());
            stmt.setString(3, produto.getMarca());
            stmt.setDouble(4, produto.getPrecoCompra());
            stmt.setDouble(5, produto.getPrecoVenda());

            stmt.executeUpdate();
        }
    }
	public void removerProduto(int codigo) throws SQLException{
		String sql = "DELETE FROM produto WHERE codigo = ?";
		try (Connection conn = ConexaoPostgres.conectar();
	    		 PreparedStatement stmt = conn.prepareStatement(sql)){
	    		
	    		stmt.setInt(1, codigo);
	    		stmt.executeUpdate();
		}
	}
	public void alterarPreco(int codigo, double precoCompra, double precoVenda) throws SQLException {
        String sql = "UPDATE produto SET preco_compra = ?, preco_venda = ? WHERE codigo = ?";

        try (Connection conn = ConexaoPostgres.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, precoCompra);
            stmt.setDouble(2, precoVenda);
            stmt.setInt(3, codigo);

            stmt.executeUpdate();
        }
    }
}
