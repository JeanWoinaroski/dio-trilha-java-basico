public class ExemploFor {
    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Valor de i: " + carneirinhos);
            if (carneirinhos == 10) {
                System.out.println("Chegou no carneirinho 10, vamos parar o loop");
                break; // Interrompe o loop quando carneirinhos é igual a 10
            }
        }
        System.out.println("Fim do loop for");
    }

}
