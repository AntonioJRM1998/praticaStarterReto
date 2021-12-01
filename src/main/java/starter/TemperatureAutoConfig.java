package starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Temperatura.class)
@EnableConfigurationProperties(TemperaturaProperties.class)
public class TemperatureAutoConfig {
	private TemperaturaProperties temperaturaProperties;
	
	public TemperatureAutoConfig(TemperaturaProperties properties) {
		this.temperaturaProperties=properties;
	}
	@Bean
	public Temperatura Temperatura() {
		return new Temperatura(temperaturaProperties.getNombre());
	}
}
