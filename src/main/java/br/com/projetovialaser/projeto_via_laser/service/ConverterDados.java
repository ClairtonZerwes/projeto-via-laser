package br.com.projetovialaser.projeto_via_laser.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterDados {
    private ObjectMapper mapper = new ObjectMapper();

    //@Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            // System.out.println(e.getOriginalMessage());
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
