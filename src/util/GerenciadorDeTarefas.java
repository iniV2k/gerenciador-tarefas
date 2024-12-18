package util;

import java.util.ArrayList;
import java.util.List;

import entities.Tarefa;

public class GerenciadorDeTarefas {

	List<Tarefa> tarefas = new ArrayList<>();
	private int id = 1;
	
	public void addTarefa(String titulo) {
		if (titulo.isBlank()) {
			System.out.println("\nNão pode adicionar uma tarefa sem título.\n");
			return;
		}
		
		tarefas.add(new Tarefa(id++, titulo, "pendente"));
		System.out.println("Tarefa '" + titulo + "' adicionada com sucesso!");
	}
	
	
}
