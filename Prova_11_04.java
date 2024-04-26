package trim1;

import java.util.Scanner;

public class Prova_11_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario_carlos, salario_joao;
		int meses;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o salário do Carlos: ");
		salario_carlos = sc.nextFloat();
		salario_joao = salario_carlos/3;
		
		sc.close();
		
		meses = 0;
		
		while (salario_joao < salario_carlos) {
			salario_carlos += salario_carlos * 0.6f / 100;
			salario_joao += salario_joao * 1 / 100;
			meses++;
			System.out.printf("===================================\n\nMês: %d \nSalário Carlos: %.2f \nSalário João: %.2f\n\n", meses, salario_carlos, salario_joao);
		}
		System.out.printf("===================================\n\nO salário de João levará %d meses para ultrapassar o de Carlos", meses);
	}

}
