package cigma.controllers;

import cigma.models.Client;
import cigma.service.IClientService;

public class ClientController {

    IClientService clientService;

    public void setClientService(IClientService clientService) {
        this.clientService = clientService;
    }

    public ClientController() {
        System.out.println("ClientController instanciated");
    }

    public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }
}
