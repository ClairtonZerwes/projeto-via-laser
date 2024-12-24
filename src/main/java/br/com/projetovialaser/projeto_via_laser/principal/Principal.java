package br.com.projetovialaser.projeto_via_laser.principal;

import br.com.projetovialaser.projeto_via_laser.model.Aluno;
import br.com.projetovialaser.projeto_via_laser.repositories.AlunoRepository;
import br.com.projetovialaser.projeto_via_laser.service.ConsumirDadosApi;
import br.com.projetovialaser.projeto_via_laser.service.ConverterDados;
import br.com.projetovialaser.projeto_via_laser.view.AlunoView;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.*;

@Component
public class Principal {
    private static Scanner ler = new Scanner(System.in);
    private ConsumirDadosApi consumirDadosApi = new ConsumirDadosApi();
    private ConverterDados converterDados = new ConverterDados();
    private List<Aluno> dadosAlunos = new ArrayList<>();
    private static DateTimeFormatter formatoDataIngles = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static DateTimeFormatter formatarDataBR = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("pt", "BR"));
    //@Autowired
    private AlunoView alunoView;
    private AlunoRepository alunoRepository;

    public Principal(){ }

    @PreDestroy
    public void closeResources() {
        //AlunoRepository.flush();
        ler.close();
    }

    private static String formatarDataPadraoBrasil(String dataIngles) {
        LocalDate dataFormatadaBR;

        try {
            dataFormatadaBR = LocalDate.parse(dataIngles, formatoDataIngles);
        } catch (DateTimeParseException e) {
            return null;
        }
        return dataFormatadaBR.format(formatarDataBR);
    }


    public static void exibeMenu() {
        var opcaoMenu = -1;

        while (opcaoMenu != 0) {
            try {
                var menu = """
                        \n==================  Menu  Principal  ==================
                            1 - Consultar Alunos
                            2 - Consultar Responsáveis
                            3 - Consultar Planos de Treino
                            4 - Consultar Planos de Mensalidade para Alunos
                            0 - Sair
                        =======================================================
                        Informe uma das opções acima [0 à 4]: 
                        """;
                System.out.print(menu);
                opcaoMenu = ler.nextInt();
                ler.nextLine();

                switch (opcaoMenu) {
                    case 1:
                        consultarAlunos();
                        break;
                    case 2:
                        consultarResponsaveis();
                        break;
                    case 3:
                        consultarFichasDeTreinos();
                        break;
                    case 4:
                        consultarPlanosDeMensalidadesParaAlunos();
                        break;
                    case 0:
                        System.out.println("\nFinalizando Programa...");
                        //closeResources();
                        break;
                    default:
                        mensagemPadraoErroOpcaoMenu();
                        throw new IllegalStateException("Opção Menu Digitada = " + opcaoMenu);
                }
            } catch (NumberFormatException | InputMismatchException e) {
                mensagemPadraoErroOpcaoMenu();
            }
        }
    }

    private static void consultarAlunos() {
        AlunoView alunoView = new AlunoView();
        alunoView.menuAlunos();
    }

    private static void consultarPlanosDeMensalidadesParaAlunos() {
    }

    private static void consultarFichasDeTreinos() {
    }

    private static void consultarResponsaveis() {
    }

    private static void mensagemPadraoErroOpcaoMenu() {
        System.out.println("Você deve informar somente números, conforme opções do Menu. Pressione ENTER para continuar...\n");
        ler.nextLine();
    }
}

