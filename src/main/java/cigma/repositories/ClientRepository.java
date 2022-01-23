package cigma.repositories;

import cigma.models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClientRepository implements IClientRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();

    public ClientRepository() {
        System.out.println("ClientRepository..");
    }

    @Override
    public Client save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Client update(Client c) {
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Client delete(long id) {
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class, id);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Client find(long id) {
        return em.find(Client.class, id);
    }

    @Override
    public Client findAll() {
        Query query = em.createQuery("SELECT * FROM clients");
        return (Client) query.getResultList();
    }
}
