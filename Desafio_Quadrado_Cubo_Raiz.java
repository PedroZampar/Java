package trim1;

import java.util.Scanner;

public class Desafio_Quadrado_Cubo_Raiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num, quad, cubo, raiz;
		
		System.out.println("Seja bem-vindo à calculadora de quadrado,cubo e raiz quadrada.\nDigite um número maior que 0 para começar.\nPara sair, digite 0.\n");
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextDouble();
		
		while (num > 0) {
			quad = num * num;
			cubo = num * num * num;
			raiz = Math.sqrt(num);
			System.out.printf("Quadrado: %f\nCubo: %f\nRaiz: %f\n", quad, cubo, raiz);
			System.out.println("Digite um número maior que 0 para realizar um noo cálculo.\nPara sair, digite 0.\n");
			num = sc.nextDouble();
		}
		sc.close();
	}

}
