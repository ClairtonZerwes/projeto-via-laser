package br.com.projetovialaser.projeto_via_laser.Constantes;

import io.github.cdimascio.dotenv.Dotenv;

public class Constantes {
    private static Dotenv dotenv = Dotenv.load();
    public static  final String CODIGO_API_KEY_GOOGLEGEMINI = dotenv.get("API_KEY_GOOGLEGEMINI");
    public static  final String MODEl_NAME_API_GOOGLEGEMINI = "gemini-1.5-flash";
}
