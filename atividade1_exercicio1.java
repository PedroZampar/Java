package trim1;

import java.util.Scanner;

public class atividade1_exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, n4;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		n1 = sc.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		n2 = sc.nextFloat();
		
		System.out.println("Informe a terceira nota: ");
		n3 = sc.nextFloat();
		
		System.out.println("Informe a quarta nota: ");
		n4 = sc.nextFloat();
		
		float media = (n1*2 + n2*2 + n3*3 + n4*3)/10;
		
		System.out.printf("\nA média ponderada de %.1f, %.1f, %.1f e %.1f é %.1f\n", n1, n2, n3, n4, media);
		
		if (media >= 6) {
			System.out.println("Situação: Aprovado");
		} else {
			System.out.println("Situação: Reprovado");
		
		sc.close();
		}
	}

}
