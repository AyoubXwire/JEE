package cigma.controllers;

import cigma.models.Client;
import cigma.service.ClientService;

public class ClientController {

    ClientService clientService = new ClientService();

    public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }
}
