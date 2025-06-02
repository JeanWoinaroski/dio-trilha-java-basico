public class ExemploFor {
    public static void main(String[] args) throws Exception {
        System.out.println("Exemplo de uso do laço for");
        System.out.println("========================================");
        System.out.println();
        System.out.println("Contando carneirinhos...");

        
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando carneirinhos... " + carneirinhos);
            if (carneirinhos == 10) {
                System.out.println("Já contei 10 carneirinhos!");
                
            }
        }
        
    }
}
