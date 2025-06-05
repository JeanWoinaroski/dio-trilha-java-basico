import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Nome do arquivo: ProcessoSeletivo.java
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "Lucas"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

        System.out.println("Processo Seletivo - Java Developer");
        imprimirSelecionados();
        System.out.println("Obrigado por participar do processo seletivo.");
        selecaoCandidatos();
        System.out.println("Processo Seletivo Encerrado.");
        System.out.println("Candidatos selecionados com sucesso!");
    }

    // Método para simular tentativa de contato
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
            System.out.println("Candidato " + candidato + " atendido com sucesso após " + tentativas + " tentativa(s).");
        } else {
            System.out.println("Não foi possível entrar em contato com o candidato " + candidato + " após 3 tentativas.");
        }
    }

    // Método auxiliar para simular o atendimento
    static boolean atender() {
        return new Random().nextInt(3) == 1; // Retorna true com 1/3 de chance
    }

    // Método para imprimir os candidatos selecionados
    static void imprimirSelecionados() {
        String[] candidatosSelecionados = {
            "João", "Maria", "Pedro", "Ana", "Lucas", "Fernanda", "Carlos", "Beatriz", "Rafael", "Juliana",
            "Roberto", "Patrícia", "Eduardo", "Camila", "Ricardo", "Larissa", "Gustavo", "Sofia", "Felipe", "Mariana"
        };

        System.out.println("Candidatos Selecionados:");
        for (int indice = 0; indice < candidatosSelecionados.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatosSelecionados[indice] + ".");
        }

        System.out.println("Total de candidatos selecionados: " + candidatosSelecionados.length);
    }

    // Método para iniciar o processo seletivo e selecionar candidatos
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

            System.out.println("Candidato: " + candidato + ", Salário Pretendido: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                analisarCandidato(salarioPretendido);
                System.out.println("Candidato selecionado: " + candidato);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    // Método para simular o valor pretendido pelo candidato
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1500.0, 2500.0);
    }

    // Método para analisar o candidato com base no salário pretendido
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }
}
// Fim do arquivo ProcessoSeletivo.java