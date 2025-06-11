public class Carro extends Veiculo {
    

    @Override
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado.");
    }
    private void confereCambio() {
        System.out.println("Verificando câmbio.");
    }
    private void confereCombustivel() {
        System.out.println("Verificando combustível.");
    }
}