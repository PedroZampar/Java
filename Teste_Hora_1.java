package trim2_POO.Aula_3;

public class Teste_Hora_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cria e inicializa um objeto Time1
		Hora1 time = new Hora1();
		displayTime("Hora após o objeto ser cirado: ", time);
		System.out.println();
		time.setTime(13, 27, 6);
		displayTime("Depois de chamar a função setTime", time);
		System.out.println();
		try {
			time.setTime(99, 99, 99);
		}
		catch (IllegalArgumentException e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		displayTime("Depois de chamar a função SetTime com valores inválidos", time);
	}
	private static void displayTime(String header, Hora1 t) {
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s PM\n",
				header, t.toUniversalString(),t.toString());
	}
}
