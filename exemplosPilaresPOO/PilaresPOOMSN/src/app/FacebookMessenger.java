package app;
public class FacebookMessenger extends ServicoMensagemInstantanea{

    @Override
    public void sendMessage() {
    validarConectado();
        System.out.println("Sending message via Facebook Messenger...");
    }
        

    @Override
    public void receiveMessage() {
        validarConectado();
        System.out.println("Receiving message via Facebook Messenger...");
        
    }

}
