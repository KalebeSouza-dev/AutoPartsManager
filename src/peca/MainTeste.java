package peca;

public class MainTeste {

	public static void main(String[] args) {
		PecaController controller = new PecaController();
		
		System.out.println(controller.removerPeca(101));
		System.out.println(controller.adicionarPeca(101, "Filtro de óleo", "Filtro de óleo para VW"));
		
		System.out.println("Lista de peças");
		String[] pecas = controller.listarPecas();
		for (String p: pecas) {
			System.out.println("- " + p);
		}
		
		Peca peca = controller.getPeca(101);
        if (peca != null) {
            System.out.println("\nPeça consultada pelo ID 101:");
            System.out.println("Nome: " + peca.getNome());
            System.out.println("Descrição: " + peca.getDescricao());
        } else {
            System.out.println("Peça não encontrada.");
        }
	
	}

}
