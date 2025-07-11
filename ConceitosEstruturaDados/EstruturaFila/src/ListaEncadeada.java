// Declaração da classe genérica ListaEncadeada, que pode armazenar qualquer tipo T
public class ListaEncadeada<T> {

    // Referência para o primeiro nó da lista
    private No<T> referenciaEntrada;

    // Construtor da lista: inicia a lista como vazia (sem nós)
    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    // Método que adiciona um novo elemento ao final da lista
    public void add(T conteudo) {
        // Cria um novo nó com o conteúdo passado
        No<T> novoNo = new No<>(conteudo);

        // Se a lista estiver vazia, o novo nó será o primeiro
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        // Cria um nó auxiliar que começa na entrada
        No<T> noAuxiliar = referenciaEntrada;

        // Percorre até o último nó da lista
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        // Ao final, aponta o último nó para o novo nó (encadeia)
        noAuxiliar.setProximoNo(novoNo);
    }
    
 // Método público que retorna o conteúdo armazenado em um nó com base no índice informado
    public T get(int index) {
        // Chama o método privado getNo(index), que retorna o nó na posição desejada
        // Em seguida, chama getConteudo() para pegar apenas o dado que está dentro do nó
        return getNo(index).getConteudo();
    }


    // Método que retorna um nó específico com base no índice
    private No<T> getNo(int index) {
        // Verifica se o índice é válido
        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        // Percorre a lista até o índice desejado
        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        // Retorna o nó encontrado na posição
        return noRetorno;
    }
    
    public T remove (int index) {
    	No <T> noPivor = this.getNo(index);
    	if(index == 0) {
    		referenciaEntrada = noPivor.getProximoNo();
    		return noPivor.getConteudo();
    		
    	}
		
    	
    	No <T> noAnterior = getNo( index -1);
    	noAnterior.setProximoNo(noPivor.getProximoNo());
    	return noPivor.getConteudo();
    }

    // Método que retorna o tamanho da lista (quantidade de nós)
    public int size() {
        int tamanhoLista = 0;

        // Cria uma variável auxiliar que começa apontando para o primeiro nó
        No<T> referenciaAux = referenciaEntrada;

        // Percorre a lista enquanto houver nós
        while (referenciaAux != null) {
            tamanhoLista++;
            referenciaAux = referenciaAux.getProximoNo();
        }

        // Retorna a quantidade total de nós
        return tamanhoLista;
    }

    // Método auxiliar que verifica se o índice está dentro dos limites da lista
    private void validaIndice(int index) {
        if (index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException(
                "Não existe conteúdo no índice " + index + 
                " desta lista. Esta lista vai até o índice " + ultimoIndice + "."
            );
        }
    }

    // Método que verifica se a lista está vazia
    public boolean isEmpty() {
        // Retorna true se a referência de entrada for nula (não há elementos)
        return referenciaEntrada == null;
    }

	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		for(int i = 0; i < this.size(); i ++) {
			strRetorno +="No{conteudo=" + noAuxiliar.getConteudo() + "} ----->";
			noAuxiliar = noAuxiliar.getProximoNo();
			
		}
		strRetorno += "null";
		return strRetorno;

	}
    
}
