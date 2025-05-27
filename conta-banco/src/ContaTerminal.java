import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TOD:Conhecer e importar as classes Scanner e Conta
        //Exibir as mensagens para nosso usuario
        //obter pela classe Scanner os dados do usuario
        //Exibir a mensagem conta criada com sucesso

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        // Exibir mensagem de boas-vindas
        System.out.println("===================================");
        System.out.println("          BANCO JWOINAROSKI          ");
        System.out.println("===================================");
        System.out.println("Bem-vindo ao Banco Jwoinaroski!");
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Ler o número da conta
        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência:");
        // Ler o número da agência
        agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente:");
        // Limpar o buffer do scanner
        scanner.nextLine();
        // Ler o nome do cliente
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da conta:");
        // Ler o saldo da conta
        saldo = scanner.nextDouble();
        // Exibir mensagem de confirmação
        System.out.println("===================================");
        System.out.println("Conta criada com sucesso!");
        // Fechar o scanner
        scanner.close();
        // Exibir mensagem de encerramento
        System.out.println("Olá " + nomeCliente + ",obrigado por ciar uma conta em nosso banco,sua agencia é " + agencia + " e o número da conta é " + numero + ". Seu saldo atual é R$ " + saldo + " já está disponivel para saque.");
        System.out.println("===================================");
    
    }
}
