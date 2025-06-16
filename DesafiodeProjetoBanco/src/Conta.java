public abstract class Conta implements Iconta {

    private  static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected  Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0.0;
        this.cliente = cliente;
    }



    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Valor: " + valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Valor: " + valor);
        }
    }

    @Override
    public void transferir(double valor, Iconta contaDestino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência.");
        } else {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso. Valor: " + valor);
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
    protected void ImprimirinfosComum() {
    System.out.println("==============================");
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agência: %d", this.agencia));
    System.out.println(String.format("Número: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
    System.out.println("==============================");
}
}
