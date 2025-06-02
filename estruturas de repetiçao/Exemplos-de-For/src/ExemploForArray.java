public class ExemploForArray {
    public static void main(String[] args) {
        System.out.println("Exemplo de uso do laço for com array");
        System.out.println("========================================");
        System.out.println();


    String alunos[] = { "João", "Maria", "José", "Ana", "Pedro" };
    
    for ( int x = 0; x < alunos.length; x++ ) {
        System.out.println( "Aluno " + (x + 1) + ": " + alunos[x] );
    }

}
}
