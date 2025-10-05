package app;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		AutoPartsFacade AP = new AutoPartsFacade();
		Scanner scanner = new Scanner(System.in);
		
		String escolha = "";
		while (true) {
			escolha = menu(scanner);
			comando(escolha, AP, scanner);
		}
	}
	private static String menu(Scanner scanner) {
		System.out.println(
				"\n---\nMENU\n" + 
						"(C)Cadastrar Peça\n" + 
						"(L)Listar Peças\n" + 
						"(A)Adicionar Produto\n" + 
						"(E)Exibir Produto\n" +

						"(S)Sair\n" + 
						"\n" + 
						"Opção> ");
		String opcao = scanner.next().toUpperCase();
		return opcao;
	}
	private static void comando(String opcao, AutoPartsFacade AP, Scanner scanner) {
		switch (opcao) {
		case "C":
			cadastrarPeca(AP, scanner);
			break;
		case "L":
			listarPecas(AP, scanner);
			break;
		case "A":
			cadastrarProduto(AP, scanner);
			break;
		case "E":
			listarProdutos(AP, scanner);
			break;
		
		default:
			System.out.println("Opção inválida!");
		}
	}
	
	private static void listarProdutos(AutoPartsFacade AP, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	private static void cadastrarProduto(AutoPartsFacade AP, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	private static void listarPecas(AutoPartsFacade AP, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	private static void cadastrarPeca(AutoPartsFacade AP, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
}
