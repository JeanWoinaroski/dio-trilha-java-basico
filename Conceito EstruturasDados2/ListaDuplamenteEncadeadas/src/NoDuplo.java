// Declaração da classe genérica NoDuplo
public class NoDuplo<T> {

    // Atributo que armazena o conteúdo (valor) do nó
    private T conteudo;

    // Referência para o próximo nó da lista
    private NoDuplo<T> noProximo;

    // Referência para o nó anterior da lista
    private NoDuplo<T> noPrevio;

    // Construtor que recebe o conteúdo e inicializa o nó
    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    // Getter para retornar o conteúdo armazenado no nó
    public T getConteudo() {
        return conteudo;
    }

    // Setter para modificar o conteúdo do nó
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    // Getter para retornar a referência do próximo nó
    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }

    // Setter para definir qual será o próximo nó
    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }

    // Getter para retornar a referência do nó anterior
    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }

    // Setter para definir qual será o nó anterior
    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    // Método toString que define como o nó será representado como texto
    @Override
    public String toString() {
        return "NoDuplo [conteudo=" + conteudo + "]";
    }
}
