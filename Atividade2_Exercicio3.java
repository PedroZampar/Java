package trim1;

import java.util.Scanner;

public class Atividade2_Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int dia;
		        Scanner sc = new Scanner(System.in);

		        System.out.print("\nDigite um número referente a um dia da semana\n1. Domingo\n2. Segunda\n3. Terça\n4. Quarta\n5. Quinta \n6. Sexta \n7. Sábado\n");
		        dia = sc.nextInt();
		        
		        sc.close();

		        switch (dia) {
		            case 1:
		                System.out.printf("\nO dia escolhido foi Domingo!");
		                break;
		            case 2:
		            	System.out.printf("\nO dia escolhido foi Segunda-Feira!");
		                break;
		            case 3:
		            	System.out.printf("\nO dia escolhido foi Terça-Feira!");
		                break;
		            case 4:
		            	System.out.printf("\nO dia escolhido foi Quarta-Feira!");
		                break;
		            case 5:
		            	System.out.printf("\nO dia escolhido foi Quinta-Feira!");
		                break;
		            case 6:
		            	System.out.printf("\nO dia escolhido foi Sexta-Feira!");
		                break;
		            case 7:
		            	System.out.printf("\nO dia escolhido foi Sábado!");
		                break;
		            default:
		                System.out.println("Opção inválida.");
		        	}
		    }

}
