package application;

import java.time.LocalDate;

import models.entity.Todo;
import models.entity.User;

public class App {
	public static void main(String[] args) {
		Todo todo01 = new Todo(1, "faxina", "Limpar a casa");
		
		// System.out.println(todo01);
		
		User user01 = new User(1, "Calebe", LocalDate.now());
		
		user01.addTodo(todo01);
		
		System.out.println(user01.getTodos());
	}
}
