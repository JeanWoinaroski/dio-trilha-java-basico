public class ExemploForarrayy {

    public static void main(String[] args) {
        
        String alunos[] = { "João", "Maria", "José", "Ana", "Pedro" };
        System.out.println("Exemplo de uso do laço for com array");

        for (String aluno : alunos) {
            System.out.println("Aluno: " + aluno);
        }
        System.out.println("========================================");
        System.out.println("Total de alunos: " + alunos.length);
        System.out.println("========================================");
    }
}
