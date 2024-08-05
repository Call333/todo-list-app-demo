package models.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {

	private UUID id;
	private String nome;
	private LocalDate birthDate;
	private String password;

	private List<Todo> todos = new ArrayList<>();

	public User( String nome, LocalDate birthDate, String password) {
		super();
		this.id = UUID.randomUUID();
		this.nome = nome;
		this.birthDate = birthDate;
		this.password = password;
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

	public UUID getId() {
		return id;
	}

	public List<Todo> getTodos() {
		return todos;
	}

	@Override
	public String toString() {
		return " ====== User "+ nome + " ====== " 
				+ "\n Id: " + id 
				+ "\n Nome: " + nome
				+ "\n Nascimento: " + birthDate
				+ "\n To Do's " + todos;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
