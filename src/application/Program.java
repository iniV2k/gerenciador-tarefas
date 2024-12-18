package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Gerenciador de Tarefas ===");
		System.out.println("1. Adicionar Tarefa");
		System.out.println("2. Listas Tarefa");
		System.out.println("3. Marcar Tarefa");
		System.out.println("4. Excluir Tarefa");
		System.out.println("5. Sair");
		System.out.print("Escolha uma opção: ");
		
		sc.close();
	}
}