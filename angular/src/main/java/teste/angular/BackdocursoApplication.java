package teste.angular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import teste.angular.domain.Contatos;
import teste.angular.domain.enums.Operadoras;
import teste.angular.repositories.ContatosRepository;
import teste.angular.repositories.OperadorasRepository;

import java.util.Arrays;

@SpringBootApplication
public class BackdocursoApplication implements CommandLineRunner {

    @Autowired
    private ContatosRepository contatosRepository;

    @Autowired
    private OperadorasRepository operadorasRepository;


    public static void main(String[] args) {
        SpringApplication.run(BackdocursoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Contatos c1 = new Contatos(null, "guilherme", "11111111", 1);
        Contatos c2 = new Contatos(null, "joazinho", "329939349", 2);
        Contatos c3 = new Contatos(null, "pedro", "90871299", 0);
        contatosRepository.saveAll(Arrays.asList(c1, c2, c3));

       // Operadoras op1 = new Operadoras(null, "tim");


    //    OperadorasRepository


    }
}
