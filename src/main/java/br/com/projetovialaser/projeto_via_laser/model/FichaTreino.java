package br.com.projetovialaser.projeto_via_laser.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ficha_treino")
public class FichaTreino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exercicio;
    private String descricao;
    private Integer repeticoes;
    private Double carga;
}
