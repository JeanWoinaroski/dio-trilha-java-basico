// Criando uma classe chamada "No" (ou seja, um "nó") que pode armazenar qualquer tipo de dado (por isso o <T>)
public class No<T> {

    // Aqui é onde o nó guarda o valor (pode ser String, Integer, etc.)
    private T conteudo;

    // Aqui é onde o nó guarda a referência (o "endereço") do próximo nó da lista
    private No<T> noProximo;

    // Construtor: cria um novo nó e já coloca o conteúdo nele.
    // O próximo nó começa como null, porque ele ainda não aponta pra ninguém.
    public No(T conteudo) {
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    // Esse método retorna o conteúdo guardado no nó
    public T getConteudo() {
        return conteudo;
    }

    // Esse método altera o conteúdo guardado no nó
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    // Esse método retorna quem é o próximo nó na sequência
    public No<T> getNoProximo() {
        return noProximo;
    }

    // Esse método diz quem será o próximo nó depois deste
    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    // Esse método serve para quando a gente imprime o nó no terminal.
    // Ele mostra o conteúdo do nó como texto.
    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }
}
