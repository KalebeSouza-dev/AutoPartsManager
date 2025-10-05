package peca;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PecaController {
	private Map<Integer, Peca> pecas;
	private PecaDAO pecaDao;
	
	public PecaController() {
		this.pecas = new HashMap<>();
		this.pecaDao = new PecaDAO();
		carregarPecasBanco();
	}
	private void carregarPecasBanco() {
        try {
            List<Peca> lista = pecaDao.listarTodos();
            for (Peca p : lista) {
                pecas.put(p.getID(), p);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar peças: " + e.getMessage());
        }
    }
	public String adicionarPeca(int ID, String nome, String descricao) {
		Peca peca = new Peca(ID, nome, descricao);
		pecas.put(ID, peca);
		
		try {
            pecaDao.inserirPeca(peca);
        } catch (SQLException e) {
            return "Erro ao inserir peça no banco: " + e.getMessage();
        }
		
		return "Peça adicionada com sucesso!";
	}
	public String removerPeca(int ID) {
		this.pecas.remove(ID);
		
		try {
	        pecaDao.removerPeca(ID);
	    } catch (SQLException e) {
	        return "Erro ao remover peça do banco: " + e.getMessage();
	    }
		
		return "Peça removida com sucesso!";
	}
	public String[] listarPecas() {
	    String[] out = new String[pecas.size()];
	    int i = 0;

	    for (Peca p : pecas.values()) {
	        out[i++] = p.toString();
	    }

	    return out;
	}
	public Peca getPeca(int idPeca) {
		return pecas.get(idPeca);
	}
}
