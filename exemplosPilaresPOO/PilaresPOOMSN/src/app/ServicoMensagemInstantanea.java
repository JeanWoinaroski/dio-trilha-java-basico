package app;

public abstract class ServicoMensagemInstantanea {
    
    protected void validarConectado() {
        System.out.println("Validating connection...");
    }

    public abstract void sendMessage();
    public abstract void receiveMessage();


}
