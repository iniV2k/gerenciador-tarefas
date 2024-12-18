package entities;

public class Tarefa {
	
	private int id;
	private String titulo;
	private String status;
	
	public Tarefa(int id, String titulo, String status) {
		this.id = id;
		this.titulo = titulo;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[" + id + "] ");
		sb.append(titulo + " - ");
		sb.append(status);
		return sb.toString();
	}
}
