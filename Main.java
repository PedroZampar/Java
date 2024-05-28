package trim2_POO.Aula_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo v = new Veiculo();
		
		String marca = "", modelo = "", combustivel = "";
		float qtde_tanques, km_por_tanque, combustivel_gasto, km_viagem, autonomia = 0, capacidade_tanque = 0;
		int veiculo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um veículo para utilizar na viagem\n\n"
				+ "\n===========================================================================\n"
				+ "1. Popular {\n"
					+ "\tMarca: Fiat\n"
					+ "\tModelo: Cronos 1.3 Drive 2024\n"
					+ "\tCombustível: Gasolina\n"
					+ "\tCapacidade do Tanque: 48 Litros\n"
					+ "\tAutonomia: 14,8\n"
				+ "}"
				+ "\n===========================================================================\n"
				+ "2. SUV {\n"
					+ "\tMarca: Volkswagen\n"
					+ "\tModelo: T-Cross 1.0 200 TSI Sense (Aut) 2024\n"
					+ "\tCombustível: Gasolina\n"
					+ "\tCapacidade do Tanque: 52 Litros\n"
					+ "\tAutonomia: 14,4\n"
				+ "}"
				+ "\n===========================================================================\n"
				+ "3. MiniVan {\n"
					+ "\tMarca: Chevrolet\n"
					+ "\tModelo: Spin LTZ 7S 1.8 (Flex) (Aut) 2025\n"
					+ "\tCombustível: Gasolina\n"
					+ "\tCapacidade do Tanque: 53 Litros\n"
					+ "\tAutonomia: 10,8\n"
				+ "}"
				+ "\n===========================================================================\n"
				+ "Digite 1 para carro popular, 2 para SUV ou 3 para Minivan: ");
		veiculo = sc.nextInt();
		
		switch (veiculo) {
			case 1:
				marca = "Fiat";
				modelo = "Cronos 1.3 Drive 2024";
				combustivel = "Gasolina";
				capacidade_tanque = 48;
				autonomia = 14.8f;
				break;
			case 2:
				marca = "Volkswagen";
				modelo = "T-Cross 1.0 200 TSI Sense (Aut) 2024";
				combustivel = "Gasolina";
				capacidade_tanque = 52;
				autonomia = 14.4f;
				break;
			case 3:
				marca = "Chevrolet";
				modelo = "Spin LTZ 7S 1.8 (Flex) (Aut) 2025";
				combustivel = "Gasolina";
				capacidade_tanque = 53;
				autonomia = 10.8f;
				break;
			default:
				System.out.println("Carro não cadastrado no sistema!");
				System.exit(0);
		}
				
			v.marca = marca;
			v.modelo = modelo;
			v.combustivel = combustivel;
			v.autonomia = autonomia;
			
			System.out.println("Informe a distância a ser percorrida na viagem: ");
			km_viagem = sc.nextFloat();
			
			km_por_tanque = capacidade_tanque * autonomia;
			qtde_tanques = km_viagem / km_por_tanque;
			combustivel_gasto = (km_por_tanque * qtde_tanques) / autonomia;
			
			if (km_viagem <= km_por_tanque) {
				System.out.println("\n===========================================================================");
				System.out.println("Será possível realizar a viagem sem parar para abastecer!");
			} else {
				System.out.println("\n===========================================================================");
				System.out.printf("Será preciso abastecer o tanque %.0f vez para concluir a viagem!", Math.floor(qtde_tanques)); // Arredonda para baixo a quantidade de tanques
			}
			
			System.out.println("\n===========================================================================");
			System.out.printf("Foram gastos %.2f litros de %s nessa viagem!", combustivel_gasto, combustivel);
			System.out.println("\n===========================================================================");
			
			sc.close();
	}
}
			km_viagem = sc.nextFloat();
		}
	}

}
