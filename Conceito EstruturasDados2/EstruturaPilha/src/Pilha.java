public class Pilha {
//topo da pilha
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    /* ---------- PUSH ---------- */
    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;   // guarda o antigo topo
        refNoEntradaPilha = novoNo;           // novo topo
        refNoEntradaPilha.setReNo(refAuxiliar); // encadeia
    }

    /* ---------- POP ---------- */
    public No pop() {
        // Corrigido: só desempilha se NÃO estiver vazia
        if (!isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReNo();
            return noPoped;
        }
        return null;
    }

    /* ---------- TOP ---------- */
    public No top() {
        return refNoEntradaPilha;
    }

    /* ---------- EMPTY ---------- */
    public boolean isEmpty() {
        // expressão já devolve boolean, não precisa do ternário
        return refNoEntradaPilha == null;
    }

    /* ---------- TO STRING ---------- */
    @Override
    public String toString() {
        String stringRetorno = "---------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "---------------\n";

        // Usa variável local em vez de atributo de classe
        No noAuxiliar = refNoEntradaPilha;

        while (noAuxiliar != null) {
            stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
            noAuxiliar = noAuxiliar.getReNo();
        }

        stringRetorno += "===============\n";
        return stringRetorno;
    }
}
