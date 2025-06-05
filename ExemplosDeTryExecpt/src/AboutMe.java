
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome :");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome :");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade :");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura :");
        double altura = scanner.nextDouble();
        


        //imprime os dados
        System.out.println("Ola,me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura e " + altura + " cm");
        scanner.close();
        
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos. Por favor, verifique os valores digitados.");
        }
        catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
        finally {
            System.out.println("refaça a operação, se necessário.");
            System.out.println("Obrigado por usar o programa!");
        }

        
    }
    
}
