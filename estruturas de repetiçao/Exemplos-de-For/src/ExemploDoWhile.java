import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        // Simula o processo de discagem e atendimento de um telefone
        System.out.println("Iniciando o processo de discagem...");
        System.out.println("Discando...");

    do {
        System.out.println("Telefone tocando...");
        
    } while (tocando());

    System.out.println("Alo!!");

    
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1; // Simula o atendimento com 33% de chance
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }


}
