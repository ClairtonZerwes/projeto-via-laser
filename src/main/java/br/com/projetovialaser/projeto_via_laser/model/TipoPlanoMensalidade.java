package br.com.projetovialaser.projeto_via_laser.model;

public enum TipoPlanoMensalidade {
    BASE("Plano Base", 0),
    JUNIOR("Plano Junior", 20),
    PREMIUM("Plano Premium", 15),
    MELHORIDADE("Obesidade grau II", 25);

    private String tipoDePlano;
    private Integer descontoPlano;

    TipoPlanoMensalidade(String tipo, Integer desconto) {
        this.tipoDePlano = tipo;
        this.descontoPlano = desconto;
    }
}
