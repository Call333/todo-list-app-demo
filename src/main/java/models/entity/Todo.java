package models.entity;

import java.util.UUID;

public class Todo {
	private UUID id;
	private String titulo;
	private String descricao;

	public Todo(String titulo, String descricao) {
		this.id = UUID.randomUUID();
;		this.titulo = titulo;
		this.descricao = descricao;
	}

	public UUID getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String toString() {
		return " ====== TO DO ====== " 
				+ "\n Id: " + id 
				+ "\n Titulo: " + titulo 
				+ "\n Descricao: " + descricao;
	}
}
