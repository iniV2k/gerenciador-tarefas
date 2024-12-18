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
			System.out.println("Não há nenhuma tarefa listada.\n");
			return;
		} else {
			tarefas.forEach(System.out::println);
		}
		System.out.println();
	}

	public void concluirTarefa(int indice) {
		Resultado.completarSolicitacao(indice, tarefas, (i, t) -> {
			t.get(i).setStatus("concluída");
			System.out.println("Tarefa '" + t.get(i) + "' marcada como concluída");
		});
	}
	
	public void removerTarefa(int indice) {
		Resultado.completarSolicitacao(indice, tarefas, (i, t) -> {
			String titulo = t.get(i).getTitulo();
			t.removeIf(tarefa -> tarefa.getId() - 1 == i);
			System.out.println("Tarefa '" + titulo + "' excluída com sucesso!");
		});
	}

}
