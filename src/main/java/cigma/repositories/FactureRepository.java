package cigma.repositories;

import cigma.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FactureRepository implements IFactureRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();

    public FactureRepository() {
        System.out.println("FactureRepository..");
    }

    @Override
    public Facture save(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Facture update(Facture f) {
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Facture delete(long id) {
        em.getTransaction().begin();
        String hql = "delete " + Facture.class.getName() + " where id = :id";
        Query query = em.createQuery(hql).setParameter("id", id);
        query.executeUpdate();
        return null;
    }

    @Override
    public Facture find(long id) {
        return em.find(Facture.class, id);
    }

    @Override
    public Facture findAll() {
        Query query = em.createQuery("SELECT * FROM factures");
        return (Facture) query.getResultList();
    }
}
