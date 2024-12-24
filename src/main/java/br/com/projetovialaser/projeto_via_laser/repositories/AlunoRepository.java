package br.com.projetovialaser.projeto_via_laser.repositories;

import br.com.projetovialaser.projeto_via_laser.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AlunoRepository  extends JpaRepository<Aluno, Long> {
}
