package cigma.controllers;

import cigma.models.Client;
import cigma.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("ClientController")
public class ClientController {

    @Autowired
    private IClientService clientService;

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
