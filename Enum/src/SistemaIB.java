public class SistemaIB {
    public static void main(String[] args) throws Exception {
        
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + "-" + e.getNome());
            
        }
        EstadoBrasileiro eb = EstadoBrasileiro.valueOf("SãoPaulo");

        System.out.println(eb.getNome());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getSigla());
        System.out.println(eb.getIbge());
    }
}
