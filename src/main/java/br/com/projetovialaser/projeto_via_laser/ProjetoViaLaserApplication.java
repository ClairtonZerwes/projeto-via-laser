package br.com.projetovialaser.projeto_via_laser;

import br.com.projetovialaser.projeto_via_laser.principal.Principal;
import br.com.projetovialaser.projeto_via_laser.view.AlunoView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoViaLaserApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoViaLaserApplication.class, args);
    }

    @Autowired
    //private AlunoRepository alunoRepository;
    private AlunoView alunoView;
    private Principal principal;

    @Override
    public void run(String... args) throws Exception {
        //principal = new Principal(alunoView);
        principal.exibeMenu();
    }
}

