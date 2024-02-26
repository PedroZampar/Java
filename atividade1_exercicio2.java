package trim1;

public class atividade1_exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario_bruto = 1500.00f;
		float descontoINSS = 11.0f;
		float salario_descontado = salario_bruto * ((100 - descontoINSS) / 100);
		float diferenca = salario_bruto - salario_descontado;
		
		System.out.printf("Salário com desconto de 11%% do INSS: %.2f\n", salario_descontado);
		System.out.printf("Diferença: R$%.2f", diferenca);
	}

}
