// Declaração da classe genérica, que aceita qualquer tipo de dado (T)
public class ListaduplamenteEncadeada<T> {

    // Nó que aponta para o primeiro elemento da lista
    private NoDuplo<T> primeiroNo;

    // Nó que aponta para o último elemento da lista
    private NoDuplo<T> ultimoNo;

    // Quantidade de elementos na lista
    private int tamanhoLista;

    // Construtor da lista: inicializa como vazia
    public ListaduplamenteEncadeada() {
        this.primeiroNo = null;      // início da lista é nulo
        this.ultimoNo = null;        // fim da lista também é nulo
        this.tamanhoLista = 0;       // lista começa com tamanho 0
    }

    // Método para retornar o conteúdo de um nó, dado o índice
    public T get(int index) {
        return this.getNo(index).getConteudo(); // busca o nó e retorna o dado
    }

    // Método que adiciona um novo elemento no final da lista
    public void add(T elemento) {
        // Cria novo nó com o elemento informado
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);

        // Como será o último, o próximo dele é null
        novoNo.setNoProximo(null);

        // Aponta o nó anterior como o último atual
        novoNo.setNoPrevio(ultimoNo);

        // Se a lista estiver vazia, esse novo nó será também o primeiro
        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }

        // Se já existe um último nó, atualiza ele para apontar para o novo nó
        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }

        // Atualiza o último nó da lista para ser o novo nó
        ultimoNo = novoNo;

        // Aumenta o tamanho da lista
        tamanhoLista++;
    }
    public void add(int index, T elemento) {
        // Busca o nó que atualmente está na posição 'index'
        NoDuplo<T> noAuxiliar = getNo(index);

        // Cria um novo nó com o conteúdo que queremos inserir
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);

        // O novo nó deve apontar para o nó que estava na posição 'index'
        novoNo.setNoProximo(noAuxiliar);

        // Se o novo nó não estiver sendo inserido no final (ou seja, existe nó depois dele)
        if (novoNo.getNoProximo() != null) {
            // Faz o novo nó apontar para o nó anterior ao 'noAuxiliar'
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());

            // Atualiza o nó que vem depois para apontar de volta para o novo nó
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            // Se o novo nó está sendo inserido no final da lista:
            // Define o nó anterior como o atual último nó da lista
            novoNo.setNoPrevio(ultimoNo);

            // Atualiza o último nó para ser o novo nó
            ultimoNo = novoNo;
        }

        // Se estamos inserindo no índice 0 (início da lista)
        if (index == 0) {
            // Atualiza o primeiro nó para ser o novo nó
            primeiroNo = novoNo;
        } else {
            // Se não for no início, o nó anterior ao novo nó deve apontar para ele
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        // Incrementa o tamanho da lista pois adicionamos um novo elemento
        tamanhoLista++;
    }
    
    public void remove(int index) {

        // Se o índice for 0, ou seja, remover o primeiro nó da lista
        if (index == 0) {
            // Atualiza o primeiro nó para ser o próximo do atual primeiro nó
            primeiroNo = primeiroNo.getNoProximo();

            // Se a lista não ficou vazia após a remoção
            if (primeiroNo != null) {
                // O novo primeiro nó não deve ter nó anterior (null)
                primeiroNo.setNoPrevio(null);
            }

        } else {
            // Se o índice não é zero, busca o nó que será removido
            NoDuplo<T> noAuxiliar = getNo(index);

            // Faz o nó anterior ao nó que será removido apontar para o próximo nó dele
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());

            // Se o nó removido não é o último da lista
            if (noAuxiliar != ultimoNo) {
                // Faz o próximo nó do removido apontar de volta para o nó anterior ao removido
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                // Se o nó removido é o último, atualiza o último nó da lista para ser o anterior ao removido
                ultimoNo = noAuxiliar.getNoPrevio();
            }
        }

        // Decrementa o tamanho da lista, pois um nó foi removido
        this.tamanhoLista--;
    }



    // Método privado que retorna o nó da posição informada
    private NoDuplo<T> getNo(int index) {
        // Começa a partir do primeiro nó
        NoDuplo<T> noAuxiliar = primeiroNo;

        // Caminha até o índice desejado
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        // Retorna o nó encontrado
        return noAuxiliar;
    }

    // Método que retorna o tamanho atual da lista
    public int size() {
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}] ---> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno += "null";
        return strRetorno;
    }

}
