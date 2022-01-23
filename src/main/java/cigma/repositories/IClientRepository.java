package cigma.repositories;

import cigma.models.Client;

public interface IClientRepository {

    Client save(Client c);
    Client update(Client c);
    Client delete(long id);
    Client find(long id);
    Client findAll();
}