public class Estabelecimento {
    public static void main(String[] args) {
        //ações que não precisam estarem disponiveis para toda a aplicacao
    Cozinheiro cozinheiro = new Cozinheiro();
    cozinheiro.lavarIgredientes();
    cozinheiro.batervitaminaliquidificador();
    cozinheiro.selecionarIgredientesVitamina();
    cozinheiro.prepararLanche();
    cozinheiro.prepararVitamina();
    cozinheiro.prepararSuco();

//açoes que estabelecimento precisa ter ciencia
    cozinheiro.adicionarSucoNoBalcao();
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.adicionarComboNoBalcao();


    Almoxarife almoxarife = new Almoxarife();
    almoxarife.controlarEntrada();
    almoxarife.controlarSaida();
    //açoes que somente o seu pacote cozinha precisa conhecer (default)
    almoxarife.entregarIgredientes();
    almoxarife.trocarGas();

    Atendente atendente = new Atendente();
    atendente.pegarLancheCozinha();
    atendente.receberPagamento();
    atendente.servindoMesa();
    //açoes que somente seu pacote cozinha preceisa conhecer (default)
    atendente.trocarGas();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();
//nao deveria,pegar
    cliente.pegarPedidoBalcao();
//esta açao é muito sigilosa.que tal ser privada ?
    cliente.ConsultarSaldoAplicativo();
//já pensou os clientes ouvimndo que o gas está acabando?
    cozinheiro.pedirParaTrocarGas(almoxarife);
    cozinheiro.pedirParaTrocarGas(atendente);





}
}
