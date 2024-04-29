package trim1;

import java.util.Scanner;

public class Desafio_Tabela_Preco_Carro {
    public static void main(String[] args) {
        int qtde_parcelas;
        float valor_carro, valor_parcela, valor_total, percent_acrescimo = 0, percent_desconto = 0;;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nInforme o valor pago no carro: ");
        valor_carro = sc.nextFloat();
        
        System.out.println("Informe a quantidade de parcelas (6, 12, 18, 24, 30, 36, 42, 48, 54, 60). Caso o pagamento seja à vista, digite 1.");
        qtde_parcelas = sc.nextInt();
        
        sc.close();
        
        switch (qtde_parcelas) {
            case 1:
                percent_desconto = 0.2f;
                break;
            case 6:
                percent_acrescimo = 0.03f;
                break;
            case 12:
                percent_acrescimo = 0.06f;
                break;
            case 18:
                percent_acrescimo = 0.09f;
                break;
            case 24:
                percent_acrescimo = 0.12f;
                break;
            case 30:
                percent_acrescimo = 0.15f;
                break;
            case 36:
                percent_acrescimo = 0.18f;
                break;
            case 42:
                percent_acrescimo = 0.21f;
                break;
            case 48:
                percent_acrescimo = 0.24f;
                break;
            case 54:
                percent_acrescimo = 0.27f;
                break;
            case 60:
                percent_acrescimo = 0.3f;
                break;
            default:
                System.out.printf("Não é possível parcelar em %d vezes!!!", qtde_parcelas);
                System.exit(0);
        }
        
        valor_total = valor_carro + valor_carro * percent_acrescimo - valor_carro * percent_desconto;
        valor_parcela = valor_total / qtde_parcelas;
        
        System.out.printf("|Valor Total\t|Qtde. Parcelas\t|Valor Parcela\t|\n|%.2f\t|\t%d\t|%.2f\t|\n", valor_total, qtde_parcelas, valor_parcela);
    }
}
