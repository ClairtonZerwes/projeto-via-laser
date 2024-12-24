package br.com.projetovialaser.projeto_via_laser.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CascadeType;
//import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno() {    }

    public Aluno(Long id, String nome, LocalDate dataNascimento, Double peso, Double altura, String classificaoaoImc, String plano, String foneCelular, String email, Integer freqeunciaSemanal, Responsavel responsavel) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.altura = altura;
        this.classificaoaoImc = classificaoaoImc;
        this.plano = plano;
        this.foneCelular = foneCelular;
        this.email = email;
        this.freqeunciaSemanal = freqeunciaSemanal;
        this.responsavel = responsavel;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getClassificaoaoImc() {
        return classificaoaoImc;
    }

    public void setClassificaoaoImc(String classificaoaoImc) {
        this.classificaoaoImc = classificaoaoImc;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getFoneCelular() {
        return foneCelular;
    }

    public void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getFreqeunciaSemanal() {
        return freqeunciaSemanal;
    }

    public void setFreqeunciaSemanal(Integer freqeunciaSemanal) {
        this.freqeunciaSemanal = freqeunciaSemanal;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    @Column(unique = true)
    private String nome;
    private LocalDate dataNascimento;
    private Double peso;
    private Double altura;

    private Double imc;
    private String classificaoaoImc;
    private String plano;
    private String foneCelular;
    private String email;
    private Integer freqeunciaSemanal;

    @ManyToOne
    @JoinColumn(name = "responsavel_id")
    private Responsavel responsavel;

    //@OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    //private List<FichaTreino> fichasDeTreino;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void obterImc() {
        this.imc = calcucarImc();
        this.classificaoaoImc = classificacaoImc(this.imc);
    }

    private Double calcucarImc() {
        return peso / (altura * altura);
    }

    private String classificacaoImc(double imc) {
        if (imc < 18.6) return String.valueOf(ClassificacaoIndiceMassaCorporal.BAIXO);
        else if (imc < 25) return String.valueOf(ClassificacaoIndiceMassaCorporal.NORMAL);
        else if (imc < 30) return String.valueOf(ClassificacaoIndiceMassaCorporal.SOBREPESO);
        else if (imc < 35) return String.valueOf(ClassificacaoIndiceMassaCorporal.OBESIDADEGRAU1);
        else if (imc < 40) return String.valueOf(ClassificacaoIndiceMassaCorporal.OBESIDADEGRAU2);
        else if (imc >= 40) return String.valueOf(ClassificacaoIndiceMassaCorporal.OBESIDADEGRAU3);
        else return "INDEFINIDO";
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", peso=" + peso +
                ", altura=" + altura +
                ", imc=" + imc +
                ", classificaoaoImc='" + classificaoaoImc + '\'' +
                ", plano='" + plano + '\'' +
                ", foneCelular='" + foneCelular + '\'' +
                ", email='" + email + '\'' +
                ", freqeunciaSemanal=" + freqeunciaSemanal +
                ", responsavel=" + responsavel +
                '}';
    }
}

