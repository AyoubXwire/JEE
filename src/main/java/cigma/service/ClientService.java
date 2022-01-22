package cigma.service;

import cigma.models.Client;
import cigma.repositories.ClientRepository;

public class ClientService implements IClientService {

    ClientRepository clientRepository = new ClientRepository();

    @Override
    public Client save(Client c) {
        System.out.println("Service Layer : ClientService Level... ");
        return clientRepository.save(c);
    }
}
