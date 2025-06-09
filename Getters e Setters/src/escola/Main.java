
package escola;

import escola.aluno.Aluno;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema Escolar Iniciado");
        Aluno aluno = new Aluno();

        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.println("Digite os dados do aluno:");

            System.out.println("Nome:");
            aluno.setNome(Scanner.nextLine());
            if (aluno.getNome().isEmpty()) {
                System.out.println("Nome não pode ser vazio. Tente novamente.");
                aluno.setNome(Scanner.nextLine());
            }

            System.out.println("Idade:");
            aluno.setIdade(Scanner.nextInt());
            if (aluno.getIdade() <= 0) {
                System.out.println("Idade inválida. Tente novamente.");
                aluno.setIdade(Scanner.nextInt());
            }
            System.out.println("Matrícula:");
            aluno.setMatricula( Scanner.next());
            if (aluno.getMatricula().isEmpty()) {
                System.out.println("Matrícula não pode ser vazia. Tente novamente.");
                aluno.setMatricula(Scanner.next());
            }
            System.out.println("Curso:");
            aluno.setCurso(Scanner.next());
            if (aluno.getCurso().isEmpty()) {
                System.out.println("Curso não pode ser vazio. Tente novamente.");
                aluno.setCurso(Scanner.next());
            }
            
        }

        System.out.println("Dados do Aluno:");

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Aluno cadastrado com sucesso!");
        System.out.println("Sistema Escolar Finalizado");

    }

}
