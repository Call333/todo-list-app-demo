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
		while (true) {
			System.out.println(" ------- Bem-vindo(a) a To do List ------- ");
			System.out.println(" O que deseja fazer? ");
			System.out.println(
						" 1 - Criar um TO DO. "
						+ "\n 2 - Ver TO DOS. " 
						+ "\n 3 - Editar um TODO. "
						+ "\n 4 - Remover um TODO. "
						+ "\n 5 - Sair.");

			Scanner sc = new Scanner(System.in);

			int resp = sc.nextInt();
			sc.nextLine();
			if (resp == 1) {
				resp = 0;
				System.out.print("Titulo: ");
				String titulo = sc.nextLine();
				System.out.print("Descricao: ");
				String descricao = sc.nextLine();

				Todo model = new Todo(titulo, descricao);
				user.addTodo(model);
			}
			if(resp == 2) {
				resp = 0;
				if(user.getTodos().isEmpty()) {
					System.out.println(" A lista está vazia.");
				}
				else {
					System.out.println(" --> To do's do usuário " + user.getNome() + " <-- ");
					for (Todo todo : user.getTodos()) {
						System.out.println(todo);
					}
				}
			}
			if(resp == 3) {
				resp = 0;
				System.out.print("Digite o ID do To Do a ser editado: ");
				String id = sc.next();
				for (Todo todo : user.getTodos()) {
					if(id.equals(todo.getId().toString())) {
						System.out.println("Digite o campo que deseja editar: "
								+ "\n 1 - Titulo."
								+ "\n 2 - Descricao.");
						
						resp = sc.nextInt();
						sc.nextLine();
						
						if (resp == 1) {
							System.out.print("Novo titulo: ");
							todo.setTitulo(sc.nextLine());
						}
						if (resp == 2) {
							System.out.print("Novo descricao: ");
							todo.setDescricao(sc.nextLine());
						}
					}
				}
			}
			if (resp == 4) {
				resp = 0;
				System.out.print("Digite o ID do To Do a ser excluido: ");
				String id = sc.next();
				Todo todoAux = null;
				for (Todo todo : user.getTodos()) {
					if(id.equals(todo.getId().toString())) {
						todoAux = todo;
					}
				}
				user.removeTodo(todoAux);
			}
			if (resp == 5) {
				System.out.println("Saindo da conta...");
				break;
			}
		}

	}

}
