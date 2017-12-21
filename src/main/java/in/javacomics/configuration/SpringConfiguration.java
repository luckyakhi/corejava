package in.javacomics.configuration;

import in.javacomics.abstraction.Flat;
import in.javacomics.encapsulation.TowerFlat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"in.javacomics"})
public class SpringConfiguration {
	@Bean	
	public Flat towerFlat(){
		return new TowerFlat(787f, 909f);
	}
  }
 