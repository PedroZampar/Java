package trim1;

import java.util.Scanner;

public class Atividade2_Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nomeDisciplina;
		int aulasDadas;
		int aulasPresenciadas;
		float n1;
		float n2;
		float n3;
		float n4;
		
		System.out.println("Informe o nome da disciplina: ");
		nomeDisciplina = sc.next();
		
		System.out.println("Informe a quantidade de aulas dadas: ");
		aulasDadas = sc.nextInt();
		
		System.out.println("Informe a quantidade de aulas presenciadas: ");
		aulasPresenciadas = sc.nextInt();
		
		System.out.println("Informe a média do 1° bimestre: ");
		n1 = sc.nextFloat();
		
		System.out.println("Informe a média do 2° bimestre: ");
		n2 = sc.nextFloat();
		
		System.out.println("Informe a média do 3° bimestre: ");
		n3 = sc.nextFloat();
		
		System.out.println("Informe a média do 4° bimestre: ");
		n4 = sc.nextFloat();
		
		sc.close();
		
		float percentualPresenca = (float)((float)aulasPresenciadas/(float)aulasDadas) * 100;
		float media = (n1+n2+n3+n4)/4;
		
		if (media >= 6 && percentualPresenca >= 75) {
			System.out.printf("Na disciplina %s média do(a) aluno(a) foi %.2f\n",nomeDisciplina, media);
			System.out.printf("A taxa de presença do aluno foi de %.2f %%\n", percentualPresenca);
			System.out.println("Aluno Aprovado!");
		} else {
			System.out.printf("Na disciplina %s média do(a) aluno(a) foi %.2f\n",nomeDisciplina, media);
			System.out.printf("A taxa de presença do aluno foi de %.2f %%\n", percentualPresenca);
			System.out.println("Aluno Reprovado!");
		}
	}

}
