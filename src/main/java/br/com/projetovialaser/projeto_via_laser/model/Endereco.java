package br.com.projetovialaser.projeto_via_laser.model;

import jakarta.persistence.*;

@Entity
@Table(name="endereco")
public class Endereco {
    // Se der tempo vincular endereco CEP consultando API da VIACEP com logradouro do aluno
    // https://viacep.com.br/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String lote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getEdificio() {
        return Edificio;
    }

    public void setEdificio(String edificio) {
        Edificio = edificio;
    }

    public String getNumeroApto() {
        return numeroApto;
    }

    public void setNumeroApto(String numeroApto) {
        this.numeroApto = numeroApto;
    }

    private String Edificio;
    private String numeroApto;

    public Endereco(String logradouro, Integer numero, String bairro, String cidade, String estado, String cep, String lote, String edificio, String numeroApto) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.lote = lote;
        Edificio = edificio;
        this.numeroApto = numeroApto;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
