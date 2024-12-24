package br.com.projetovialaser.projeto_via_laser.model;

public enum ClassificacaoIndiceMassaCorporal {
    BAIXO("Baixo", "Abaixo de 18,5Kg"),
    NORMAL("Normal", "Abaixo de 18,5Kg"),
    SOBREPESO("Sobrepeso", "Abaixo de 18,5 Kg"),
    OBESIDADEGRAU1("Obesidade grau I", "Entre 30 e 34,9 Kg"),
    OBESIDADEGRAU2("Obesidade grau II", "Entre 35 e 39,9 Kg"),
    OBESIDADEGRAU3("Obesidade grau III", "Acima de 40 Kg");

    private String classificacaoIMC;
    private String classificacaoFaixaPesoIMC;

    ClassificacaoIndiceMassaCorporal(String tipoIMC, String faixaPesoIMC) {
        this.classificacaoIMC = tipoIMC;
        this.classificacaoFaixaPesoIMC = faixaPesoIMC;
    }
}
