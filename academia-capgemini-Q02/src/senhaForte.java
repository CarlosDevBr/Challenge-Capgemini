import java.util.Scanner;

import utils.ValidadorSenhas;

public class senhaForte {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma senha: ");
		String senha = sc.nextLine();
		
		if(senha.length() > 6) {
			System.out.println(ValidadorSenhas.howManyAreMissing(senha));
		}
		else {
			if(senha.length() <= 3) { 
				if(ValidadorSenhas.howManyAreMissing(senha) == 0) {
					System.out.println(6 - senha.length());
				}
				else {
				System.out.println(6 - senha.length() + ValidadorSenhas.howManyAreMissing(senha) - 1);
				}
			}
		}
		
		
		System.out.println(ValidadorSenhas.howManyAreMissing(senha));
		sc.close();
	}
}
