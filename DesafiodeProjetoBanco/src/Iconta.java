public interface Iconta {

    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Iconta contaDestino);
    double getSaldo();

    void imprimirExtrato();
    

}
