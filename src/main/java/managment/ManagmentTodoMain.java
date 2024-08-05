package managment;

import java.util.Scanner;

import models.entity.Todo;
import models.entity.User;

/* 
 * Essa classe terá as funções para 
 * rodar o código organizado por funções
 * na classe App, no pacote application
 */
public class ManagmentTodoMain {
	
	public void Menu(User user) {
		while(true) {
			System.out.println(" ------- Bem-vindo(a) a To do List ------- ");
			System.out.println(" O que deseja fazer? ");
			System.out.println(
					" 1 - Criar um TO DO. "
					+ "\n 2 - Ver TO DOS. "
					+ "\n 3 - Editar um TODO. "
					+ "\n 4 - Remover um TODO. ");
			
			Scanner sc = new Scanner(System.in);
			
			int resp = sc.nextInt();
			sc.nextLine();
			if(resp == 1) {
				resp = 0;
				System.out.print("Titulo: ");
				String titulo = sc.nextLine();
				System.out.println("Descricao: ");
				String descricao = sc.nextLine();
				
				Todo model = new Todo(titulo, descricao);
				user.addTodo(model);
			}
		}
		
	}
	
}
