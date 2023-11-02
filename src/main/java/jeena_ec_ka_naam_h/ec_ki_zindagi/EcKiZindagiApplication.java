package jeena_ec_ka_naam_h.ec_ki_zindagi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"jeena_ec_ka_naam_h.ec_ki_zindagi"})
public class EcKiZindagiApplication {

	public static void main(String[] args) {

		SpringApplication.run(EcKiZindagiApplication.class, args);
	}

}
