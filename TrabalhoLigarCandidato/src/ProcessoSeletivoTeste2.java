import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoTeste2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo - Java Developer");

        selecaoCandidatos();

        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "Lucas"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

        imprimirSelecionados();

        System.out.println("Obrigado por participar do processo seletivo.");
        System.out.println("Processo Seletivo Encerrado.");
        System.out.println("Candidatos selecionados com sucesso!");
    }

    static void entrandoEmContato(String candidato) {
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendido = false;

        do {
            atendido = atender();
            continuarTentando = !atendido;

            if (continuarTentando) {
                tentativas++;
            } else {
                System.out.println("Contato realizado com sucesso com o candidato: " + candidato);
            }

        } while (continuarTentando && tentativas <= 3);

        if (atendido) {
            System.out.println("Candidato " + candidato + " atendeu após " + tentativas + " tentativa(s).");
        } else {
            System.out.println("Não foi possível entrar em contato com o candidato " + candidato + " após 3 tentativas.");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatosSelecionados = {
            "João", "Maria", "Pedro", "Ana", "Lucas", "Fernanda", "Carlos", "Beatriz", "Rafael", "Juliana",
            "Roberto", "Patrícia", "Eduardo", "Camila", "Ricardo", "Larissa", "Gustavo", "Sofia", "Felipe", "Mariana"
        };

        System.out.println("\n📋 Lista de Candidatos Selecionados:");
        for (int indice = 0; indice < candidatosSelecionados.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatosSelecionados[indice] + ".");
        }

        System.out.println("Total de candidatos selecionados: " + candidatosSelecionados.length + "\n");
    }

    static void selecaoCandidatos() {
        String[] candidatos = {
            "João", "Maria", "Pedro", "Ana", "Lucas", "Fernanda", "Carlos", "Beatriz", "Rafael", "Juliana",
            "Roberto", "Patrícia", "Eduardo", "Camila", "Ricardo", "Larissa", "Gustavo", "Sofia", "Felipe", "Mariana"
        };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("\nCandidato: " + candidato + " | Salário Pretendido: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato " + candidato + " foi selecionado.");
                analisarCandidato(salarioPretendido);
                candidatosSelecionados++;
            } else {
                System.out.println("Candidato " + candidato + " não foi selecionado por pedir salário maior que o base.");
            }

            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1500.0, 2500.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioPretendido < salarioBase) {
            System.out.println("Ação: Ligar para o candidato.");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ação: Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Ação: Aguardando o resultado dos demais candidatos.");
        }
    }
}
