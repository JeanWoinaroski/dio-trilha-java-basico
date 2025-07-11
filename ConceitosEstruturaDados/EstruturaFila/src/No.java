// Declara a classe No que usa generics <T> (pode receber qualquer tipo de dado)
public class No<T> {

    // Atributo que armazena o conteúdo do nó (pode ser qualquer tipo)
    private T conteudo;

    // Atributo que aponta para o próximo nó da lista (referência encadeada)
    private No proximoNo;

    // Construtor padrão: cria um nó sem conteúdo e sem próximo
    public No() {
        this.proximoNo = null;
    }

    // Construtor que recebe o conteúdo como parâmetro
    // O próximo nó é inicializado como null
    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    // Construtor completo: recebe conteúdo e o próximo nó como parâmetro
    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    // Getter: retorna o conteúdo do nó
    public T getConteudo() {
        return conteudo;
    }

    // Setter: atualiza o conteúdo do nó
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    // Getter: retorna a referência para o próximo nó
    public No getProximoNo() {
        return proximoNo;
    }

    // Setter: define o próximo nó
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    // Sobrescreve o método toString para mostrar apenas o conteúdo do nó
    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

    // Método que imprime o nó atual e todos os nós seguintes, se existirem
    public String toStringEncadeado() {
        // Monta a string com o conteúdo do nó
        String str = "No{" + "conteudo=" + conteudo + '}';

        // Se houver um próximo nó, adiciona a seta e chama recursivamente o toString do próximo
        if (proximoNo != null) {
            str += " -> " + proximoNo.toString();
        } else {
            // Se não houver próximo, só adiciona a indicação de fim
            str += " -> null";
        }

        return str;
    }
}
