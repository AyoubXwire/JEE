package cigma.service;

import cigma.models.Client;
import cigma.repositories.IClientRepository;

public class ClientService implements IClientService {

    IClientRepository clientRepository;

    public void setClientRepository(IClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientService() {
        System.out.println("ClientService..");
    }

    @Override
    public Client save(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client update(Client c) {
        return clientRepository.update(c);
    }

    @Override
    public Client delete(long id) {
        return clientRepository.delete(id);
    }

    @Override
    public Client find(long id) {
        return clientRepository.find(id);
    }

    @Override
    public Client findAll() {
        return clientRepository.findAll();
    }
}
