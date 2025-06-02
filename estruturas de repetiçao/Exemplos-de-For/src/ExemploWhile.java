
public class ExemploWhile {
public static void main(String[] args) {
    double mesada = 50.0;
    
    while (mesada > 0) {
        double valorDoce = valorAleatorio();
        if (valorDoce > mesada){
            valorDoce = mesada; // Ajusta o valor se for maior que a mesada
        }

        System.out.printf("Doce do valor :" + valorDoce + " Adicionado ao carrinho.%n");
        mesada -= valorDoce;
        
        System.out.println("Mesada restante: " + mesada);
        if (mesada <= 0) {
            System.out.println("Mesada esgotada.");
            break;
        }
        
        }
        
        
    }
    private static double valorAleatorio() {
        return Math.random() * 8 + 2; // Gera um valor aleatório entre 2 e 8
    }
}

