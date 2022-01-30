package cigma.repositories;

import cigma.models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class ClientRepository implements IClientRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Client save(Client c) {
        em.persist(c);
        return null;
    }

    @Override
    public Client update(Client c) {
        em.merge(c);
        return null;
    }

    @Override
    public Client delete(long id) {
        String hql = "delete " + Client.class.getName() + " where id = :id";
        Query query = em.createQuery(hql).setParameter("id", id);
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
