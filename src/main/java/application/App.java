package application;

import java.time.LocalDate;

import managment.ManagmentTodoMain;
import managment.ManagmentUserMain;
import models.entity.Todo;
import models.entity.User;

public class App {
	public static void main(String[] args) {
		// System.out.println(user01.getTodos());
		
		ManagmentUserMain menuUser = new ManagmentUserMain();
		menuUser.Menu();
	}
}
