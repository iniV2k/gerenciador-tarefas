package application;

import java.util.Locale;
import java.util.Scanner;

import util.GerenciadorDeTarefas;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		boolean rodando = true;
		GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
		
		while (rodando) {
			
			System.out.println("=== Gerenciador de tarefas ===");
			System.out.println("1. Adicionar tarefa");
			System.out.println("2. Listar tarefas");
			System.out.println("3. Marcar tarefa como concluída");
			System.out.println("4. Excluir tarefa");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");			
			
			int opcao;
			if (sc.hasNextInt()) {
				opcao = sc.nextInt();
				sc.nextLine();
			} else {
				System.out.println("Entrada inválida, reinicie o programa.");
				break;
			}
			
			switch (opcao) {
			case 1:
				System.out.print("\nDigite o título da tarefa: ");
				gerenciador.addTarefa(sc.nextLine());
				break;
			case 2:
				gerenciador.listarTarefas();
				break;
			case 3:
				System.out.print("\nDigite o ID da tarefa: ");
				gerenciador.concluirTarefa(sc.nextInt() - 1);
				break;
			case 4:
				System.out.print("\nDigite o ID da tarefa: ");
				gerenciador.removerTarefa(sc.nextInt() - 1);
				break;
			case 5:
				System.out.println("Gerenciador de tarefas finalizado!");
				rodando = false;
				break;
			default:
				System.out.println("\nOpção inválida\n");
				break;
			}
			
		}
		
		sc.close();
	}
}