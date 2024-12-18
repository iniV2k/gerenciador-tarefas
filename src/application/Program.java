package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.Tarefa;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		boolean rodando = true;
		List<Tarefa> tarefas = new ArrayList<>();
		int id = 1;
		
		while (rodando) {
			
			System.out.println("=== Gerenciador de Tarefas ===");
			System.out.println("1. Adicionar Tarefa");
			System.out.println("2. Listas Tarefa");
			System.out.println("3. Marcar Tarefa");
			System.out.println("4. Excluir Tarefa");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			
			int opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o título da tarefa: ");
				String titulo = sc.nextLine();
				tarefas.add(new Tarefa(id++, titulo, "Pendente"));
				System.out.println("Tarefa adicionada com sucesso!");
				break;
			case 2:
				//
				break;
			case 3:
				//
				break;
			case 4:
				//
				break;
			case 5:
				//
				break;
			default:
				//
				break;
			}
			
		}
		
		sc.close();
	}
}