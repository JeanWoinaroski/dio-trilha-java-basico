package app;
public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void sendMessage() {
        validarConectado();
        System.out.println("Sending message via MSN Messenger...");
    }

    @Override
    public void receiveMessage() {
        validarConectado();
        System.out.println("Receiving message via MSN Messenger...");
    }


}
