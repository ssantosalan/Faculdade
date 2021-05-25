import java.util.Scanner;

public class ValidarSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha, senhaSistema;
		String usuario;
		
		System.out.println("Defina Usuário: ");
		usuario = sc.next();
		System.out.println("Defina sua senha: ");
		senhaSistema = sc.nextInt();
		System.out.println("Login/Senha Definida com sucesso!!!");

		System.out.println("\n"); // pula 3 linhas
		
		
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Usuário: ");
			String validarUsuario = sc.next();
			System.out.println("Senha: ");
			senha = sc.nextInt();
			
			if (senha == senhaSistema && validarUsuario.equals(usuario)) {
				System.out.println("Senha e usuários válidos!");
				break;
			} else {
				System.out.println("Senha ou usuário inválidos!");
				if (i == 3) {
					System.out.println("Senha bloqueada!");
				}
				
			}
			
		}
		
	}
	
}