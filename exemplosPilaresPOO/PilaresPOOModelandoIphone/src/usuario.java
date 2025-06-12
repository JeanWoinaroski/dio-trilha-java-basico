public class usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando o navegador de internet
        iphone.abrirPagina("https://www.exemplo.com");
        iphone.atualizarPagina();
        iphone.navegarPara("https://www.outroexemplo.com");
        iphone.voltar();
        iphone.fecharPagina();

        // Testando o aparelho telefônico
        iphone.fazerchamado();
        iphone.receberchamado();

        // Testando o reprodutor musical
        iphone.selecionarMusica("Minha Música Favorita");
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.pararMusica();
    }

}
