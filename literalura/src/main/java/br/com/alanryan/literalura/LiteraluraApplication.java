package br.com.alanryan.literalura;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();

		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(LiteraluraApplication.class, args);
	}
}
