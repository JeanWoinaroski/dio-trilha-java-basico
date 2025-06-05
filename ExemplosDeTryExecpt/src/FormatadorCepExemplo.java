public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            // Tentativa de formatar um CEP inválido
            String cepFormatado = formatarCep("2345678229");
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negocio");
        
        }
    
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
    
        }
        return cep;
    }
} 