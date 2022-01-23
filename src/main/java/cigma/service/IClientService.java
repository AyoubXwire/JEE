package cigma.service;

import cigma.models.Client;

public interface IClientService {

    Client save(Client c);
    Client update(Client c);
    Client delete(long id);
    Client find(long id);
    Client findAll();
}
