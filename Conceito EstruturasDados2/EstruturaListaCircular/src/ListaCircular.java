// Classe ListaCircular que funciona com qualquer tipo de dado (T)
public class ListaCircular<T> {

    // Referência para o primeiro nó (onde a lista começa a apontar de volta)
    private No<T> cabeca;

    // Referência para o último nó (onde novos elementos são adicionados)
    private No<T> cauda;

    // Contador de quantos elementos existem na lista
    private int tamanhoLista;

    // Construtor: inicia a lista vazia
    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    // Método para adicionar um elemento à lista
    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo); // Cria novo nó com o conteúdo informado

        if (this.tamanhoLista == 0) {
            // Se a lista está vazia, o novo nó vira a cabeça e a cauda
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda); // Aponta para si mesmo, pois é circular
        } else {
            // Se já existem nós, o novo nó aponta para o atual primeiro nó
            novoNo.setNoProximo(this.cauda);
            // A cabeça aponta para o novo nó
            this.cabeca.setNoProximo(novoNo);
            // O novo nó vira a nova cauda
            this.cauda = novoNo;
        }

        this.tamanhoLista++; // Aumenta o tamanho da lista
    }

    // Método para remover um elemento da lista por índice
    public void remove(int index) {
        if (index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista");

        No<T> noAuxiliar = this.cauda;

        if (index == 0) {
            // Remove o primeiro elemento (cauda)
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda); // Atualiza a referência da cabeça
        } else if (index == 1) {
            // Remove o segundo elemento da lista
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        } else {
            // Remove elemento mais à frente
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            // Pula o nó a ser removido
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }

        this.tamanhoLista--; // Diminui o tamanho da lista
    }

    // Retorna o conteúdo de um nó pelo índice
    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    // Método auxiliar que retorna o nó pelo índice
    private No<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if (index == 0) {
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    // Verifica se a lista está vazia
    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    // Retorna o número de elementos na lista
    public int size() {
        return this.tamanhoLista;
    }

    // Representação da lista como String (para imprimir no terminal)
    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;

        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}] --->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        // Indica que a lista é circular e retorna ao início
        strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]";

        return strRetorno;
    }
}
