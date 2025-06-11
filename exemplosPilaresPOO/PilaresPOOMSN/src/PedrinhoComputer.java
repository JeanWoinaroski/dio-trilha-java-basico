import app.FacebookMessenger;
import app.MSNMessenger;
import app.ServicoMensagemInstantanea;
import app.Telegram;
import java.util.Scanner;

public class PedrinhoComputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ServicoMensagemInstantanea ims = null;

        String chosenApp = scanner.next()
                .toLowerCase()
                .trim();
        scanner.close();

        if (chosenApp.equals("msn")) {
            ims = new MSNMessenger();
        }
        else if (chosenApp.equals("telegram")) {
            ims = new Telegram();
        }
        else if (chosenApp.equals("facebook")) {
            ims = new FacebookMessenger();
        }
        else {
            System.out.println("Messaging app not supported.");
            return;
        }

        ims.sendMessage();
        ims.receiveMessage();
    }
}
