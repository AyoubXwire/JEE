package cigma.service;

import cigma.models.Client;
import cigma.repositories.IClientRepository;

public class ClientService implements IClientService {

    IClientRepository clientRepository;

    public void setClientRepository(IClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientService() {
        System.out.println("ClientService instanciated");
    }

    @Override
    public Client save(Client c) {
        System.out.println("Service Layer : ClientService Level... ");
        return clientRepository.save(c);
    }
}
