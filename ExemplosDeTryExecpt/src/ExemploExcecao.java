import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;
        try {
            // Tentativa de analisar uma string que não é um número válido
            valor = NumberFormat.getInstance().parse("1a23,45");
        } catch (ParseException e) {
            // Captura a exceção e exibe uma mensagem de erro
            System.out.println("Erro ao analisar o número: " + e.getMessage());
            return; // Sai do método se ocorrer um erro
        }
        // Se a análise for bem-sucedida, exibe o valor

        System.out.println("Valor: " + valor);
    }

}
