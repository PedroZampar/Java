package trim1;

import java.util.Scanner;

public class Desafio_Calculo_Media_Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite a idade e de um Enter para informar a próxima\nPara finalizar o programa, digite 0.\n");
		
		int i, qtde = 0;
		float media = 0f;
		boolean fim = false;

		Scanner sc = new Scanner(System.in);
		
		while (fim == false) {
			i = sc.nextInt();
			if (i <= 0) {
				fim = true;
			} else {
				media += i;
				qtde++;
			}
		}
		
		sc.close();
		
		media /= qtde;
		
		System.out.printf("\nA média das idades é de aproximadamente %.2f anos.\n", media);
	}
}
