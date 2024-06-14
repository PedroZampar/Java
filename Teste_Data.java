package trim2_POO.Aula_3;

public class Teste_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teste em construtores e formatos
        Data1 data1 = new Data1();
        System.out.println(data1.formatoCurto()); // 01/01/00
        System.out.println(data1.formatoLongo()); // 01/01/1900
        System.out.println(data1.formatoPorExtenso()); // 01 de janeiro de 1900

        Data1 dataDia = new DataDia(15);
        System.out.println(data2.formatoCurto()); // 15/01/00
        System.out.println(data2.formatoLongo()); // 15/01/1900
        System.out.println(data2.formatoPorExtenso()); // 15 de janeiro de 1900

        Data1 data3 = new Data3(15, 6);
        System.out.println(data3.formatoCurto()); // 15/06/00
        System.out.println(data3.formatoLongo()); // 15/06/1900
        System.out.println(data3.formatoPorExtenso()); // 15 de junho de 1900

        Data1 data4 = new Data4(29, 2, 2024);
        System.out.println(data4.formatoCurto()); // 29/02/24
        System.out.println(data4.formatoLongo()); // 29/02/2024
        System.out.println(data4.formatoPorExtenso()); // 29 de fevereiro de 2024

        // Teste de valores inválidos
        try {
            Data dataInvalida1 = new Data(29, 2, 2023); // Ano não bissexto
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Dia inválido para o mês fornecido
        }

        try {
            Data dataInvalida2 = new Data(32, 1, 2023); // Dia inválido
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Dia inválido para o mês fornecido
        }

        try {
            Data dataInvalida3 = new Data(15, 13, 2023); // Mês inválido
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Mês inválido
        }

        try {
            Data dataInvalida4 = new Data(15, 6, -1); // Ano inválido
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Ano inválido
        }
	}

}
