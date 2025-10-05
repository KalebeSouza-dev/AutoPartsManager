package peca;

import java.util.HashMap;
import java.util.Map;

public class PecaController {
	private Map<Integer, Peca> pecas;
	
	public PecaController() {
		pecas = new HashMap<>();
	}
	public void adicionarPeca(int ID, String nome, String descricao) {
		Peca peca = new Peca(ID, nome, descricao);
		pecas.put(ID, peca);
	}
	public String[] listarPecas() {
	    String[] out = new String[pecas.size()];
	    int i = 0;

	    for (Peca p : pecas.values()) {
	        out[i] = p.getNome();
	        i++;
	    }

	    return out;
	}
	public Peca getPeca(int idPeca) {
		return pecas.get(idPeca);
	}
}
