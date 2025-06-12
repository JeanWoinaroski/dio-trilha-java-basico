public class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorInternet{

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página atual...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página atual...");
    
    }

    @Override
    public void navegarPara(String url) {
        System.out.println("Navegando para: " + url);
    }

    @Override
    public void voltar() {
        System.out.println("Voltando para a página anterior...");
    
    }

    @Override
    public void fazerchamado() {
        System.out.println("Fazendo chamado...");
    
    }

    @Override
    public void receberchamado() {
        System.out.println("Recebendo chamado...");
    
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada.");
    
    }

}
