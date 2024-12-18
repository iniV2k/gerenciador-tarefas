package util;

import java.util.ArrayList;
import java.util.List;

import entities.Tarefa;

public class GerenciadorDeTarefas {

	List<Tarefa> tarefas = new ArrayList<>();
	private int id = 1;

	public void addTarefa(String titulo) {
		System.out.println();
		if (titulo.isBlank()) {
			System.out.println("\nNão pode adicionar uma tarefa sem título.\n");
			return;
		} else {
			tarefas.add(new Tarefa(id++, titulo, "pendente"));
			System.out.println("Tarefa '" + titulo + "' adicionada com sucesso!");
		}
		System.out.println();		
	}

	public void listarTarefas() {
		System.out.println();
		if (tarefas.isEmpty()) {
			System.out.println("Não há nenhuma tarefa listada.");
			return;
		} else {
			tarefas.forEach(System.out::println);
		}
		System.out.println("");
	}

	public void concluirTarefa(int id) {
		boolean idEncontrado = tarefas.stream().anyMatch(t -> t.getId() - 1 == id);
		System.out.println();
		if (idEncontrado) {
			tarefas.get(id).setStatus("concluída");
			System.out.println("Tarefa '" + tarefas.get(id).getTitulo() + "' marcada como concluída!");			
		} else {
			System.out.println("Não foi encontrada nenhuma tarefa com o ID informado.");
		}
		System.out.println();
	}

}
