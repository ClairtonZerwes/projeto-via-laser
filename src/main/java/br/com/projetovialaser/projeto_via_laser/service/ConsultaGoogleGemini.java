package br.com.projetovialaser.projeto_via_laser.service;

import br.com.projetovialaser.projeto_via_laser.Constantes.Constantes;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

public class ConsultaGoogleGemini {

    public static String obterDicasTreino(String texto) {
        ChatLanguageModel apiGemini = GoogleAiGeminiChatModel.builder()
                .apiKey(Constantes.CODIGO_API_KEY_GOOGLEGEMINI)
                .modelName(Constantes.MODEl_NAME_API_GOOGLEGEMINI)
                .build();

        try {
            // exemplo texto = "Peso Normal, Entre 18,6 e 24,9 Kg, do sexo masculino com 30 anos de idade"
            return apiGemini.generate("Dicas de treino para pessoa com classificação de IMC: " + texto);
        } catch (Exception e) {
            System.out.println("Erro ao obter dicas de treino com Api do GoogelGemini: " + e.getMessage());
            return "Erro ao processar a informações do GoogleGemini.";
        }
    }
}
