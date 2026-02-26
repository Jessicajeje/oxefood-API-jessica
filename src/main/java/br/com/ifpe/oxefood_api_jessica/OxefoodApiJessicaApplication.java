package br.com.ifpe.oxefood_api_jessica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OxefoodApiJessicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OxefoodApiJessicaApplication.class, args);
	}

}
