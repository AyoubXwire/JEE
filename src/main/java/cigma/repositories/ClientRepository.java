package cigma.repositories;

import cigma.models.Client;

public class ClientRepository implements IClientRepository {

    public ClientRepository() {
        System.out.println("ClientRepository instanciated");
    }

    @Override
    public Client save(Client c) {
        System.out.println("DAO Layer : ClientRepository Level");
        return null;
    }
}
