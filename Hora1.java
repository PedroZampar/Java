package trim2_POO.Aula_3;

public class Hora1 {
	private int hora;
	private int minuto;
	private int segundo;
	
	public void setTime(int hora, int minuto, int segundo) {
		if (hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60) {
			throw new IllegalArgumentException("Hora, minuto e/ou segundo inválido(s)!");
		}
		
		this.hora = hora; 
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d", ((hora == 0 || hora == 12) ? 12 : hora % 12), minuto, segundo, (hora < 12 ? "AM" : "PM"));
	}
}
