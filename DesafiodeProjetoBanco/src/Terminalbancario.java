public static void main(String[] args) {
    System.out.println("=== Bem-vindo ao Terminal Bancário ===");
    Cliente jeanWoinaroski = new Cliente();
    jeanWoinaroski.setNome("Jean Woinaroski");

    Conta cc = new ContaCorrente(jeanWoinaroski);
    Conta poupanca = new ContaPoupanca(jeanWoinaroski);

    cc.imprimirExtrato();

    poupanca.imprimirExtrato();

    cc.depositar(100);
    cc.transferir(50, poupanca);

    cc.imprimirExtrato();

    poupanca.imprimirExtrato();
    
    poupanca.sacar(20);

    poupanca.imprimirExtrato();

    cc.sacar(30);

    cc.imprimirExtrato();

    cc.transferir(10, poupanca);
    
    poupanca.imprimirExtrato();
}