public class Main {

    public static void main(String[] args) {

        // Cria uma nova lista circular de Strings
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        // Adiciona um elemento "c0" à lista
        minhaListaCircular.add("c0");
        System.out.println(minhaListaCircular); // Exibe a lista: [No{conteudo=c0}] ---> (Retorna ao inicio)

        // Remove o elemento da posição 0 (a única existente)
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular); // Lista agora está vazia

        // Adiciona "c1" à lista
        minhaListaCircular.add("c1");
        System.out.println(minhaListaCircular); // Exibe a lista com c1

        // Adiciona mais dois elementos: "c2" e "c3"
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        System.out.println(minhaListaCircular); // Exibe os três elementos

        // Mostra os elementos um por um usando o método get()
        System.out.println(minhaListaCircular.get(0)); // Deve imprimir: c1
        System.out.println(minhaListaCircular.get(1)); // Deve imprimir: c2
        System.out.println(minhaListaCircular.get(2)); // Deve imprimir: c3
        System.out.println(minhaListaCircular.get(3)); // Como é circular, volta pro começo: c1

        // Loop para mostrar 20 elementos usando a lógica circular
        // Vai repetir c1, c2, c3, c1, c2, c3... até 20 vezes
        for (int i = 0; i < 20; i++) {
            System.out.println(minhaListaCircular.get(i));
        }
    }
}
