public class Autodromo {
public static void main(String[] args) {
    Carro Ferrari = new Carro();
    Ferrari.getChassi();
    Ferrari.ligar();

    Moto Ducati = new Moto();
    Ducati.getChassi();
    Ducati.ligar();

    Veiculo coringa = Ferrari;
    
    coringa.ligar();
}
}
