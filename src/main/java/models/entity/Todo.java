package models.entity;

public class Todo {
	private Integer id;
	private String titulo;
	private String descricao;

	public Todo(Integer id, String titulo, String descricao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public Integer getId() {
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
