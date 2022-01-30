package cigma.service;

import cigma.models.Client;
import cigma.repositories.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ClientService implements IClientService {

    @Autowired
    private IClientRepository clientRepository;

    @Override
    @Transactional
    public Client save(Client c) {
        return clientRepository.save(c);
    }

    @Override
    @Transactional
    public Client update(Client c) {
        return clientRepository.update(c);
    }

    @Override
    @Transactional
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
