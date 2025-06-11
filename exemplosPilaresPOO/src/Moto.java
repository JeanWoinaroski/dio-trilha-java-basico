public class Moto extends Veiculo {
    

    @Override
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Moto ligada.");
    }

    private void confereCambio() {
        System.out.println("Verificando câmbio da moto.");
    }

    private void confereCombustivel() {
        System.out.println("Verificando combustível da moto.");
    }

}
