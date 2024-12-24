package br.com.projetovialaser.projeto_via_laser.view;

import br.com.projetovialaser.projeto_via_laser.controller.AlunoController;
import br.com.projetovialaser.projeto_via_laser.model.Aluno;
import br.com.projetovialaser.projeto_via_laser.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Scanner;

@Component
public class AlunoView {
    private static Scanner ler = new Scanner(System.in);
    @Autowired
    private AlunoController alunoController;

    public void menuAlunos() {
        var opcaoMenu = -1;

        do {
            var menu = """
            \n=====  Menu  de  Alunos  ======
                1 - Listar alunos
                2 - Cadastrar aluno
                3 - Atualizar aluno
                4 - Excluir aluno
                0 - Voltar Menu Principal
            Escolha uma opção [0 a 4]: 
            """;
            opcaoMenu = ler.nextInt();
            ler.nextLine(); // Consumir nova linha

            switch (opcaoMenu) {
                case 1:
                    listarAlunos();
                    break;
                case 2:
                    cadastrarAluno();
                    break;
                case 3:
                    atualizarAluno();
                    break;
                case 4:
                    excluirAluno();
                    break;
                case 0:
                    Principal.exibeMenu();
                    break;
                default:
                    System.out.println("Opção inválida! Informe somente números.");
            }
        } while (opcaoMenu != 0);
    }

    private void listarAlunos() {
        alunoController.listarAlunos().forEach(System.out::println);
    }

    // criar métodos para validar regras de négocio e calcular idade partir data nascimento com a data atual
    private void cadastrarAluno() {
        // todos tipo diferente de String para ler entrada de dados devemos usar o ler.nextLine() na prócima linha para evitar erro
        Aluno aluno = new Aluno();
        System.out.print("Nome: ");
        aluno.setNome(ler.nextLine());
        System.out.print("Data Nascimento: ");
        // testar senão funcionar usar o DateTimeFormatter exemplo na classe principal
        aluno.setDataNascimento(LocalDate.parse(ler.nextLine()));
        System.out.print("Peso: ");
        aluno.setPeso(ler.nextDouble());
        ler.nextLine();
        System.out.print("Altura: ");
        aluno.setAltura(ler.nextDouble());
        alunoController.criarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private void atualizarAluno() {
        System.out.print("ID do Aluno: ");
        Long id = ler.nextLong();
        ler.nextLine();
        Aluno aluno = new Aluno();
        System.out.print("Nome: ");
        aluno.setNome(ler.nextLine());
        System.out.print("Peso: ");
        aluno.setPeso(ler.nextDouble());
        System.out.print("Altura: ");
        aluno.setAltura(ler.nextDouble());
        alunoController.atualizarAluno(id, aluno);
        System.out.println("Aluno atualizado com sucesso!");
    }

    private void excluirAluno() {
        System.out.print("ID do Aluno: ");
        Long id = ler.nextLong();
        alunoController.deletarAluno(id);
        System.out.println("Aluno excluído com sucesso!");
    }
}