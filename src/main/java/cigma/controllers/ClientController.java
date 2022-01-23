package cigma.controllers;

import cigma.models.Client;
import cigma.service.IClientService;

public class ClientController {

    IClientService clientService;

    public void setClientService(IClientService clientService) {
        this.clientService = clientService;
    }

    public ClientController() {
        System.out.println("ClientController..");
    }

    public Client save(Client c){
        return clientService.save(c);
    }

    public Client update(Client c){
        return clientService.update(c);
    }

    public Client delete(long id){
        return clientService.delete(id);
    }

    public Client find(long id){
        return clientService.find(id);
    }

    public Client findAll(){
        return clientService.findAll();
    }
}
