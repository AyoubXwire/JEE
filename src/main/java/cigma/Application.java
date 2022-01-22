package cigma;

import cigma.controllers.ClientController;
import cigma.models.Client;

public class Application {

    public static void main(String[] args) {
        ClientController ctrl = new ClientController();
        Client client = new Client(1L,"testing");
        ctrl.save(client);
    }
}
