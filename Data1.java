package trim2_POO.Aula_3;

public class Data1 {
    private int dia;
    private int mes;
    private int ano;

    // Construtor padrão
    public Data1() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1900;
    }

    // Construtor do dia
    public Data1(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido: " + dia);
        }
        this.mes = 1; // Assumindo janeiro como padrão
        this.ano = 1900; // Assumindo 1900 como padrão
    }

    // Construtor com dia e mês
    public Data1(int dia, int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido: " + mes);
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia < 1 || dia > 31) {
                throw new IllegalArgumentException("O dia " + dia + " é inválido!");
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 1 || dia > 30) {
                throw new IllegalArgumentException("O dia " + dia + " é inválido!");
            }
        } else if (mes == 2) {
            if (dia < 1 || dia > 28 || (dia == 29 && !isAnoBissexto(this.ano))) {
                throw new IllegalArgumentException("O dia " + dia + " é inválido!");
            }
        }
        this.dia = dia;
        this.ano = 1900; // Assumindo 1900 como padrão
    }

    // Construtor com dia, mês e ano
    public Data1(int dia, int mes, int ano) {
        if (ano > 0) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("O ano " + ano + " é inválido!");
        }
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("O mês " + mes + " é inválido!");
        }
        if (dia >= 1 && dia <= diasNoMes(mes, ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("O dia " + dia + " é inválido para o mês " + mes);
        }
    }

    private int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 2:
                return (isAnoBissexto(ano) ? 29 : 28);
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    private boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public String formatoCurto() {
        return String.format("%02d/%02d/%02d", dia, mes, ano % 100);
    }

    public String formatoLongo() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String formatoPorExtenso() {
        String[] mesesPorExtenso = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        return String.format("%02d de %s de %04d", dia, mesesPorExtenso[mes - 1], ano);
    }
}
