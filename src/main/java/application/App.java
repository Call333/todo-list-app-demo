package application;

import models.entity.Todo;

public class App {
	public static void main(String[] args) {
		Todo todo01 = new Todo(1, "faxina", "Limpar a casa");
		
		System.out.println(todo01);
		
	}
}
