package starter;

public class Temperatura {
	private String tempe;
	
	public Temperatura(String tipo) {
		this.tempe=tipo;
	}
	public String mostrarTemperaturas(int temp) {
		return"Grados Celcuis"+ (temp-32/1.8f) +" Grados Fahrenheit "+((temp*1.8f)+32);
	}
	public int tipoTemp(int temp) {
		if(tempe.contentEquals("Fahrenheit")) {
			return (int)(temp-32/1.8f);
		}else if(tempe.contentEquals("Celcius")) {
			return (int)(temp*1.8f)+32;
		}else {
			return 0;
		}
	}
}
