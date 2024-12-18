package util;

import java.util.List;

import entities.Tarefa;

public class Resultado {

	public static void completarSolicitacao(int indice, List<Tarefa> tarefas, CompletarSolicitacao solicitacao) {
		boolean idEncontrado = tarefas.stream().anyMatch(t -> t.getId() - 1 == indice);
		System.out.println();
		if (idEncontrado) {
			solicitacao.executar(indice, tarefas);
		} else {
			System.out.println("Não foi encontrada nenhuma tarefa com o ID informado.");
		}
		System.out.println();
	}
}