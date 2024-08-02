package models.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

	private Integer id;
	private String nome;
	private LocalDate birthDate;
	
	private List<Todo> todos = new ArrayList<>();
	
	public User(Integer id, String nome, LocalDate birthDate) {
		super();
		this.id = id;
		this.nome = nome;
		this.birthDate = birthDate;
	}
	
	public String addTodo(Todo todo) {
		todos.add(todo);
		return "TO DO ADICIONADO!";
	}
	
	public String removeTodo(Todo todo) {
		todos.remove(todo);
		return "TO DO REMOVIDO!";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}
	
	public List<Todo> getTodos() {
		return todos;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", nome=" + nome + ", birthDate=" + birthDate + "]";
	}
	
}
