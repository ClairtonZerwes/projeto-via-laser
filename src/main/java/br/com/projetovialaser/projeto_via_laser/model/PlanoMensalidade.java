package br.com.projetovialaser.projeto_via_laser.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "plano_mensalidade")
public class PlanoMensalidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoPlanoMensalidade;
    private String descricaoPlanoMensalidade;
    private Double valorPlanoMensalidade;
    private Integer frequenciaSemanal;
    private Double percentualDesconto;
//    @OneToMany(mappedBy = "responsavel")
//    private List<Aluno> aluno;
}
