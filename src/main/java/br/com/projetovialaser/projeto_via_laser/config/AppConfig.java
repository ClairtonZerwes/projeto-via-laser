package br.com.projetovialaser.projeto_via_laser.config;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @PostConstruct
    public void init() {
        Dotenv dotenv = Dotenv.load();
    }
}

