package br.com.projetovialaser.projeto_via_laser.controller;

import br.com.projetovialaser.projeto_via_laser.model.Aluno;
import br.com.projetovialaser.projeto_via_laser.repositories.AlunoRepository;
import br.com.projetovialaser.projeto_via_laser.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
@RestController // padrão controlador restful
@RequestMapping("/alunos") // para mapear endpoints dos alunos exemplo localhost/alunos
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> listar() {
        return alunoService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno) {
        return ResponseEntity.ok(alunoService.salvar(aluno));
    }
}
*/

@Controller
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno criarAluno(Aluno aluno) {
        aluno.obterImc();
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno buscarAlunoPorId(Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }

    public Aluno atualizarAluno(Long id, Aluno alunoAtualizado) {
        Aluno alunoExistente = buscarAlunoPorId(id);
        if (alunoExistente != null) {
            alunoExistente.setNome(alunoAtualizado.getNome());
            alunoExistente.setPeso(alunoAtualizado.getPeso());
            alunoExistente.setAltura(alunoAtualizado.getAltura());
            alunoExistente.obterImc();
            return alunoRepository.save(alunoExistente);
        }
        return null;
    }
}