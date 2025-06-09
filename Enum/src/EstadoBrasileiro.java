public enum EstadoBrasileiro {
    SãoPaulo("SP", "São Paulo", 11),
    RioDeJaneiro("RJ", "Rio de Janeiro", 22),
    MinasGerais("MG", "Minas Gerais", 31),
    RioGrandeDoSul("RS", "Rio Grande do Sul", 43),
    CEARA("CE", "Ceará", 23),
    Bahia("BA", "Bahia", 29);

    private final String sigla;
    private final String nome;
    private final int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
