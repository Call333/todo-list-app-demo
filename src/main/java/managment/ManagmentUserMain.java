package managment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.entity.User;

public class ManagmentUserMain {
	
	private List<User> users = new ArrayList<>();
	
	ManagmentTodoMain menu = new ManagmentTodoMain();
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	User admin = new User("Calebe", LocalDate.of(2003, 03, 20), "1234");
	
	
	public void Menu() {
		users.add(admin);
		while(true) {
			System.out.println(" -----> Criar ou Logar na To Do List <----- ");
			System.out.println(
					" O que deseja fazer? "
					+ "\n 1 - Logar na sua conta"
					+ "\n 2 - Criar conta"
					+ "\n 3 - Sair");
			
			Scanner sc = new Scanner(System.in);
			int resp = sc.nextInt();
			sc.nextLine();
			if(resp == 1) {
				System.out.println(" ---> Dados do Usuário: < --- ");
				System.out.print("Nome de usuário: ");
				String nome = sc.nextLine();
				System.out.print("Senha de usuário: ");
				String password = sc.next();
				
				for (User user : users) {
					if(user.getNome().equals(nome) && user.getPassword().equals(password)) {
						menu.Menu(user);
						// Talvez precise de um break aq
					}
				}
			}
			if(resp == 2) {
				System.out.println(" ---> Dados do Novo Usuário: < --- ");
				System.out.print(" Nome de novo usuário: ");
				String nome = sc.nextLine();
				for (User user : users) {
					if(user.getNome() == nome) {
						System.out.println("Nome de usuário já existente, tente outro.");
						return;
					}
				}
				System.out.print(" Senha de novo usuário: ");
				String password = sc.next();
				System.out.print(" Data de nascimento de novo usuário: ");
				LocalDate birthDate = LocalDate.parse(sc.next(), dtf);
				users.add(new User(nome, birthDate, password));
			}
			if(resp == 3) {
				System.out.println("Saindo...");
				sc.close();
				break;
			}
			if(resp == 4) {
				if(users.isEmpty()) {
					System.out.println("A lista de usuarios está vazia.");
				}
				for (User user : users) {
					System.out.println(user);
				}
			}
		}
		
	}
}
