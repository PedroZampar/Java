package trim1;

import java.util.Scanner;

public class Atividade2_Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float salario;
		float salarioDescontado;
		float aliquota;
		float desconto;
		
		System.out.println("Calcular desconto do imposto de renda!\n");
		
		System.out.println("\nInforme seu salário: \n");
		salario = sc.nextFloat();
		
		sc.close();
		
		if (salario <= 1903.98) {
			aliquota = 0;
			desconto = salario * aliquota;
			salarioDescontado = (salario - desconto);
			System.out.println("Isento de descontos!\n");
			System.out.printf("\nO salário foi de %.2f para %.2f", salario, salarioDescontado);
		} else if (salario <= 2826.65) {
			aliquota = 0.075f;
			desconto = salario * aliquota;
			salarioDescontado = (salario - desconto);
			System.out.printf("Desconto em porcentagem: %.1f%%\n", aliquota*100);
			System.out.printf("Desconto em reais: R$%.2f\n", desconto);
			System.out.printf("O salário foi de %.2f para %.2f\n", salario, salarioDescontado);
		} else if (salario <= 3751.06) {
			aliquota = 0.15f;
			desconto = salario * aliquota;
			salarioDescontado = (salario - desconto);
			System.out.printf("Desconto em porcentagem: %.1f%%\n", aliquota*100);
			System.out.printf("Desconto em reais: R$%.2f\n", desconto);
			System.out.printf("O salário foi de %.2f para %.2f\n", salario, salarioDescontado);
		} else if (salario <= 4664.68) {
			aliquota = 0.225f;
			desconto = salario * aliquota;
			salarioDescontado = (salario - desconto);
			System.out.printf("Desconto em porcentagem: %.1f%%\n", aliquota*100);
			System.out.printf("Desconto em reais: R$%.2f\n", desconto);
			System.out.printf("O salário foi de %.2f para %.2f\n", salario, salarioDescontado);
		} else if (salario > 2826.65) {
			aliquota = 0.275f;
			desconto = salario * aliquota;
			salarioDescontado = (salario - desconto);
			System.out.printf("Desconto em porcentagem: %.1f%%\n", aliquota*100);
			System.out.printf("Desconto em reais: R$%.2f\n", desconto);
			System.out.printf("O salário foi de %.2f para %.2f\n", salario, salarioDescontado);
		}
	}
}
