package teste.angular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import teste.angular.domain.enums.Contatos;
import teste.angular.repositories.ContatosRepository;

import java.util.Arrays;

@SpringBootApplication
public class BackdocursoApplication implements CommandLineRunner {

	@Autowired
	private ContatosRepository contatosRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackdocursoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Contatos c1 = new Contatos( "guilherme", "11111111" ,1);
		Contatos c2 = new Contatos( "joazinho", "329939349",2);
		Contatos c3 = new Contatos("pedro", "90871299" ,0);
		contatosRepository.saveAll(Arrays.asList(c1, c2, c3));
	}
}
