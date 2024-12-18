package util;

import java.util.List;

import entities.Tarefa;

public interface CompletarSolicitacao {

	void executar(int indice, List<Tarefa> tarefas);
}
