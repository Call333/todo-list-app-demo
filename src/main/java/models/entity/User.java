package models.entity;

import java.time.LocalDate;

public class User {

	private Integer id;
	private String nome;
	private LocalDate birthDate;

	public User(Integer id, String nome, LocalDate birthDate) {
		super();
		this.id = id;
		this.nome = nome;
		this.birthDate = birthDate;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", nome=" + nome + ", birthDate=" + birthDate + "]";
	}
	
}
