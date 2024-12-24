package br.com.projetovialaser.projeto_via_laser.service;

import br.com.projetovialaser.projeto_via_laser.model.Aluno;
import br.com.projetovialaser.projeto_via_laser.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    /*
    public Aluno salvar(Aluno aluno) {
        // Cálculo de IMC e definição de plano antes de salvar
        aluno.setImc(calcularImc(aluno.getPeso(), aluno.getAltura()));
        aluno.setClassificacaoImc(definirClassificacaoImc(aluno.getImc()));
        aluno.setPlano(definirPlano(aluno));
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listarTodos() {
    }
    */
    // Métodos auxiliares de cálculo e regras de negócio alicar no controller
}
