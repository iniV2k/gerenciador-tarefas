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
			
			System.out.println("=== Gerenciador de tarefas ===");
			System.out.println("1. Adicionar tarefa");
			System.out.println("2. Listar tarefas");
			System.out.println("3. Marcar tarefa como concluída");
			System.out.println("4. Excluir tarefa");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			
			int opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.print("\nDigite o título da tarefa: ");
				String titulo = sc.nextLine();
				tarefas.add(new Tarefa(id++, titulo, "pendente"));
				System.out.println("\nTarefa '" + titulo + "' adicionada com sucesso!\n");
				break;
			case 2:
				if (!tarefas.isEmpty()) {
					System.out.println();
					tarefas.forEach(System.out::println);
					System.out.println();
				} else {
					System.out.println("\nLista de tarefas está vazia.\n");
				}
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