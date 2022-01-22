package cigma.repositories;

import cigma.models.Client;

public class ClientRepository implements IClientRepository {

    @Override
    public Client save(Client c) {
        System.out.println("DAO Layer : ClientRepository Level");
        return null;
    }
}
