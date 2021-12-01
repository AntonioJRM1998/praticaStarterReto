package starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("temperatura.tipo")
public class TemperaturaProperties {
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String tipo) {
		this.nombre=tipo;
	}
}
