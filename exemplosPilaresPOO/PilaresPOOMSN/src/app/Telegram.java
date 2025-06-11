package app;
public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void sendMessage() {
        validarConectado();
        System.out.println("Sending message via Telegram...");
    }

    @Override
    public void receiveMessage() {
        validarConectado();
        System.out.println("Receiving message via Telegram...");
    }
    

}
