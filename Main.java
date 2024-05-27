package trim2_POO.Aula_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo v = new Veiculo();
		
		String marca = "", modelo = "", combustivel = "";
		float capacidade_tanque = 0, km_viagem = 0, autonomia = 0;
		int veiculo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um veículo para utilizar na viagem\n\n"
				+ "\n=======================================================\n"
				+ "1. Popular {\n"
					+ "\tMarca: Fiat\n"
					+ "\tModelo: Cronos 1.3 Drive 2024\n"
					+ "\tCombustível: Gasolina\n"
					+ "\tCapacidade do Tanque: 48 Litros\n"
					+ "\tAutonomia: 14,8\n"
				+ "}"
				+ "\n=======================================================\n"
				+ "2. SUV {\n"
					+ "\tMarca: Volkswagen\n"
					+ "\tModelo: T-Cross 1.0 200 TSI Sense (Aut) 2024\n"
					+ "\tCombustível: Gasolina\n"
					+ "\tCapacidade do Tanque: 52 Litros\n"
					+ "\tAutonomia: 14,4\n"
				+ "}"
				+ "\n=======================================================\n"
				+ "3. MiniVan {\n"
					+ "\tMarca: Chevrolet\n"
					+ "\tModelo: Spin LTZ 7S 1.8 (Flex) (Aut) 2025\n"
					+ "\tCombustível: Gasolina\n"
					+ "\tCapacidade do Tanque: 53 Litros\n"
					+ "\tAutonomia: 10,8\n"
				+ "}"
				+ "\n=======================================================\n"
				+ "Digite 1 para carro popular, 2 para SUV ou 3 para Minivan: ");
		veiculo = sc.nextInt();
		
		switch (veiculo) {
			case 1:
				marca = "Fiat";
				modelo = "Cronos 1.3 Drive 2024";
				combustivel = "Gasolina";
				capacidade_tanque = 48;
				autonomia = 14.8f;
			case 2:
				marca = "Volkswagen";
				modelo = "T-Cross 1.0 200 TSI Sense (Aut) 2024";
				combustivel = "Gasolina";
				capacidade_tanque = 52;
				autonomia = 14.4f;
			case 3:
				marca = "Chevrolet";
				modelo = "Spin LTZ 7S 1.8 (Flex) (Aut) 2025";
				combustivel = "Gasolina";
				capacidade_tanque = 53;
				autonomia = 10.8f;
			default:
				System.out.println("Carro não cadastrado no sistema!");
				System.exit(0);
				
			v.marca = marca;
			v.modelo = modelo;
			v.combustivel = combustivel;
			v.autonomia = autonomia;
			
			System.out.println("Informe a distância a ser percorrida na viagem: ");
			km_viagem = sc.nextFloat();
		}
	}

}
